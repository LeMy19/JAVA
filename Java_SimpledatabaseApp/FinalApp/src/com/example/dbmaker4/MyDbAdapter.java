package com.example.dbmaker4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDbAdapter {


    public static final String KEY_ROWID = "_id";
    public static final String KEY_TYPE = "type_index";
    public static final String KEY_NAME = "name";
    public static final String KEY_TEL = "tel";
    public static final String KEY_PRICE = "mini_price";
    
    public static final String DATABASE_TABLE = "foodlist";
    private static final String DATABASE_NAME = "foodlist.sqlite";
    private static final int DATABASE_VERSION = 1;

    private static final String TAG = "MyDbAdapter";
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;
    
    /**
     * Database creation sql statement
     */
    private static final String DATABASE_CREATE =
            "create table " + DATABASE_TABLE + " (_id integer primary key autoincrement, "
                    + KEY_TYPE + " integer not null, " + KEY_NAME + " text not null, "
                    + KEY_TEL + " text not null, " + KEY_PRICE + " integer not null);";

    private static final String DATABASE_DROP =
    	"DROP TABLE IF EXISTS " + DATABASE_TABLE;
    
    
    private final Context mCtx;

    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS users");
            onCreate(db);
        }
    }

    /**
     * Constructor - takes the context to allow the database to be
     * opened/created
     * 
     * @param ctx the Context within which to work
     */
    public MyDbAdapter(Context ctx) {
        this.mCtx = ctx;
    }

    /**
     * Open the notes database. If it cannot be opened, try to create a new
     * instance of the database. If it cannot be created, throw an exception to
     * signal the failure
     * 
     * @return this (self reference, allowing this to be chained in an
     *         initialization call)
     * @throws SQLException if the database could be neither opened or created
     */
    public MyDbAdapter open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
        mDb = mDbHelper.getWritableDatabase();
        return this;
    }
    
    public void close() {
        mDbHelper.close();
    }


    /**
     * Create a new note using the title and body provided. If the note is
     * successfully created return the new rowId for that note, otherwise return
     * a -1 to indicate failure.
     * 
     * @param product the title of the note
     * @param waybill the body of the note
     * @return rowId or -1 if failed
     */
    public long createNote(String type_index, String name, String tel, String mini_price) {
        ContentValues initialValues = new ContentValues();
        
        initialValues.put(KEY_TYPE, type_index);
        initialValues.put(KEY_NAME, name);
        initialValues.put(KEY_TEL, tel);
        initialValues.put(KEY_PRICE, mini_price);

        return mDb.insert(DATABASE_TABLE, null, initialValues);
    }

    /**
     * Delete the note with the given rowId
     * 
     * @param rowId id of note to delete
     * @return true if deleted, false otherwise
     */
    
    public boolean deleteNote(long rowId) {

        return mDb.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
    }
    
    public boolean deleteNote(String mini_price) {

        return mDb.delete(DATABASE_TABLE, KEY_ROWID + "=" +
        		"(SELECT _id from " + DATABASE_TABLE + " where " + KEY_PRICE + "='" 
        		+ mini_price + "')", null) > 0;
    }
    
    /*public void deleteNote(String date)
    {
    	String sql = "DELETE FROM notes WHERE _id = "
    		+ "(SELECT _id from notes where date='"
    		+ date +"')";
    	mDb.execSQL(sql);
    }*/
    public void deleteNote()
    {
    	String sql = "DELETE FROM " + DATABASE_TABLE + " WHERE _id = "
    		+ "(select MAX(_id) from " + DATABASE_TABLE + ")";
    	mDb.execSQL(sql);
    }
    
    /**
     * Return a Cursor over the list of all notes in the database
     * 
     * @return Cursor over all notes
     */
    public Cursor fetchAllNotes() {

        return mDb.query(DATABASE_TABLE, new String[] {KEY_ROWID, KEY_TYPE,
                KEY_NAME, KEY_TEL, KEY_PRICE}, null, null, null, 
                null, null);
    }

    /**
     * Return a Cursor positioned at the note that matches the given rowId
     * 
     * @param rowId id of note to retrieve
     * @return Cursor positioned to matching note, if found
     * @throws SQLException if note could not be found/retrieved
     */
    public Cursor fetchNote(long rowId) throws SQLException {

        Cursor mCursor =

                mDb.query(true, DATABASE_TABLE, new String[] {KEY_ROWID, KEY_TYPE,
                        KEY_NAME, KEY_TEL, KEY_PRICE}, 
                        KEY_ROWID + "=" + rowId, null, null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;

    }

    /**
     * Update the note using the details provided. The note to be updated is
     * specified using the rowId, and it is altered to use the title and body
     * values passed in
     * 
     * @param rowId id of note to update
     * @param title value to set note title to
     * @param body value to set note body to
     * @return true if the note was successfully updated, false otherwise
     */
    public boolean updateNote(long rowID, String type_index, String name, String tel,
    		String price) {
        ContentValues args = new ContentValues();
        args.put(KEY_TYPE, type_index);
        args.put(KEY_NAME, name);
        args.put(KEY_TEL, tel);
        args.put(KEY_PRICE, price);

        return mDb.update(DATABASE_TABLE, args, KEY_ROWID + "=" +
        	rowID, null) > 0;
    }
    
    public boolean updateNote(String type_index, String name, String tel, String mini_price) {
        ContentValues args = new ContentValues();
        args.put(KEY_TYPE, type_index);
        args.put(KEY_NAME, name);
        args.put(KEY_TEL, tel);
        args.put(KEY_PRICE, mini_price);

        return mDb.update(DATABASE_TABLE, args, KEY_ROWID + "=" +
        		"(SELECT _id from " + DATABASE_TABLE + " where " + KEY_PRICE + "='" 
        		+ mini_price + "')", null) > 0;
    }
    
    public void dropTable()
    {
    	mDb.execSQL(DATABASE_DROP);
    }
    
    public void createTable()
    {
    	mDb.execSQL(DATABASE_CREATE);
    }
}
