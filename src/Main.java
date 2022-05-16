
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Luan
 */
public class Main extends Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean status =true;
        while(status == true){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Deseja realizar um calculo? Y(Sim) ou N(Não) ");
            String teste = leitor.next();
            if(teste.equals("y")|| teste.equals("Y")){
                status  = true;
                System.out.println("Digite um numero: ");
                double a = leitor.nextDouble();
                System.out.println("Digite a operação {+,-,*,/}: ");
                String op = leitor.next();
                System.out.println("Digite um numero: ");
                double b = leitor.nextDouble();
                double resultado = 0;
                if(op.equals("+")){
                   resultado = soma(a, b);
                }
                if(op.equals("-")){
                   resultado = subtracao(a,b);
                }
                if(op.equals("*")){
                   resultado =  multiplicacao(a,b);
                }
                if(op.equals("/")){
                    resultado =  divisao(a,b);
                }
                System.out.println("o resultado da operação é: "+resultado);
            }
            if(teste.equals("n") || teste.equals("N")){
                status = false;
            }
        }
        
        
        
    }
    
  
    
}
