package com.cylon;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {   
        String menu1[]={"Converter","Somar","Subtrair","Multiplicar","Dividir"};
        Scanner menu = new Scanner(System.in);
        System.out.println("-----------------------------------\nCalculadora de número complexo\n-----------------------------------\n         Digite: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+" - Para "+ menu1[i]);
        }
        System.out.println("-----------------------------------");
        String m = menu.next();
        int mm = Integer.parseInt(m);
        if(mm == 1){
            EntradaConversor s = new EntradaConversor();
            System.out.println("-------------Resultado-------------\n"+s.converter()+"-----------------------------------");
        }else if(mm == 2){
            EntradaCalculadora a1 = new EntradaCalculadora();
            System.out.println(a1.Calculador().somar());
        }
        else if(mm == 3){
            EntradaCalculadora a1 = new EntradaCalculadora();
            System.out.println(a1.Calculador().subtrair());
        }
        else if(mm == 4){
            EntradaCalculadora a1 = new EntradaCalculadora();
            System.out.println(a1.Calculador().multiplicar());
        }
        else if(mm == 5){
            EntradaCalculadora a1 = new EntradaCalculadora();
            System.out.println(a1.Calculador().dividir());
        }else{
            System.out.println("Digite um numero valido");
        }       
    }
}
