package com.erpg.erpg.domain.service;

import com.erpg.erpg.api.model.Person;
import com.erpg.erpg.domain.dto.person.PersonDTO;
import com.erpg.erpg.domain.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PersonService {

@Autowired
    PersonRepository personRepository;

    @Autowired
    ModelMapper modelMapper;
    public List<PersonDTO> getAllUsers() {
        return personRepository.findAll().stream().map(this::toPersonDTO).collect(Collectors.toList());
    }

    public PersonDTO getUserById(Long id) {
        return toPersonDTO(personRepository.findById(id).orElseThrow());
    }

    public Person createPerson(RequestCreatePersonDTO person) {
        return personRepository.save(person);
    }

    private PersonDTO toPersonDTO(Person person) {
        return modelMapper.map(person, PersonDTO.class);
    }
}
