package com.example.ddd.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @apiNote UserDto, 'Objeto de Valor' para la gestión del usuario y persistirlo
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    /**
     * @apiNote name de tipo {@link String}
     */
    @JsonProperty("nombre")
    private String name;


    /**
     * @apiNote lastName de tipo {@link String}
     */
    @JsonProperty("apellido")
    private String lastName;

    /**
     * @apiNote old de tipo {@link String}
     */
    @JsonProperty("edad")
    private String old;
}
