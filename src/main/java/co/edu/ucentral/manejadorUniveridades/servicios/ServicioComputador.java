package co.edu.ucentral.manejadorUniveridades.servicios;

import co.edu.ucentral.manejadorUniveridades.entidades.Computador;
import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import co.edu.ucentral.manejadorUniveridades.repositorios.RepositorioComputador;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class ServicioComputador {
    @Autowired
    private RepositorioComputador repositorioComputador;


    public void registrar(Computador computador){
        this.repositorioComputador.save(computador);
    }
    public void actualizar(Computador computador) {
        if (repositorioComputador.existsById(computador.getSerial())) {
            repositorioComputador.save(computador);
        } else {
            throw new RuntimeException("El computador con ID " + computador.getSerial() + " no existe.");
        }
    }
    public void borrar(Long id) {
        this.repositorioComputador.deleteById(id);
    }

    public List<Computador> consultarTodos(){
        return this.repositorioComputador.findAll();
    }
}
