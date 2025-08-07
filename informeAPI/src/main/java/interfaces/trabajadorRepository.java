package interfaces;

import classes.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface trabajadorRepository extends JpaRepository<Trabajador, Long> {

}

