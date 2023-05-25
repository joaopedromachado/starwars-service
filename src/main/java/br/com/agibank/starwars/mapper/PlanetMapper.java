//package br.com.agibank.starwars.mapper;
//
//import br.com.agibank.starwars.controller.request.PlanetRequest;
//import br.com.agibank.starwars.controller.response.PlanetResponse;
//import br.com.agibank.starwars.model.Planet;
//
//public class PlanetMapper {
//    public static Planet of(PlanetRequest request) {
//        Planet planet = new Planet();
//
//        planet.setGravity(request.getGravity());
//        planet.setClimate(request.getClimate());
//        planet.setName(request.getName());
//        planet.setCreated(request.getCreated());
//        planet.setEdited(request.getEdited());
//        planet.setPopulation(request.getPopulation());
//        planet.setTerrain(request.getTerrain());
//        planet.setOrbitalPeriod(request.getOrbitalPeriod());
//        planet.setRotationPeriod(request.getRotationPeriod());
//        planet.setDiameter(request.getDiameter());
//        planet.setSurfaceWater(request.getSurfaceWater());
//
//        return planet;
//    }
//
//    public static PlanetResponse of(Planet planetModel) {
//        PlanetResponse planetResponse = new PlanetResponse();
//        planetResponse.setId(planetModel.getId());
//        planetResponse.setGravity(planetModel.getGravity());
//        planetResponse.setClimate(planetModel.getClimate());
//        planetResponse.setName(planetModel.getName());
//        planetResponse.setCreated(planetModel.getCreated());
//        planetResponse.setEdited(planetModel.getEdited());
//        planetResponse.setPopulation(planetModel.getPopulation());
//        planetResponse.setTerrain(planetModel.getTerrain());
//        planetResponse.setOrbitalPeriod(planetModel.getOrbitalPeriod());
//        planetResponse.setRotationPeriod(planetModel.getRotationPeriod());
//        planetResponse.setDiameter(planetModel.getDiameter());
//        planetResponse.setSurfaceWater(planetModel.getSurfaceWater());
//        return planetResponse;
//    }
//}
