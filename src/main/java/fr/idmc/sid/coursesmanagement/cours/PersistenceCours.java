package fr.idmc.sid.coursesmanagement.cours;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PersistenceCours extends JpaRepository<Cours, String> {

    List<Cours> findByEtudiants_UsernameLikeAndDateJourBetween(String username, LocalDateTime dateJourStart, LocalDateTime dateJourEnd);



}
