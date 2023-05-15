package com.cylon;
import java.util.Scanner;
public class EntradaDados {
    public EntradaDados(){
    }
    public Calculadora Calculador() {
        Scanner texto = new Scanner(System.in);
        System.out.println("              1º número complexo\n__________________________________________________\n                    Digite :");
        System.out.println("1 - para número em polar ");
        System.out.println("2 - para número em retangular");
        System.out.println("__________________________________________________");
        String nx = texto.next();
        int nxx = Integer.parseInt(nx);
        String messagem;
        String messagem2;
        if(nxx == 1){
            messagem= "Digite o modulo";
            messagem2 = "Digite o ângulo";
        }else{
            messagem= "Digite a parte real";
            messagem2 = "Digite a parte imaginária";
        }
        System.out.println(messagem);
        double n1 = Double.parseDouble(texto.next().replaceAll(",", "."));
        System.out.println(messagem2);
        double n2 = Double.parseDouble(texto.next().replaceAll(",", "."));
        NumeroComplexo n = new NumeroComplexo(nxx,n1, n2);
        System.out.println("              2º número complexo\n__________________________________________________\n                    Digite :");
        System.out.println("1 - para número em polar ");
        System.out.println("2 - para número em retangular");
        System.out.println("__________________________________________________");
        String nx2 = texto.next();
        int nxx2 = Integer.parseInt(nx2);
        if(nxx2 == 1){
            messagem= "Digite o modulo";
            messagem2 = "Digite o ângulo";
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
    public String converter(){
        Scanner texto = new Scanner(System.in);
        System.out.println("           Conversor de número complexo\n__________________________________________________\n                   Digite:\n");
        System.out.println("1 - Converte de polar para retangular");
        System.out.println("2 - Converter retangular para polar");
        System.out.println("__________________________________________________");
        String nx = texto.next();
        int nxx = Integer.parseInt(nx);
        String messagem;
        String messagem2;
        if(nxx == 1){
            messagem= "Digite o modulo do número polar:";
            messagem2 = "Digite o ângulo do número polar:";
        }else{
            messagem= "Digite a parte real do retangular";
            messagem2 = "Digite a parte imaginária do retangular";
        }
        System.out.println(messagem);
        double n1 = Double.parseDouble( texto.next().replaceAll(",", ".") );
        System.out.println(messagem2);
        double n2 = Double.parseDouble( texto.next().replaceAll(",",".") );
        NumeroComplexo n = new NumeroComplexo(nxx,n1, n2);
        String nn = n.conv();
        return nn;
    }
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
