package br.com.escola;

public class Aluno {
    private String nome;
    private String ra;
    private float notaav1;
    private float notaav2;


    public Aluno (String nome, String ra, float notaav1, float notaav2){
        this.nome = nome;
        this.ra = ra;
        this.notaav1 = notaav1;
        this.notaav2 = notaav2;
    }
    public Aluno(){
        /*this.nome= "";
        this.ra = "";
        this.notaav1 =0;
        this.notaav2 =0; */
    }

    public Aluno (String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
        
    }
}
