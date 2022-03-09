package fr.idmc.sid.coursesmanagement.cours;

import fr.idmc.sid.coursesmanagement.auth.WebSecurityConfig;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/Cours")
@AllArgsConstructor
public class ControllerCours {

    private final PersistenceCours persistenceCours;
    private final WebSecurityConfig webSecurityConfig;
    private final Logger LOGGER = Logger.getLogger(ControllerCours.class.getName());

    @GetMapping("/{id}")
    @RolesAllowed("ROLE_USER")
    public ResponseEntity<Cours> getCours(@PathVariable String id){
        return ResponseEntity.ok(persistenceCours.findById(id).get());
    }

    @GetMapping("/today")
    @RolesAllowed("ROLE_USER")
    public ResponseEntity<List<Cours>> getCoursToday(){
        return ResponseEntity.ok(persistenceCours.findByEtudiants_UsernameLikeAndDateJourBetween(webSecurityConfig.getUserDetailsService(), LocalDateTime.now(),LocalDateTime.now().plusDays(7)));
    }
}
