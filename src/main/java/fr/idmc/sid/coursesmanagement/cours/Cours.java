package fr.idmc.sid.coursesmanagement.cours;

import com.fasterxml.jackson.annotation.JsonFormat;
import fr.idmc.sid.coursesmanagement.etudiant.Etudiant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cours {

    @Id
    String uuid;

    @ManyToMany
    @JoinTable(
            name = "Etudiants_Cours",
            joinColumns = @JoinColumn(name = "cours_uuid"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_username"))
    Set<Etudiant> etudiants;

    String nom;

    String prof;

    @Column(name = "num_salle")
    String numSalle;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "date_jour")
    LocalDateTime dateJour;
}
