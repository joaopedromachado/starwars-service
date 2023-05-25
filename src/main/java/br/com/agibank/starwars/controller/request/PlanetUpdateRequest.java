package br.com.agibank.starwars.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
// Criar esse objeto a parte para somente alterar, diferente do PlanetRequest que é focado em criar.
public class PlanetUpdateRequest {

    @NotNull(message= "Não pode ser nulo.")
    @NotBlank(message = "Não pode ser vázio.")
    private String name;


}
