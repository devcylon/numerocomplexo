package com.cylon;
import java.text.DecimalFormat;
public class Calculadora{
    double n1;
    double n2;
    double in2;
    double in1;
    double modulon1;
    double modulon2;
    double sangulo1;
    double sangulo2;
    double multangulo;
    String sinal="";
    double modulo;
    double angulo;
    int potencia;
    int nu;
    double potReal;
    double potImaginario;
    double potAngulo;
    double potModulo;
    public Calculadora(int potencia, NumeroComplexo n1){
        this.n1 = n1.getReal();
        this.potencia = potencia;
        this.in1 = n1.getImaginario();
        this.modulon1 = n1.getNumero();
        this.sangulo1 = n1.getAngulo();
        this.angulo = n1.getAngulo();
        this.modulo = n1.getModulo();
        this.nu = n1.nu;
    }
     
    public Calculadora(NumeroComplexo n1, NumeroComplexo n2) {
        this.n1 = n1.getReal();
        this.n2 = n2.getReal();
        this.in1 = n1.getImaginario();
        this.in2 = n2.getImaginario();
        this.modulon1 = n1.getNumero();
        this.modulon2 = n2.getNumero();
        this.sangulo1 = n1.getAngulo();
        this.sangulo2 = n2.getAngulo();

        }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
     
    public String somar(){
        double somaR = n1 + n2;
        double somaI = in1 + in2;
        if(somaI > 0){
            sinal ="+";
        }
        modulo = Math.sqrt(Math.pow(somaR, 2)+Math.pow(somaI, 2));
        angulo = Math.toDegrees(Math.acos(somaR/modulo));
        String ret = "            Resuldato da adição\n";
        ret += "__________________________________________________\n";
        ret += "Resultado em Polar: "+new DecimalFormat("#,##0.000").format(modulo)+" /_ "+new DecimalFormat("#,##0.00").format(angulo)+"°\n";
        ret +="Resultado em retangular: " + new DecimalFormat("#,##0.000").format(somaR) + sinal + new DecimalFormat("#,##0.000").format(somaI)+"i";
        ret += "\n__________________________________________________";
        return ret;
    }
    public String subtrair(){
        double somaR = n1 - n2;
        double somaI = in1 - in2;
        if(somaI > 0){
            sinal ="+";
        }
        modulo = Math.sqrt(Math.pow(somaR, 2)+Math.pow(somaI, 2));
        angulo = Math.toDegrees(Math.acos(somaR/modulo));
        String ret = "            Resuldato da subtração\n";
        ret += "__________________________________________________\n";
        ret += "Resultado em Polar: "+new DecimalFormat("#,##0.000").format(modulo)+" /_ "+new DecimalFormat("#,##0.00").format(angulo)+"°\n";
        ret +="Resultado em retangular: " + new DecimalFormat("#,##0.000").format(somaR) + sinal + new DecimalFormat("#,##0.000").format(somaI)+"i";
        ret += "\n__________________________________________________";
        return ret;
    }
    public String multiplicar(){
        double  multModulo= modulon1 * modulon2;
        double multangulo =  sangulo1 + sangulo2;
        double multReal = multModulo* Math.cos(Math.toRadians(multangulo));
        double multImaginario = multModulo* Math.sin(Math.toRadians(multangulo));
        System.out.println(multangulo);
        if(multImaginario > 0){
            sinal ="+";
        }
        String ret = "\n               Resultado da multiplicação\n";
        ret += "__________________________________________________\n";
        ret += "em Polar: "+new DecimalFormat("#,##0.000").format(multModulo)+" /_ "+new DecimalFormat("#,##0.00").format(multangulo)+"°\n";
        ret += "em retangular: "+new DecimalFormat("#,##0.000").format(multReal) + sinal + new DecimalFormat("#,##0.000").format(multImaginario)+"i";
        ret += "\n__________________________________________________";
        return ret;
    }

    public String dividir(){
        double  multModulo= modulon1 / modulon2;
        double multangulo =  sangulo1 - sangulo2;
        double multReal = multModulo* Math.cos(Math.toRadians(multangulo));
        double multImaginario = multModulo* Math.sin(Math.toRadians(multangulo));
        System.out.println(multangulo);
        if(multImaginario > 0){
            sinal ="+";
        }
        String ret = "\n           Resultado da Divisão";
        ret += "\n__________________________________________________\n";
        ret += "em Polar: "+new DecimalFormat("#,##0.000").format(multModulo)+" /_ "+new DecimalFormat("#,##0.00").format(multangulo)+"°\n";
        ret += "em retangular: "+new DecimalFormat("#,##0.000").format(multReal) + sinal + new DecimalFormat("#,##0.000").format(multImaginario)+"i";
        ret += "\n__________________________________________________";
        return ret;
    }
    public String potenciacao(){
        
        if(nu == 1){

        potReal = Math.pow(modulo, potencia)*Math.cos(potencia*Math.toRadians(sangulo1));
        potImaginario = Math.pow(modulon1, potencia)*Math.sin(potencia*Math.toRadians(sangulo1));
        potModulo = Math.sqrt(Math.pow(potReal, 2)+Math.pow(potImaginario, 2));
        potAngulo = Math.toDegrees(Math.acos(potReal/potModulo));
        }
        modulo = Math.sqrt(Math.pow(n1, 2)+Math.pow(in1, 2));
        angulo = Math.toDegrees(Math.acos(n1/modulo)); 
        potReal = Math.pow(modulo, potencia)*Math.cos(potencia*Math.toRadians(angulo));
        potImaginario = Math.pow(modulo, potencia)*Math.sin(potencia*Math.toRadians(angulo));
        potModulo = Math.sqrt(Math.pow(potReal, 2)+Math.pow(potImaginario, 2));
        potAngulo = Math.toDegrees(Math.acos(potReal/potModulo));
        if(potImaginario > 0){
            sinal ="+";
        }
        String ret=("__________________________________________________");
        ret += "\n           Resultado da Potenciação:\n\n";
        ret += "em Polar: "+new DecimalFormat("#,##0.000").format(potModulo)+" /_ "+new DecimalFormat("#,##0.00").format(potAngulo)+"°\n";
        ret += "em retangular: "+new DecimalFormat("#,##0.000").format(potReal) + sinal + new DecimalFormat("#,##0.000").format(potImaginario)+"i";
        ret += "\n__________________________________________________";
        return ret;
    }

}
