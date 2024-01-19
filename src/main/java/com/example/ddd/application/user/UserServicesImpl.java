package com.example.ddd.application.user;

import com.example.ddd.application.model.UserDto;
import com.example.ddd.domain.services.UserDomainServices;
import com.example.ddd.infrastructure.entity.UserEntity;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * UserDomainServicesImpl
 * @apiNote Capa 'Application' , Capa de Casos de Usos, Interactua con el 'domain' y con la 'infrastructure'
 *
 * @version 1.0.0
 */
@Service ("UserServicesImpl")
@RequiredArgsConstructor
@Slf4j
public class UserServicesImpl implements UserServices {

    /**
     * @apiNote userDomainServices de tipo {@link UserDomainServices}
     */
    private final UserDomainServices userDomainServices;

    /**
     * @see UserServices#handlerPersist(UserDto)
     */
    @Override
    public UserEntity handlerPersist(@NotNull UserDto userDto) {
        log.info("UserServicesImpl@handlerPersist");
        return this.userDomainServices.handlerPersist(userDto);
    }
}
