package br.com.questao2;

public class FComissionado extends Funcionario{
    private double percentual;
    private double vendas;

    public FComissionado(double percentual, double vendas, int matricula, String nome, double salario) {
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public double getVendas() {
        return vendas;
    }
    public double calcularProventos() {
        return getSalario() + getVendas() * getPercentual() / 100;
    }




}
