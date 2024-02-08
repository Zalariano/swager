package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {


    Faculty addFaculty(Faculty faculty);

    Optional<Faculty> getFaculty(Long id);

    Faculty updateFaculty(Faculty faculty);

    void removeFaculty(Long id);
    List<Faculty> getFacultyByColor(String color);
}
