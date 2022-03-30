package br.com.crud.crudsystem.repository;

import br.com.crud.crudsystem.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
