package com.erpg.erpg.api.controller;

import com.erpg.erpg.api.model.Subject;
import com.erpg.erpg.domain.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("{subjectId}")
    public Subject getSubjectById(@PathVariable Long subjectId) {
        return subjectService.getSubjectById(subjectId);
    }

    @PostMapping
    public ResponseEntity<ResponseCreateSubjectDTO> createSubject(RequestCreateSubjectDTO subject) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subjectService.createSubject(subject));
    }

    @PutMapping("{subjectId}")
    public ResponseEntity<ResponseUpdateSubjectDTO> updateSubject(@PathVariable Long subjectId,
                                                                  @RequestBody RequestUpdateSubjectDTO subject) {
        RequestCreateSubjectDTO newSubject = subjectService.getSubjectById(subjectId);
        ResponseEntity.ok(subjectService.createSubject(newSubject));
    }

}
