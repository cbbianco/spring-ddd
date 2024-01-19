package com.example.ddd.infrastructure.repository;

import com.example.ddd.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * @apiNote UserRepository, 'repositorio' Gestionaría a todos los casos de uso relacionados al usuario
 *
 * @version 1.0.0
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, BigInteger> {
}
