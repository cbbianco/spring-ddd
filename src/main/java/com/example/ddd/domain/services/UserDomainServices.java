package com.example.ddd.domain.services;

import com.example.ddd.application.model.UserDto;
import com.example.ddd.infrastructure.entity.UserEntity;

/**
 * UserDomainServicesImpl
 * @apiNote Capa 'Domain' , Capa de Casos de Usos, Interactua con con la 'infrastructure'
 *
 * @version 1.0.0
 */
public interface UserDomainServices {

    /**
     * @apiNote handlerPersist, 'Caso de Uso' encargada de persistir a un usuario
     *
     * @param userDto de tipo {@link UserDto}
     * @return {@link UserEntity}
     */
    UserEntity handlerPersist(UserDto userDto);
}
