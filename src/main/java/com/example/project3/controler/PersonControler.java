package com.example.project3.controler;

import com.example.project3.Entity.CommandEntity;
import com.example.project3.Entity.PersonEntity;
import com.example.project3.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonControler {

    private final PersonService personService;

    public PersonControler(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/persons/")
    public PersonEntity createPerson(@RequestBody PersonEntity person) {
        return personService.createPerson(person);
    }

    @GetMapping("/persons/")
    public List<PersonEntity> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/persons/{id}")
    public Optional<PersonEntity> getPerson(@PathVariable Long id) {
        return Optional.of(personService.getPerson(id)).orElseThrow();
    }

    @PostMapping("/commands/")
    public CommandEntity createCommand(@RequestBody CommandEntity command) {
        return personService.createCommand(command);
    }

    @GetMapping("/commands/")
    public List<CommandEntity> getCommands() {
        return personService.getCommands();
    }

    @GetMapping("/commands/{id}")
    public Optional<CommandEntity> getCommand(@PathVariable Long id) {
        return Optional.of(personService.getCommand(id)).orElseThrow();
    }
}
