package com.erpg.erpg.service;

import com.erpg.erpg.domain.repository.SubjectRepository;
import com.erpg.erpg.domain.service.SubjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SubjectServiceTest {

    @Mock
    private SubjectRepository subjectRepository;

    @InjectMocks
    private SubjectService subjectService;

    @Test
    void DeeveriaRetornarTodasasDisciplinasporID(){

    }

    @Test
    void DeveriaRetornarumUsuarioporId(){


    }

    @Test
    void DeveriaCriarUmaDisciplina(){


    }
}
