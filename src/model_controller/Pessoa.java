package model_controller;

import java.util.Date;

public class Pessoa {
    private final Date DATA_CADASTRO = new Date();
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private Date dataUltimaAlteracao;

    protected Pessoa(String nome, String telefone, Date nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = nascimento;
        this.dataUltimaAlteracao = new Date();
    }

    protected Pessoa(Pessoa pessoa) {
        this.nome = pessoa.nome;
        this.telefone = pessoa.telefone;
        this.dataNascimento = pessoa.dataNascimento;
        this.dataUltimaAlteracao = pessoa.dataUltimaAlteracao;
    }

    protected Date getDataCadastro() {
        return this.DATA_CADASTRO;
    }

    protected void setNome(String novoNome) {
        this.nome = novoNome;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    protected String getTelefone() {
        return this.telefone;
    }

    protected void setDataNascimento(Date novaDataNascimento) {
        this.dataNascimento = novaDataNascimento;
    }

    protected Date getDataNascimento() {
        return this.dataNascimento;
    }

    protected void atualizarUltimaAlteracao() {
        this.dataUltimaAlteracao = new Date();
    }

    protected Date getDataUltimaAlteracao() {
        return this.dataUltimaAlteracao;
    }
}
