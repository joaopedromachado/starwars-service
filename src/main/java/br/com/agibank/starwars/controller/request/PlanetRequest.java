package br.com.agibank.starwars.controller.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PlanetRequest {

    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    private String climate;
    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    private String diameter;
    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    private String gravity;
    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    private String name;
    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    @JsonAlias("orbital_period")
    private String orbitalPeriod;
    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    private String population;
    @JsonAlias("rotation_period")
    private String rotationPeriod;
    @JsonAlias("surface_water")
    private String surfaceWater;
    private String terrain;

}
