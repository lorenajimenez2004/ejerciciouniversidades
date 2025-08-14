package co.edu.ucentral.manejadorUniveridades.servicios;

import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import co.edu.ucentral.manejadorUniveridades.repositorios.RepositorioUniversidad;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServicioUniversidades {
    @Autowired
    private RepositorioUniversidad repositorioUniversidad;

    public void registrar(Universidad universidad){
        this.repositorioUniversidad.save(universidad);
    }
    public List<Universidad> consultarTodos(){
        return this.repositorioUniversidad.findAll();
    }
}
