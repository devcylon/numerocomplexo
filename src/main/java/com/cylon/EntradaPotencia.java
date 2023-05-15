package com.cylon;
import java.util.Scanner;
public class EntradaPotencia {
    public Calculadora Potencia(){
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
        System.out.println("Digite a potencia");
        int potencia = Integer.parseInt(texto.next());
        System.out.println("__________________________________________________");
        System.out.println("            Número complexo digitado:            \n\n"+n.conv());
        System.out.println("__________________________________________________");
        Calculadora s1 = new Calculadora(potencia,n);
        return s1;
    }
}
