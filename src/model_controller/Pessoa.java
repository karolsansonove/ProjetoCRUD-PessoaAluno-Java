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
        this.dataUltimaAlteracao = new Date(); // VERIFICAR COMO CRIAR atualizar a data
    }

    protected Pessoa(Pessoa pessoa) {
        this.nome = pessoa.nome;
        this.telefone = pessoa.telefone;
        this.dataNascimento = pessoa.dataNascimento;
        this.dataUltimaAlteracao = pessoa.dataUltimaAlteracao; // VERIFICAR COMO CRIAR atualizar a data
    }

    public Date getDataCadastro() {
        return this.DATA_CADASTRO;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setDataNascimento(Date novaDataNascimento) {
        this.dataNascimento = novaDataNascimento;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    protected void atualizarUltimaAlteracao() {
        // this.dataUltimaAlteracao = RECEBER DATA ATUAL;
    }

    public Date getDataUltimaAlteracao() {
        return this.dataUltimaAlteracao;
    }
}
