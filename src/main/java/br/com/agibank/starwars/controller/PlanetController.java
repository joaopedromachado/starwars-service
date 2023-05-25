package br.com.agibank.starwars.controller;

import br.com.agibank.starwars.controller.request.PlanetRequest;
import br.com.agibank.starwars.controller.request.PlanetUpdateRequest;
import br.com.agibank.starwars.controller.response.PlanetResponse;
import br.com.agibank.starwars.service.PlanetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
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

    @GetMapping("{id}")
    public PlanetResponse getPlanetById(@PathVariable("id") String id) {
        return planetService.getPlanetById(id);
    }

    @PostMapping
    public ResponseEntity<PlanetResponse> savePlanet(@RequestBody @Validated PlanetRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(planetService.savePlanet(request));
    }

    @DeleteMapping("{id}")
    public void deletePlanetById(@PathVariable("id") String id) {
        planetService.deletePlanetById(id);
    }

    @PutMapping("{id}")
    public PlanetResponse updatePlanetById(@PathVariable("id") String id, @Validated @RequestBody PlanetUpdateRequest request){
        return planetService.updatePlanetById(id, request);
    }

}
