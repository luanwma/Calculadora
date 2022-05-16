/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luan
 */
public  class Calculos {
    
    
    public static double multiplicacao(double a, double b){
        return (a*b);
    }
    public static double divisao(double a, double b){
        double resultado =0;
        if(b != 0){
            resultado = a/b;
            return resultado;
        }
        return resultado;
    }
    public static double soma(double a, double b){
        return (a+b);
    }
    
    public static double subtracao(double a, double b){
        return (a-b);
    }
    
}
