package br.com.escola;

import  java.text.NumberFormat;

public class Exemplo_rendimento {
    private double investInicial;
    private double taxaRendimento;
    private int numMeses;


    public Exemplo_rendimento(double investInicial, double taxaRendimento, int numMeses) {
        this.investInicial = investInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMeses = numMeses;
    }

    public double getInvestInicial() {
        return investInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setInvestInicial(double investInicial) {
        this.investInicial = investInicial;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }
    public void calculaRendimento(){
        double rendimentoMes;
        rendimentoMes=getInvestInicial();
        System.out.println("Valor Inicial:" + NumberFormat.getCurrencyInstance().format(getInvestInicial()));
        System.out.println("Taxa de Juros:" + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
        for(int i=0;i<getNumMeses();i++)
        {

            rendimentoMes=rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
            //System.out.printf("
            System.out.println("Mês" + (i+1 + ":" + NumberFormat.getPercentInstance().format(rendimentoMes)));









        }







    }
}
