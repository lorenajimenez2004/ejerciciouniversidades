package co.edu.ucentral.manejadorUniveridades.controladores;

import co.edu.ucentral.manejadorUniveridades.entidades.Computador;
import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioComputador;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioUniversidades;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/computadores")

public class ControladorComputador {
    @Autowired
    private ServicioComputador servicioComputador;

    @PostMapping("/")
    public void crear(@RequestBody Computador computador){
        this.servicioComputador.registrar(computador);
    }
    @GetMapping("/")
    public List<Computador> consultar(){
        return this.servicioComputador.consultarTodos();

    }
    @PutMapping("/")
    public void actualizar(@PathVariable Long id, @RequestBody Computador computador) {
        computador.setSerial(id);
        this.servicioComputador.actualizar(computador);
    }

    @DeleteMapping("/")
    public void borrar(@PathVariable Long id) {
        this.servicioComputador.borrar(id);
    }

}
