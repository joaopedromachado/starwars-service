package br.com.agibank.starwars.service;


import br.com.agibank.starwars.controller.request.PlanetRequest;
import br.com.agibank.starwars.controller.request.PlanetUpdateRequest;
import br.com.agibank.starwars.controller.response.PlanetResponse;
import br.com.agibank.starwars.mapper.PlanetMapperMS;
import br.com.agibank.starwars.model.Planet;
import br.com.agibank.starwars.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanetService {

    @Autowired
    private PlanetRepository planetRepository;
    public List<PlanetResponse> getPlanets(){
        return planetRepository.findAll()
                .stream()
                .map(planetModel -> PlanetMapperMS.INSTANCE.planetToResponse(planetModel))
                .collect(Collectors.toList());
    }

    public PlanetResponse savePlanet(PlanetRequest request) {
        Planet planet = PlanetMapperMS.INSTANCE.requestToPlanet(request);

         Planet planetSaved = planetRepository.save(planet);

         return PlanetMapperMS.INSTANCE.planetToResponse(planetSaved);
    }

    public PlanetResponse getPlanetById(String id) {
        Planet planet = planetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nao encontrei o planeta que voce esta buscando."));

        return PlanetMapperMS.INSTANCE.planetToResponse(planet);
    }

    public void deletePlanetById(String id) {
        planetRepository.deleteById(id);
    }

    public PlanetResponse updatePlanetById(String id, PlanetUpdateRequest request) {
        Planet planet = planetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi encontrado"));

        planet.setName(request.getName());
        planet.setEdited(LocalDateTime.now());

        Planet planetUpdated = planetRepository.save(planet);

        return PlanetMapperMS.INSTANCE.planetToResponse(planetUpdated);
    }


}
