package co.edu.ucentral.manejadorUniveridades.repositorios;

import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUniversidad extends JpaRepository<Universidad, Long> {
}
