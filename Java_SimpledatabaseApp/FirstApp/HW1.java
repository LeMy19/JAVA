import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HW1{ // One transaction
	Connection  connection;
	Statement statement;
	
	public HW1(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection=DriverManager.getConnection("jdbc:mysql://localhost/HW1_1015087", "root", "1005");
		} catch (Exception e){
			System.err.println("Unable to find and load driver");
			System.exit(1);
		}        
	}
	
	public void doWork1(){
		try{
			 connection.setAutoCommit(false);
			 statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			 ResultSet rs=statement.executeQuery("SELECT * FROM Movie");
			 
			 System.out.println();
			 System.out.println("=== Movie ===");
			 while(rs.next()){
				 int mid=rs.getInt("MovieID");
				 String title=rs.getString("Title");
				 int tid=rs.getInt("TypeID");
				 String date=rs.getString("ReleaseDate");
				 int pid=rs.getInt("ProductionID");
				 System.out.println(mid+ "  " + title + "  " + tid + "  " + date + "  "+ pid);
				 
			 }
			 
			connection.commit();
			connection.setAutoCommit(true);
		    	
		} catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork2(){
		try{
			 connection.setAutoCommit(false);
			 statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			 ResultSet rs=statement.executeQuery("SELECT * FROM Production");
			 
			 System.out.println();
			 System.out.println("=== Production ===");
			 while(rs.next()){
				 int id=rs.getInt("ProductionID");
				 String name=rs.getString("Name");
				 String location=rs.getString("Location");
				 String tel=rs.getString("Tel");
				 System.out.println(id+ "  " + name + "  " + location + "  " + tel);
				 
			 }
			 
			connection.commit();
			connection.setAutoCommit(true);
		    	
		} catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork3(){
		try{
			 connection.setAutoCommit(false);
			 statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			 ResultSet rs=statement.executeQuery("SELECT * FROM Type");
			 
			 System.out.println();
			 System.out.println("=== Type ===");
			 while(rs.next()){
				 int tid=rs.getInt("TypeID");
				 String name=rs.getString("Name");
				 System.out.println(tid+ "  " + name);
				 
			 }
			 
			    connection.commit();
				connection.setAutoCommit(true);
			    	
			} catch(Exception e){
				try{
					connection.rollback();
				} catch(SQLException error){
				}
				e.printStackTrace();
			}finally{
				if(statement!=null){
					try{
						statement.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		}
	
	public void doWork4(){
		try{
				 connection.setAutoCommit(false);
				 statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				 ResultSet rs=statement.executeQuery("SELECT * FROM Rank");
				 
				 System.out.println();
				 System.out.println("=== Rank ===");
				 while(rs.next()){
					 int rid=rs.getInt("RankID");
					 int mid=rs.getInt("MovieID");
					 int rank=rs.getInt("Rank");
					 System.out.println(rid+ "  " + mid + "  " + rank);
					 
				 }
				 
				    connection.commit();
					connection.setAutoCommit(true);
				    	
				} catch(Exception e){
					try{
						connection.rollback();
					} catch(SQLException error){
					}
					e.printStackTrace();
				}finally{
					if(statement!=null){
						try{
							statement.close();
						}catch(SQLException e){
							e.printStackTrace();
						}
					}
				}
			}
	
	public void doWork5(){
		doWork1();
		doWork2();
		doWork3();
		doWork4();
	}
	
	public void doWork6(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT M.Title, M.ReleaseDate, P.Name FROM Movie M, Production P, Rank R WHERE M.MovieID=R.MovieID AND M.ProductionID=P.ProductionID";
			ResultSet rs=statement.executeQuery(query);
			
		    System.out.println();
			System.out.println("=== Result ===");
			while(rs.next()){
				String title=rs.getString("Title");
				String date=rs.getString("ReleaseDate");
				String pname=rs.getString("Name");
				
				System.out.println(title + "  " + date + "  " + pname);
			}
			connection.commit();
			connection.setAutoCommit(true);
		    	
		} catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork7(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT M.Title, P.Name, P.Location, P.Tel FROM Movie M, Production P WHERE M.ProductionID=P.ProductionID";
			ResultSet rs=statement.executeQuery(query);
			
			System.out.println();
			System.out.println("=== Result ===");
			while(rs.next()){
				String title=rs.getString("Title");
				String pname=rs.getString("Name");
				String location=rs.getString("Location");
				String tel=rs.getString("Tel");
				
				System.out.println(title + "  " + pname + "  " + location + "  " + tel);
			}
			connection.commit();
			connection.setAutoCommit(true);
		    	
		} catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork8_Love(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT AVG(Rank) avg FROM Movie M JOIN Rank R ON M.MovieID=R.MovieID WHERE M.TypeID='1';";
			ResultSet rs=statement.executeQuery(query);
			
			System.out.println();
			System.out.println("=== Average Rank of Love movie ===");
			while(rs.next()){
				System.out.println(rs.getDouble("avg"));
			}
			connection.commit();
			connection.setAutoCommit(true);
		}catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork8_Action(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT AVG(Rank) avg FROM Movie M JOIN Rank R ON M.MovieID=R.MovieID WHERE M.TypeID='2';";
			ResultSet rs=statement.executeQuery(query);
			
			System.out.println();
			System.out.println("=== Average Rank of Action movie ===");
			while(rs.next()){
				System.out.println(rs.getDouble("avg"));
			}
			connection.commit();
			connection.setAutoCommit(true);
		}catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork8_Horror(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT AVG(Rank) avg FROM Movie M JOIN Rank R ON M.MovieID=R.MovieID WHERE M.TypeID='3';";
			ResultSet rs=statement.executeQuery(query);
			
			System.out.println();
			System.out.println("=== Average Rank of Horror movie ===");
			while(rs.next()){
				System.out.println(rs.getDouble("avg"));
			}
			connection.commit();
			connection.setAutoCommit(true);
		}catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork8_Comedy(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT AVG(Rank) avg FROM Movie M JOIN Rank R ON M.MovieID=R.MovieID WHERE M.TypeID='4';";
			ResultSet rs=statement.executeQuery(query);
			
			System.out.println();
			System.out.println("=== Average Rank of Comedy movie ===");
			while(rs.next()){
				System.out.println(rs.getDouble("avg"));
			}
			connection.commit();
			connection.setAutoCommit(true);
		}catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public void doWork8_SF(){
		try{
			connection.setAutoCommit(false);
			statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			String query="SELECT AVG(Rank) avg FROM Movie M JOIN Rank R ON M.MovieID=R.MovieID WHERE M.TypeID='5';";
			ResultSet rs=statement.executeQuery(query);
			
			System.out.println();
			System.out.println("=== Average Rank of Science Fiction movie ===");
			while(rs.next()){
				System.out.println(rs.getDouble("avg"));
			}
			connection.commit();
			connection.setAutoCommit(true);
		}catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
	

	public void doWork12(){
		try{
			System.out.println("The Program Ends!!!");
			connection.close();
		}catch(Exception e){
			try{
				connection.rollback();
			} catch(SQLException error){
			}
			e.printStackTrace();
	}
	}
}
	