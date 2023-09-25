/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isr;

import java.util.Scanner;

/**
 *
 * @author kirito
 */
public class ISR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner dato=new Scanner(System.in);
        int nmen,cg=0;
         System.out.println("numero de personal en nomina");
         nmen=dato.nextInt();
        for(int t=0;t<nmen;t++)
        {
            System.out.println("seleccione");
            System.out.println("[1].$ 0.01 a $ 368.10");
            System.out.println("[2].$ 368.11 a $ 3124.35");
            System.out.println("[3].$ 3124.36 a $ 5490.75");
            System.out.println("[4].$ 5490.76 a $ 6382.80");
            System.out.println("[5].$ 6382.81 a $ 7641.90");
            System.out.println("[6].$ 7641.91 a $ 15,412.80");
            System.out.println("[7].$ 15,412.81 a $ 24,292.65");
            System.out.println("[8].$ 24,292.66 a $ 46,378.50");
            System.out.println("[9].$ 46,378.51 a $ 61,838.10");
            System.out.println("[10].$ 61,838.11 a $ 185,514.30");
            System.out.println("[11].$ 185514.31 en adelante");
            cg=dato.nextInt();
            operar o=new operar();
            o.opera(cg);
    }
    
    }
}
