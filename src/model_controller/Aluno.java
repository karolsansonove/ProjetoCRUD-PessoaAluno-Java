package model_controller;

public class Aluno extends Pessoa{

    private float notaFinal;

    protected Aluno(Pessoa pessoa) {
        super(pessoa);
    }

    public float getNotaFinal() {
        return this.notaFinal;
    }

    public void setNotaFinal(float novaNotaFinal) {
        this.notaFinal = novaNotaFinal;
    }
}