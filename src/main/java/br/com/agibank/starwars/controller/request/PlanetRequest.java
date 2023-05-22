package br.com.agibank.starwars.controller.request;

import lombok.Data;

@Data
public class PlanetRequest {

    private String climate;
    private String created;
    private String diameter;
    private String edited;
    private String gravity;
    private String name;
    private String orbitalPeriod;
    private String population;
    private String rotationPeriod;
    private String surfaceWater;
    private String terrain;

}
