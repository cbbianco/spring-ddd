package com.example.ddd.infrastructure.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

/**
 * @apiNote UserEntity, 'entity' Entidad Usuarios
 *
 * @version 1.0.0
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;

    /**
     * @apiNote  Determina el nombre del usuario , name de tipo {@link String}
     */
    @JsonProperty("nombre")
    @Column(name = "first_name")
    private String name;

    /**
     * @apiNote  Determina el apellido del usuario , lastName de tipo {@link String}
     */
    @JsonProperty("apellido")
    @Column(name = "last_name")
    private String lastName;

    /**
     * @apiNote  Determina el nombre de su producto , old de tipo {@link String}
     */
    @JsonProperty("edad")
    @Column(name = "old")
    private String old;
}
