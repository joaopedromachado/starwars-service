package br.com.agibank.starwars.controller;

import br.com.agibank.starwars.dto.CarroDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/v1/cars")
public class CarroController {

    public static final List<CarroDto> CARRO_DTOS = List.of(
            new CarroDto("Toyota", "Corolla", 2000),
            new CarroDto("Mitsubishe", "Lancer", 2020),
            new CarroDto("Mustang", "NaoSei", 2010)
    );

    @GetMapping
    public List<CarroDto> getAllCars1() {
        return CARRO_DTOS;
    }

    @GetMapping("{nome}")
    public CarroDto getAllCars(@PathVariable("nome") String nomeCarro) {
        return CARRO_DTOS.stream()
                .filter(carroDto -> carroDto.getMarca().equals(nomeCarro))
                .findFirst()
                .orElseThrow();
    }

}
