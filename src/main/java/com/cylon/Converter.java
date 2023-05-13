package com.cylon;
import java.util.Scanner;   
public class Converter {
    public String converter(){
        Scanner texto = new Scanner(System.in);
        System.out.println("-----------------------------------\nConversor de número complexo\n-----------------------------------\n           Digite:");
        System.out.println("1 - Converte de polar para retangular");
        System.out.println("2 - Converter retangular para polar");
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
        int n1 = Integer.parseInt(texto.next());
        System.out.println(messagem2);
        int n2 = Integer.parseInt(texto.next());
        ConverterPolarParaRetangula n = new ConverterPolarParaRetangula(nxx,n1, n2);
        String nn = n.conv();
        return nn;
    }
}
