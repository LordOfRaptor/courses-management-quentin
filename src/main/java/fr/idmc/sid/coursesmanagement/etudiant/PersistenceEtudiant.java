package fr.idmc.sid.coursesmanagement.etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersistenceEtudiant extends JpaRepository<Etudiant, String> {
}
