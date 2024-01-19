package com.example.ddd.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * @apiNote UserDto, 'Objeto de Valor' para la gestión del usuario y persistirlo
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    /**
     * @apiNote name de tipo {@link String}
     */
    @JsonProperty("nombre")
    @NotNull(message = "El campo no puede permanecer vació")
    private String name;


    /**
     * @apiNote lastName de tipo {@link String}
     */
    @JsonProperty("apellido")
    @NotNull(message = "El campo no puede permanecer vació")
    private String lastName;

    /**
     * @apiNote old de tipo {@link String}
     */
    @JsonProperty("edad")
    @NotNull(message = "El campo no puede permanecer vació")
    private String old;
}
