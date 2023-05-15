package com.cylon;
import java.util.Scanner;   
public class EntradaConversor {
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
}
