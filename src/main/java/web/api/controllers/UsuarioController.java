package web.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.api.FakeRepository.UserRepository;
import web.api.model.usuario;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody usuario user){
        repository.save(user);
    }
}
