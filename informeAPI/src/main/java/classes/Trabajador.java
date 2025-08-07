package classes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

//Marca como entidad persistente-> instancias se pueden guardar, recuperar, actualizar o eliminar de la BD.
@Entity
public class Trabajador {
    // Define como primary key a rut
    @Id
    private String rut;

    private String primerNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private int edad;

    @OneToMany(mappedBy = "trabajador", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Dispositivo> dispositivosTrabajador;
}
