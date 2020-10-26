package com.example.pruebas;

public class Operacion {
    private int operando1, operando2, resultado;
    private char simbolo;

    public Operacion(int nivel) {
       switch(nivel)
       {
           case 0:
               operando1=pedirAleatorio(1);
               operando2=pedirAleatorio(1);
               resultado=operando1+operando2;
               simbolo='+';
           break;
           case 1:
               operando1=pedirAleatorio(2);
               operando2=pedirAleatorio(2);
               resultado=operando1+operando2;
               simbolo='+';
               break;
           case 2:

               break;
       }
    }

    private int pedirAleatorio(int i) {
        int factor=(int)Math.pow(10, i);
        return (int)(Math.random()*factor);
    }

    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public int getResultado() {
        return resultado;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
