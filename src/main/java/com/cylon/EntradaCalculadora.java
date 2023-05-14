package com.cylon;
import java.util.Scanner;
public class EntradaCalculadora {
    public Calculadora Calculador() {
        Scanner texto = new Scanner(System.in);
        System.out.println("------Formar do 1º número complexo------\nDigite:");
        System.out.println("1 - para número em polar ");
        System.out.println("2 - para número em retangular");
        String nx = texto.next();
        int nxx = Integer.parseInt(nx);
        String messagem;
        String messagem2;
        if(nxx == 1){
            messagem= "Digite o modulo";
            messagem2 = " Digite o ângulo";
        }else{
            messagem= "Digite a parte real";
            messagem2 = "Digite a parte imaginária";
        }
        System.out.println(messagem);
        double n1 = Double.parseDouble(texto.next().replaceAll(",", "."));
        System.out.println(messagem2);
        double n2 = Double.parseDouble(texto.next().replaceAll(",", "."));
        NumeroComplexo n = new NumeroComplexo(nxx,n1, n2);
        System.out.println("------Formar do 2º número complexo------\nDigite:");
        System.out.println("1 - para número em polar");
        System.out.println("2 - para número em retangular");
        String nx2 = texto.next();
        int nxx2 = Integer.parseInt(nx2);
        if(nxx2 == 1){
            messagem= "Digite o modulo";
            messagem2 = " Digite o ângulo";
        }else{
            messagem= "Digite a parte real";
            messagem2 = "Digite a parte imaginária";
        }
        System.out.println(messagem);
        double nn1 = Double.parseDouble(texto.next().replaceAll(",", "."));
        System.out.println(messagem2);
        double nn2 = Double.parseDouble(texto.next().replaceAll(",", "."));

        NumeroComplexo nn = new NumeroComplexo(nxx2,nn1, nn2);
        System.out.println("----------------1º número---------------\n"+n.conv());
        System.out.println("----------------2º número---------------\n"+nn.conv());
        Calculadora s1 = new Calculadora(n, nn);
        return s1;
    }
}
