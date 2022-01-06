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

    public Crud() {
        this.FORMATO_DATA.setLenient(false);
        this.pessoas = new ArrayList<Pessoa>();
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

    public void listarPessoas() {
        if (this.pessoas.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (Pessoa p : this.pessoas) {
                System.out.printf("\n>>Índice: %d\nNome: %s\nTelefone: %s\nNascimento: %s\nÚltima alteração: %s\n", pessoas.indexOf(p), p.getNome(), p.getTelefone(), FORMATO_DATA.format(p.getDataNascimento()), FORMATO_DATA_HORA.format(p.getDataUltimaAlteracao()));
            }
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
        if (this.pessoas.isEmpty()) {
            System.out.println("Lista vazia.");
        } else if (i >= this.pessoas.size() || i < 0){
            System.out.println("Este índice não existe.");
        } else {
            this.pessoas.remove(i);
            System.out.println("Pessoa removida com sucesso.");
        }
    }
}