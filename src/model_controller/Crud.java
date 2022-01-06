package model_controller;

import model_controller.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Crud {
    private final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat FORMATO_DATA_HORA = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Aluno> alunos;

    public Crud() {
        this.FORMATO_DATA.setLenient(false);
        this.pessoas = new ArrayList<Pessoa>();
        this.alunos = new ArrayList<Aluno>();
    }

    private boolean validarIndice(int i) {
        if (this.pessoas.isEmpty()) {
            System.out.println("Lista vazia.");
            return false;
        } else if (i >= this.pessoas.size() || i < 0) {
            System.out.println("Este índice não existe.");
            return false;
        }
        return true;
    }

    public boolean cadastrarPessoa(String nome, String telefone, String nascimento) {
        Date nascimentoDate;

        try {
            nascimentoDate = FORMATO_DATA.parse(nascimento);
        } catch (ParseException e) {
            System.out.println("Insira a data no formato \"DD/MM/AAAA\"");
            return false;
        }

        Pessoa pessoa = new Pessoa(nome, telefone, nascimentoDate);
        pessoas.add(pessoa);
        return true;
    }

    /*public boolean atualizarPessoa(int i, String nome, String telefone, String nascimento) {
        Date nascimentoDate;

        if (validarIndice(i)) {
            Pessoa pessoa = pessoas.get(i);

            try {
                nascimentoDate = FORMATO_DATA.parse(nascimento);
            } catch (ParseException e) {
                System.out.println("Insira uma data válida com o formato \"DD/MM/AAAA\"");
                return false;
            }

            pessoa.setNome(nome);
            pessoa.setTelefone(telefone);
            pessoa.setDataNascimento(nascimentoDate);
            pessoa.atualizarUltimaAlteracao();
            return true;
        }
        return false;
    }*/

    public void listarPessoas() {
        if (this.pessoas.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (Pessoa p : this.pessoas) {
                visualizarIndice(this.pessoas.indexOf(p));
            }
        }
    }

    public void visualizarIndice(int i) {
        if (validarIndice(i)) {
            Pessoa pessoa = pessoas.get(i);
            System.out.printf("\n>>Índice: %d\nNome: %s\nTelefone: %s\nNascimento: %s\nÚltima alteração: %s\n",
                    i, pessoa.getNome(), pessoa.getTelefone(), FORMATO_DATA.format(pessoa.getDataNascimento()),
                    FORMATO_DATA_HORA.format(pessoa.getDataUltimaAlteracao()));
        }
    }

    public void removerPessoaPorNome(String nome) {
        if (this.pessoas.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (Pessoa p : this.pessoas) {
                if (p.getNome().toLowerCase().equals(nome.toLowerCase())) {
                    this.pessoas.remove(p);
                    System.out.println("Pessoa removida com sucesso.");
                    return;
                }
            }
            System.out.println("Nome não encontrado.");
        }
    }

    public void removerPessoaPorIndice(int i) {
        if (validarIndice(i)) {
            this.pessoas.remove(i);
            System.out.println("Pessoa removida com sucesso.");
        }
    }
}