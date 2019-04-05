BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "superheroes" (
	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"name"	TEXT,
	"power"	INTEGER,
	"gender"	TEXT,
	"superheroes_id"	INTEGER
);
CREATE TABLE IF NOT EXISTS "details" (
	"id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"age"	INTEGER,
	"country"	TEXT,
	"superheroes_id"	INTEGER
);
INSERT INTO "superheroes" VALUES (1,'Superman',100,'M',1);
INSERT INTO "superheroes" VALUES (2,'Spiderman',85,'M',2);
INSERT INTO "superheroes" VALUES (3,'Wonderwoman',90,'F',3);
INSERT INTO "superheroes" VALUES (4,'Thor',95,'M',4);
INSERT INTO "superheroes" VALUES (5,'Black Panther',80,'M',5);
INSERT INTO "superheroes" VALUES (6,'Batman',92,'M',6);
INSERT INTO "superheroes" VALUES (7,'Cat',75,'F',7);
INSERT INTO "superheroes" VALUES (8,'Invisible Woman',92,'F',8);
INSERT INTO "superheroes" VALUES (9,'Iron Man',97,'M',9);
INSERT INTO "superheroes" VALUES (10,'Hulk',85,'M',10);
INSERT INTO "superheroes" VALUES (11,'Aquaman',75,'M',11);
INSERT INTO "details" VALUES (1,45,'USA',1);
INSERT INTO "details" VALUES (2,54,'Mongolia',2);
INSERT INTO "details" VALUES (3,23,'Korea',3);
INSERT INTO "details" VALUES (4,54,'USA',4);
INSERT INTO "details" VALUES (5,80,'Japan',5);
INSERT INTO "details" VALUES (6,23,'USA',6);
INSERT INTO "details" VALUES (7,20,'Mongolia',7);
INSERT INTO "details" VALUES (8,77,'China',8);
INSERT INTO "details" VALUES (9,54,'Korea',9);
INSERT INTO "details" VALUES (10,44,'USA',10);
INSERT INTO "details" VALUES (11,75,'China',11);
COMMIT;
