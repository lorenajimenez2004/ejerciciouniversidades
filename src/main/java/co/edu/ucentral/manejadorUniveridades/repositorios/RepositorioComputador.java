package co.edu.ucentral.manejadorUniveridades.repositorios;

import co.edu.ucentral.manejadorUniveridades.entidades.Computador;
import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioComputador extends JpaRepository<Computador, Long> {
}
