package com.cylon;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {   int rep=0;
        while (rep == 0) {
            String menu1[]={"Converter","Somar","Subtrair","Multiplicar","Dividir","Potencia"};
            Scanner menu = new Scanner(System.in);
            System.out.println("__________________________________________________\n          Calculadora de número complexo\n__________________________________________________\n                    Digite: \n");
            for (int i = 0; i < menu1.length; i++) {
                System.out.println(i+1+" - Para "+ menu1[i]);
            }
            System.out.println("__________________________________________________");
            String m = menu.next();
            int mm = Integer.parseInt(m);
            VoltaSair volt = new VoltaSair();
            if(mm == 1){
                EntradaConversor s = new EntradaConversor();
                System.out.println("__________________________________________________\n            Resultado da conversão:\n\n"+s.converter());
                rep = volt.voltarSair();
            }else if(mm == 2){
                EntradaCalculadora a1 = new EntradaCalculadora();
                System.out.println(a1.Calculador().somar());
                rep = volt.voltarSair();
            }
            else if(mm == 3){
                EntradaCalculadora a1 = new EntradaCalculadora();
                System.out.println(a1.Calculador().subtrair());
                rep = volt.voltarSair();
            }
            else if(mm == 4){
                EntradaCalculadora a1 = new EntradaCalculadora();
                System.out.println(a1.Calculador().multiplicar());
                rep = volt.voltarSair();
            }
            else if(mm == 5){
                EntradaCalculadora a1 = new EntradaCalculadora();
                System.out.println(a1.Calculador().dividir());
                rep = volt.voltarSair();
            }else if(mm == 6){
                EntradaPotencia a1 = new EntradaPotencia();
                System.out.println(a1.Potencia().potenciacao());
                rep = volt.voltarSair();
            }
            else{
                System.out.println("Digite um numero valido");
                rep = 0;
            }       
        }
    }
}
