package br.com.agibank.starwars.service;


import br.com.agibank.starwars.controller.request.PlanetRequest;
import br.com.agibank.starwars.controller.response.PlanetResponse;
import br.com.agibank.starwars.mapper.PlanetMapper;
import br.com.agibank.starwars.model.Planet;
import br.com.agibank.starwars.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanetService {

    @Autowired
    private PlanetRepository planetRepository;
    public List<PlanetResponse> getPlanets(){
        return planetRepository.findAll()
                .stream()
                .map(planetModel -> PlanetMapper.of(planetModel))
                .collect(Collectors.toList());
    }

    public PlanetResponse savePlanet(PlanetRequest request) {
        Planet planet = PlanetMapper.of(request);

         Planet planetSaved = planetRepository.save(planet);

         return PlanetMapper.of(planetSaved);
    }
}
