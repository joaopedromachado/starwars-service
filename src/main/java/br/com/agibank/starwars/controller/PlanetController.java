package br.com.agibank.starwars.controller;

import br.com.agibank.starwars.controller.request.PlanetRequest;
import br.com.agibank.starwars.controller.response.PlanetResponse;
import br.com.agibank.starwars.service.PlanetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RestController
@RequestMapping("/v1/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping
    public List<PlanetResponse> getPlanets(){
        return planetService.getPlanets();
    }

    @PostMapping
    public PlanetResponse savePlanet(@RequestBody PlanetRequest request){ // Pegar o conteudo do request, pegar os valores mapeados no PlanetReqeust
        return planetService.savePlanet(request);
    }
}
