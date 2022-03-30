package br.com.crud.crudsystem.service;

import br.com.crud.crudsystem.model.Aluno;

import java.util.List;

public interface AlunoService {
    public Aluno salvarAluno(Aluno aluno);
    public List<Aluno> getAllAlunos();
}
