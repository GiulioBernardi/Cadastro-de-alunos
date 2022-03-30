package br.com.crud.crudsystem.controller;

import br.com.crud.crudsystem.model.Aluno;
import br.com.crud.crudsystem.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
@CrossOrigin
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/add")
    public String add(@RequestBody Aluno aluno){
        alunoService.salvarAluno(aluno);
        return "Novo aluno adicionado";
    }

    @GetMapping("/getAll")
    public List<Aluno> getAllAlunos(){
        return alunoService.getAllAlunos();
    }
}
