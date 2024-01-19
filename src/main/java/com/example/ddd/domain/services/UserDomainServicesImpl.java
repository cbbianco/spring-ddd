package com.example.ddd.domain.services;

import com.example.ddd.application.model.UserDto;
import com.example.ddd.infrastructure.entity.UserEntity;
import com.example.ddd.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * UserDomainServicesImpl
 * @apiNote Capa 'Domain' , Capa de Lógica de Negocio, Interactua con la 'infrastructure'
 *
 * @version 1.0.0
 */
@Service("UserDomainServicesImpl")
@RequiredArgsConstructor
@Slf4j
public class UserDomainServicesImpl implements UserDomainServices {

    /**
     * @apiNote userRepository de tipo {@link UserRepository}
     */
    private final UserRepository userRepository;

    /**
     * @see UserDomainServices#handlerPersist(UserDto)
     */
    @Override
    public UserEntity handlerPersist(UserDto userDto) {
        var finer = userRepository.findByName(userDto.getName());
        log.info("UserDomainServicesImpl@handlerPersist");
        if(finer.isEmpty()) {
            log.info("El usuario no fue encontrado, se procedé ha persistirlo");
            return userRepository.save(UserEntity.builder()
                            .name(userDto.getName())
                            .lastName(userDto.getLastName())
                            .old(userDto.getOld())
                    .build());
        }

        log.info("El usuario ya se encuentra registrado en el sistema, Usuario:  {}", userDto);
        throw new RuntimeException("El usuario ya se encuentra registrado en el sistema");
    }
}
