package principal;

import java.util.Date;

public class Pessoa {
    private final Date DATA_CADASTRO = new Date(); // VERIFICAR COMO CRIAR DATA ATUAL
    private String nome;
    private long telefone; // VERIFICAR TIPO ADEQUADO PARA TELEFONE
    private Date dataNascimento;
    private Date dataUltimaAlteracao;
    private float notaFinal;

    public Pessoa(String nome, long telefone, Date nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = nascimento; // VERIFICAR COMO INSERIR DATA
        this.dataUltimaAlteracao = new Date(); // VERIFICAR COMO CRIAR DATA ATUAL
    }

    protected Pessoa(Pessoa pessoa) {
        this.nome = pessoa.nome;
        this.telefone = pessoa.telefone;
        this.dataNascimento = pessoa.dataNascimento; // VERIFICAR COMO INSERIR DATA
        this.dataUltimaAlteracao = pessoa.dataUltimaAlteracao; // VERIFICAR COMO CRIAR DATA ATUAL
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

    public void setTelefone(long novoTelefone) {
        this.telefone = novoTelefone;
    }

    public long getTelefone() {
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
