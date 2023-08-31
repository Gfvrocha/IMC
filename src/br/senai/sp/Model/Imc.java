package br.senai.sp.Model;

public class Imc {

    public int peso;
    public double altura;

    public void CalcularImc(){
        Double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

    }

}
