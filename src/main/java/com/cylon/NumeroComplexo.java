package com.cylon;

import java.text.DecimalFormat;

public class NumeroComplexo {
    int nu;
    double modulo;
    double numero;
    double angulo;
    double real;
    double imaginario;
    String sinal = "";
    String x;
    public NumeroComplexo(int nu, double numero, double angulo) {
        this.numero =numero;
        this.angulo = angulo;
        this.nu = nu;
    }
    
    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String conv(){
        if(getNu() == 1){
        double rad = (this.angulo * Math.PI)/180;
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        real = numero * cosseno;
        imaginario = numero * seno;
        this.modulo = numero;
        }else{
            real = getNumero();
            imaginario = getAngulo();
            modulo = Math.sqrt(Math.pow(numero, 2)+Math.pow(angulo, 2));
            angulo = Math.toDegrees(Math.acos(real/modulo));
        }
        if(imaginario >=0){
            sinal = "+";
        }
        String resultado = "Polar:      "+new DecimalFormat("#,##0.00").format(modulo)+ " /_ "+new DecimalFormat("#,##0.00").format(angulo)+"°\n";
        resultado +="Retangular: "+ new DecimalFormat("#,##0.00").format(real)+" " + sinal + new DecimalFormat("#,##0.00").format(imaginario) + "i\n";
        return resultado;

        
    
        
    }
}