package fr.idmc.sid.coursesmanagement.etudiant;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Etudiant")
@AllArgsConstructor
public class ControllerEtudiant {

    private final PersistenceEtudiant persistenceEtudiant;

    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getEtudiant(@PathVariable String id){
        return ResponseEntity.ok(persistenceEtudiant.findById(id).get());
    }
}
