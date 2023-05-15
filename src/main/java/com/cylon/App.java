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
            EntradaDados a1 = new EntradaDados();
            if(mm == 1){
                System.out.println("__________________________________________________\n            Resultado da conversão:\n\n"+a1.converter());
            }else if(mm == 2){
                System.out.println(a1.Calculador().somar());
            }
            else if(mm == 3) System.out.println(a1.Calculador().subtrair());
            else if(mm == 4) System.out.println(a1.Calculador().multiplicar());
            else if(mm == 5) System.out.println(a1.Calculador().dividir());
            else if(mm == 6) System.out.println(a1.Potencia().potenciacao());
            else{
                System.out.println("Digite um numero valido");
                rep = 0;
            }   
            rep = volt.voltarSair();    
        }
    }
}
