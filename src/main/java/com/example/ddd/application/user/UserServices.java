package com.example.ddd.application.user;

import com.example.ddd.application.model.UserDto;
import com.example.ddd.infrastructure.entity.UserEntity;

/**
 * UserDomainServicesImpl
 * @apiNote Capa 'Application' , Capa de Casos de Usos, Interactua con el 'domain' y con la 'infrastructure'
 *
 * @version 1.0.0
 */
public interface UserServices {

    /**
     * @apiNote handlerPersist, 'Caso de Uso' encargada de persistir a un usuario
     *
     * @param userDto de tipo {@link UserEntity}
     * @return {@link UserEntity}
     */
    UserEntity handlerPersist(UserDto userDto);
}
