package co.edu.ucentral.manejadorUniveridades.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "universidades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Universidad {
    @Id
    private long codigo;

    private String nombre;
    private String direccion;
    private String urlWeb;

}
