package co.edu.ucentral.manejadorUniveridades.controladores;

import co.edu.ucentral.manejadorUniveridades.entidades.Universidad;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioUniversidades;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/universidades")
public class ControladorUniversidad {
    @Autowired
    private ServicioUniversidades servicioUniversidades;

    @PostMapping("/")
    public void crear(@RequestBody  Universidad universidad){
        this.servicioUniversidades.registrar(universidad);
    }
    @GetMapping("/")
    public List<Universidad> consultar(){
        return this.servicioUniversidades.consultarTodos();

    }
}
