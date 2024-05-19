package com.iuh.kttkpm.be.lookUpPoints.services;

import com.iuh.kttkpm.be.lookUpPoints.models.StudentSectionClass;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentRepository;
import com.iuh.kttkpm.be.lookUpPoints.repositories.StudentSectionClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentSectionClassService {
    private final StudentSectionClassRepository studentSectionClassRepository;
    private final StudentRepository studentRepository;

    public List<StudentSectionClass> getAllStudentSectionClassByStudentId(Long studentId){
        return studentSectionClassRepository.findByStudent(studentRepository.findById(studentId).get());
    }

}
