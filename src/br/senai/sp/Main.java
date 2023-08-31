package br.senai.sp;

import br.senai.sp.Model.Imc;

public class Main {

    public static void main(String[] args) {
        /** Instacia IMC */
        Imc objImc = new Imc();

        /** Inicializa as variaveis */
        objImc.peso = 100;
        objImc.altura = 1.75;

        /** Chamar Metodo */
        objImc.CalcularImc();

    }
}
