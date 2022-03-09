

INSERT INTO Etudiant (username) VALUES ('Noirot');

INSERT INTO Cours (uuid, nom,prof,num_salle,date_jour) VALUES (1,'Informatique','Rodislav','227','2022-03-11 09:00:00');
INSERT INTO Cours (uuid, nom,prof,num_salle,date_jour) VALUES (2,'Informatique','Rodislav','227','2022-03-11 11:00:00');
INSERT INTO Cours (uuid, nom,prof,num_salle,date_jour) VALUES (3,'Informatique','Rodislav','227','2022-03-18 11:00:00');

INSERT INTO Etudiants_Cours(cours_uuid,etudiant_username) VALUES (1,'Noirot');
INSERT INTO Etudiants_Cours(cours_uuid,etudiant_username) VALUES (2,'Noirot');
INSERT INTO Etudiants_Cours(cours_uuid,etudiant_username) VALUES (3,'Noirot');