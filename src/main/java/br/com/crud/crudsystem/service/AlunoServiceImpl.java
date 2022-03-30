package br.com.crud.crudsystem.service;

import br.com.crud.crudsystem.model.Aluno;
import br.com.crud.crudsystem.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService{

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }
}
