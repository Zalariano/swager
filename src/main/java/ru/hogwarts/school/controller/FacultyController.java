package ru.hogwarts.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.service.FacultyService;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    private  final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.addFaculty(faculty);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getFaculty(@PathVariable Long id) {
        Optional<Faculty> faculty = facultyService.getFaculty(id);
        if (faculty.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }
    @PutMapping("/{id}")
    public Faculty updateFaculty(@RequestBody Faculty faculty) {
        return facultyService.updateFaculty(faculty);
    }
    @DeleteMapping("/{id}")
    public  void removeFaculty(@PathVariable Long id){
        facultyService.removeFaculty(id);
    }
    @GetMapping
    public Collection<Faculty> getFacultyByColor(@RequestParam String color){
        return  facultyService.getFacultyByColor(color);
    }
}
