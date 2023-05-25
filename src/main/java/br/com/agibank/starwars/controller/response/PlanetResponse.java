package br.com.agibank.starwars.controller.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PlanetResponse {

    private String id;
    private String climate;
    private LocalDateTime created;
    private String diameter;
    private LocalDateTime edited;
    private String gravity;
    private String name;
    private String orbitalPeriod;
    private String population;
    private String rotationPeriod;
    private String surfaceWater;
    private String terrain;
    private String url;

}
