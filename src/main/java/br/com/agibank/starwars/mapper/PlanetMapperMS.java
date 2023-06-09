package br.com.agibank.starwars.mapper;


import br.com.agibank.starwars.controller.request.PlanetRequest;
import br.com.agibank.starwars.controller.response.PlanetResponse;
import br.com.agibank.starwars.model.Planet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlanetMapperMS {
    PlanetMapperMS INSTANCE = Mappers.getMapper(PlanetMapperMS.class);


    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "created", ignore = true),
            @Mapping(target = "edited", ignore = true),
            @Mapping(target = "url", ignore = true),
    })
    Planet requestToPlanet(PlanetRequest request);

    @Mapping(target = "created", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "edited", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "url", expression = "java(\"http://localhost:8080/v1/planets/\" + planet.getId())")
    PlanetResponse planetToResponse(Planet planet);
}
