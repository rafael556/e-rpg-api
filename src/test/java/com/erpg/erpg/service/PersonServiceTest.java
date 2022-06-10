package com.erpg.erpg.service;

import com.erpg.erpg.domain.repository.PersonRepository;
import com.erpg.erpg.domain.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;


    @Test
    void DeveriaRetornarTodosUsuarios() {


        Assertions.assertEquals();
    }

    @Test
    void DeveriaRetornarUmunicoUsuario() {

        Assertions.assertEquals();
    }

    @Test
    void DeveriaRegistrarUmNovoUsuario() {

        Assertions.assertEquals();
    }

}
