package com.example.ddd.infrastructure.repository;

import com.example.ddd.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

/**
 * @apiNote UserRepository, 'repositorio' Gestionaría a todos los casos de uso relacionados al usuario
 *
 * @version 1.0.0
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, BigInteger> {

    /**
     * @apiNote findByName, Encargado de consultar la existencia de un usuario por su nombre
     *
     * @param name de tipo {@link String}
     * @return {@link Optional}&lt;{@link UserEntity}&gt;
     */
    Optional<UserEntity> findByName(@Param("name") String name);
}
