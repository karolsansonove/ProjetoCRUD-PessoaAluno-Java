package model_controller;

import model_controller.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Crud {
    private final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat FORMATO_DATA_HORA = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

    public Crud() {
        this.FORMATO_DATA.setLenient(false);
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
        return true;
    }

    public void listarAlunos() {

    }

}