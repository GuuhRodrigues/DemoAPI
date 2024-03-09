package com.example.demo.controler;

import com.example.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    Service service = new Service();

    @GetMapping("/marcas")
    public String consultarMarcas() {
        return service.consultarMarcas();
    }

    @GetMapping("/modelo/{marca}")
    public String consultarModelos(@PathVariable int marca) {
        return service.consultarMarcas();
    }

    @GetMapping("/anos/{marca}/{modelo}")
    public String consultarAnos(@PathVariable int marca, @PathVariable int modelo) {
        return service.consultarAnos(marca, modelo);
    }

    @GetMapping("/valor/{marca}/{modelo}/{ano}")
    public String consultarValor(@PathVariable int marca, @PathVariable int modelo, @PathVariable String ano) {
        return service.consultarValor(marca, modelo, ano);
    }
}