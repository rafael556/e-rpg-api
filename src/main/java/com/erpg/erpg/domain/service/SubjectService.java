package com.erpg.erpg.domain.service;

import com.erpg.erpg.api.model.Subject;
import com.erpg.erpg.domain.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long subjectId) {
        return subjectRepository.findById(subjectId).orElseThrow();
    }

    public ResponseCreateSubjectDTO createSubject(RequestCreateSubjectDTO person) {
        return subjectRepository.save(person);
    }
}
