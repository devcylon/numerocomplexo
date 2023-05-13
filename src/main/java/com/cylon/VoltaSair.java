package com.cylon;

import java.util.Scanner;

public class VoltaSair {
    public VoltaSair() {  
    }
    public int voltarSair(){
        int rep;
        Scanner exit = new Scanner(System.in);
        System.out.println("       Digite:\n1 - Volta para o menu \n2 - Sair");
        String exitn = exit.next();
        int exitnn = Integer.parseInt(exitn);
        if(exitnn == 1){
            rep=0;
        }else{
            rep =1;
        }
        return rep;
    }
}
