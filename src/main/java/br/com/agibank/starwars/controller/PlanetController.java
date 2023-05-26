package br.com.agibank.starwars.controller;

import br.com.agibank.starwars.controller.request.PlanetRequest;
import br.com.agibank.starwars.controller.request.PlanetUpdateRequest;
import br.com.agibank.starwars.controller.response.PlanetResponse;
import br.com.agibank.starwars.service.PlanetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Gerenciamento de planetas", description = "Requisições de GET, PUT, POST, DELETE relacionadas aos planetas da API Starwars")
@Slf4j
@Controller
@RestController
@RequestMapping("/v1/planets")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @ApiOperation(value = "Obter todas as massas de planetas")
    @GetMapping
    public List<PlanetResponse> getPlanets(){
        return planetService.getPlanets();
    }

    @ApiOperation(value = "Obter planetas por ID")
    @GetMapping("{id}")
    public PlanetResponse getPlanetById(@ApiParam(value = "Faz uma requisição no banco de dados para retornar apenas um planeta", required = true) @PathVariable("id") String id) {
        return planetService.getPlanetById(id);
    }

    @ApiOperation(value = "Salvar os planetas no banco de dados")
    @PostMapping
    public ResponseEntity<PlanetResponse> savePlanet(@ApiParam(value = "Salva o request que iremos receber em formato json e salva no banco", required = true)@RequestBody @Validated PlanetRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(planetService.savePlanet(request));
    }

    @ApiOperation(value = "Deletar os planetas no banco de dados por um identificador")
    @DeleteMapping("{id}")
    public void deletePlanetById(@ApiParam(value = "Esse método irá enviar o ID pelo qual irá deletar um planeta no banco", required = true) @PathVariable("id") String id) {
        planetService.deletePlanetById(id);
    }

    @ApiOperation(value = "Alterar os dados por um identificador")
    @PutMapping("{id}")
    public PlanetResponse updatePlanetById(@ApiParam(value = "Resposta que iremos enviar para o banco dar um update", required = true) @PathVariable("id") String id, @Validated @RequestBody PlanetUpdateRequest request){
        return planetService.updatePlanetById(id, request);
    }

}
