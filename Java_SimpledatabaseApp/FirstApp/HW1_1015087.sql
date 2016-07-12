create table Type(
TypeID int(2) not null primary key,
Name char(20)
);

insert into Type values(
'01',
'Love'
);

insert into Type values(
'02',
'Action'
);

insert into Type values(
'03',
'Horror'
);

insert into Type values(
'04',
'Comedy'
);

insert into Type values(
'05',
'Science Fiction'
);




create table Production(
ProductionID int(2) not null primary key,
Name char(25),
Location char(25),
Tel int(15)
);

insert into Production  values(
'01',
'CJ Entertainment',
'Seoul, Korea',
'0223740000'
);

insert into Production  values(
'02',
'ShowBox',
'Seoul, Korea',
'0212345678'
);

insert into Production  values(
'03',
'Universal Studio',
'Hollywood, USA',
'1234563059'
);

insert into Production  values(
'04',
'Walt Disney',
'California, USA',
'0734283954'
);

insert into Production  values(
'05',
'SooFilm',
'Seoul, Korea',
'0234578693'
);




create table Movie(
MovieID int(2) not null primary key,
Title char(35), INDEX(Title),
TypeID int(2) not null,
ReleaseDate date,
ProductionID int(2) not null,
FOREIGN KEY(TypeID) REFERENCES Type(TypeID)
ON DELETE CASCADE,
FOREIGN KEY(ProductionID) REFERENCES Production(ProductionID)
ON DELETE CASCADE
);

insert into Movie values(
'01',
'Typhoon',
'02',
'2005-12-14',
'01'
);

insert into Movie values(
'02',
'Kind Miss Geumja',
'03',
'2005-07-29',
'01'
);

insert into Movie values(
'03',
'Finding Nemo',
'04',
'2003-06-06',
'04'
);

insert into Movie values(
'04',
'Harry Potter',
'05',
'2011-07-13',
'03'
);

insert into Movie values(
'05',
'Beauty and Beast',
'01',
'1991-11-04',
'01'
);

insert into Movie values(
'06',
'Old Boy',
'03',
'2003-11-21',
'01'
);

insert into Movie values(
'07',
'Kitchen',
'01',
'2009-02-05',
'05'
);

insert into Movie values(
'08',
'Forest Gump',
'02',
'1994-10-15',
'03'
);

insert into Movie values(
'09',
'The Employee',
'02',
'2012-10-11',
'02'
);

insert into Movie values(
'10',
'Finding Kim Jong Uk',
'01',
'2010-12-08',
'05'
);

insert into Movie values(
'11',
'Everything about my wife',
'02',
'2005-12-14',
'01'
);

insert into Movie values(
'12',
'The best week in my life',
'01',
'2005-10-07',
'05'
);

insert into Movie values(
'13',
'Horrible Story',
'03',
'2012-07-25',
'05'
);

insert into Movie values(
'14',
'E.T',
'05',
'2011-08-11',
'03'
);

insert into Movie values(
'15',
'Pirates Of The Caribbean',
'04',
'2007-05-23',
'04'
);

insert into Movie values(
'16',
'Wonderful Radio',
'01',
'2012-01-05',
'02'
);

insert into Movie values(
'17',
'Thieves',
'02',
'2010-07-25',
'02'
);

insert into Movie values(
'18',
'Mulan',
'01',
'1998-07-25',
'04'
);

insert into Movie values(
'19',
'Runway Cop',
'04',
'2012-05-30',
'01'
);

insert into Movie values(
'20',
'I am the Killer',
'01',
'2012-11-27',
'05'
);



create table Rank(
RankID int(2) not null primary key,
MovieID int(2) not null,
Rank int(2), INDEX(Rank),
FOREIGN KEY(MovieID) REFERENCES Movie(MovieID)
ON DELETE CASCADE
);

insert into Rank values(
'01',
'01',
'01'
);

insert into Rank values(
'02',
'03',
'02'
);

insert into Rank values(
'03',
'04',
'03'
);

insert into Rank values(
'04',
'18',
'04'
);

insert into Rank values(
'05',
'02',
'05'
);

insert into Rank values(
'06',
'09',
'06'
);

insert into Rank values(
'07',
'08',
'07'
);

insert into Rank values(
'08',
'15',
'08'
);

insert into Rank values(
'09',
'05',
'09'
);

insert into Rank values(
'10',
'06',
'10'
);

insert into Rank values(
'11',
'07',
'11'
);

insert into Rank values(
'12',
'10',
'12'
);

insert into Rank values(
'13',
'17',
'13'
);

insert into Rank values(
'14',
'13',
'14'
);

insert into Rank values(
'15',
'14',
'15'
);

insert into Rank values(
'16',
'19',
'16'
);

insert into Rank values(
'17',
'12',
'17'
);

insert into Rank values(
'18',
'11',
'18'
);

insert into Rank values(
'19',
'16',
'19'
);

insert into Rank values(
'20',
'20',
'20'
);


SELECT * FROM Movie;

SELECT * FROM Production;

SELECT * FROM Type;

SELECT * FROM Rank;

SELECT M.Title, M.ReleaseDate, P.Name
FROM Movie M, Production P, Rank R
WHERE M.MovieID=R.MovieID AND M.ProductionID=P.ProductionID
;

SELECT M.Title, P.Name, P.Location, P.Tel
FROM Movie M, Production P
WHERE M.ProductionID=P.ProductionID
;

SELECT AVG(Rank) avg
FROM Movie M JOIN Rank R 
ON M.MovieID=R.MovieID
WHERE M.TypeID='1';

















