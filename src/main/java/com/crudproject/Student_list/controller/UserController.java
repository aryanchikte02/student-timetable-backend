package com.crudproject.Student_list.controller;

import com.crudproject.Student_list.model.User;
import com.crudproject.Student_list.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // CREATE
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // READ ALL
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // READ BY ID
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable Long id,
            @RequestBody User updatedUser) {

        return userRepository.findById(id).map(user -> {

            user.setMondaySubject(updatedUser.getMondaySubject());
            user.setMondayTeacher(updatedUser.getMondayTeacher());
            user.setMondayLocation(updatedUser.getMondayLocation());

            user.setTuesdaySubject(updatedUser.getTuesdaySubject());
            user.setTuesdayTeacher(updatedUser.getTuesdayTeacher());
            user.setTuesdayLocation(updatedUser.getTuesdayLocation());

            user.setWednesdaySubject(updatedUser.getWednesdaySubject());
            user.setWednesdayTeacher(updatedUser.getWednesdayTeacher());
            user.setWednesdayLocation(updatedUser.getWednesdayLocation());

            user.setThursdaySubject(updatedUser.getThursdaySubject());
            user.setThursdayTeacher(updatedUser.getThursdayTeacher());
            user.setThursdayLocation(updatedUser.getThursdayLocation());

            user.setFridaySubject(updatedUser.getFridaySubject());
            user.setFridayTeacher(updatedUser.getFridayTeacher());
            user.setFridayLocation(updatedUser.getFridayLocation());

            return ResponseEntity.ok(userRepository.save(user));

        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("User deleted successfully");
    }
}
