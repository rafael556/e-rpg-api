package com.erpg.erpg.api.controller;

import com.erpg.erpg.domain.dto.person.PersonDTO;
import com.erpg.erpg.domain.service.PersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    @ApiOperation(value = "Retorna todos os usuários")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonDTO> getAllPeople() {
        return personService.getAllUsers();
    }

    @GetMapping("/{personId}")
    @ApiOperation(value = "Retorna um usuário específico por seu id")
    public PersonDTO getPersonById(@PathVariable Long personId) {
        return personService.getUserById(personId);
    }

    @PostMapping
    @ApiOperation(value = "Registra um novo usuário")
    public ResponseEntity<ResponseCreatePersonDTO> createPerson(@RequestBody RequestCreatePersonDTO person) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(person));
    }

    @PutMapping("/{personId}")
    @ApiOperation(value = "Atualiza os dados de um usuário")
    public ResponseEntity<ResponseUpdatePersonDTO> updatePerson(@RequestBody RequestUpdatePersonDTO person) {
        return ResponseEntity.ok(person);
    }
}
