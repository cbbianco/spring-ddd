package com.example.ddd.presentation;

import com.example.ddd.application.user.UserServices;
import com.example.ddd.application.model.UserDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * @apiNote Capa 'Presentation' , Capa Inicial , de entrada/solicitud de los datos
 *
 * @version 1.0.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
@Slf4j
public class UserController {

    /**
     * @apiNote userServices de tipo {@link UserServices}
     */
    private final UserServices userServices;

    /**
     *
     * @return {@link }
     */
    @PostMapping(value = "/usuarios/guardar", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDto userDto) {
        log.info("UserController@saveUser");
        return new ResponseEntity<>(this.userServices.handlerPersist(userDto), HttpStatus.CREATED);
    }
}
