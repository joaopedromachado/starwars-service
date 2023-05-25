package br.com.agibank.starwars.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "planet")
public class CarroDto {
    private String marca;
    private String nome;
    private Integer ano;
}
