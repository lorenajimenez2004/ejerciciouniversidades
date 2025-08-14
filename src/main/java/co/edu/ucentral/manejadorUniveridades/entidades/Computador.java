package co.edu.ucentral.manejadorUniveridades.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "computadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Computador {
    @Id
    private long Serial;

    private String procesador;
    private String memoria;
    private String pantalla;
    private String sistemaOperativo;
}
