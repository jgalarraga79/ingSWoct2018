/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswoct2018;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JoseGalarraga
 */

public class IngSWoct2018 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
                
        float fibo1,fibo2,i;
        int numero;
        
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);   
        
        FileWriter fw;
        
        try {
            fw = new FileWriter(new File("serie.txt"),true);
            fw.write("Los " + numero + " primeros términos de la serie de Fibonacci son:");
            fibo1=1;
            fibo2=1; 

            fw.write(fibo1 + " ");
            for(i=2;i<=numero;i++){
                 //System.out.print
                 fw.write(fibo2 + " ");
                 fibo2 = fibo1 + fibo2;
                 fibo1 = fibo2 - fibo1;
            }
            fw.write(System.lineSeparator());

            fw.close();
        } catch (IOException ex) {
            }
    }
}