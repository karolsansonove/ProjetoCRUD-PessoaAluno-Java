package model_controller;

public class Aluno extends Pessoa{

    private float notaFinal;

    protected Aluno(Pessoa pessoa) {
        super(pessoa);
    }

    protected float getNotaFinal() {
        return this.notaFinal;
    }

    protected void setNotaFinal(float novaNotaFinal) {
        this.notaFinal = novaNotaFinal;
    }
}