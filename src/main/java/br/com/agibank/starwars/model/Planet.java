package br.com.agibank.starwars.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "planet")
public class Planet {

    @Id
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
