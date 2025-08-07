package classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public abstract class Dispositivo {
    @Id
    private int id;

    private String marca;
    private String modelo;
    private int valor;

    @ManyToOne
    @JoinColumn(name = "trabajador_id",nullable = true)
    private Trabajador trabajador;

    @Override
    public String toString() {
        return marca + " " + modelo + " " + valor;
    }
}
