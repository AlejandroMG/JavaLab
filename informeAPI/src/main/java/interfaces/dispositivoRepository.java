package interfaces;

import classes.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface dispositivoRepository extends JpaRepository<Dispositivo, Long> {
}
