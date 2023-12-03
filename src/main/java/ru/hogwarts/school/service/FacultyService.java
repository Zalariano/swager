package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

@Service
public interface FacultyService {


    Faculty addFaculty(Faculty faculty);

    Faculty getFaculty(Long id);

    Faculty updateFaculty(Long id,Faculty faculty);

    void removeFaculty(Long id);
}
