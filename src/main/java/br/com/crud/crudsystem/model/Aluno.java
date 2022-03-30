package br.com.crud.crudsystem.model;

import javax.persistence.*;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name = "aluno", sequenceName = "SQ_TB_ALUNO" ,allocationSize = 1)
public class Aluno {

    public Aluno(String nome, String matricula, String endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public Aluno() {
    }

    @Id
    @GeneratedValue(generator = "aluno", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="nm_aluno", length = 50, nullable = false)
    private String nome;

    @Column(name="ds_matricula", length = 7, nullable = false)
    private String matricula;

    private String endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
