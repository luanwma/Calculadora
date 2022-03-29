/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

/**
 *
 * @author Luan
 */
public class Operacoes {
    public double resultado = 0 , valor =0 ;
    
    public double zerando(){
        this.resultado = 0;
        return this.resultado;
    }
    
    
    public double soma(double valor){
        this.resultado = this.resultado + valor;
        return this.resultado;
    }
    public double subtracao(double valor){
        this.resultado = this.resultado - valor;
        return this.resultado;
    }
    public double multiplicacao(double valor){
        double temp = this.resultado * valor;
        this.resultado = temp;
        return this.resultado;
    }
    public double divisao(double valor){
        double temp = this.resultado / valor;
        this.resultado = temp;
        return this.resultado;
    }
}
