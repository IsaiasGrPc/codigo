/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isr;

import java.util.Scanner;

/**
 *
 * @author kirito
 */
public class operar {
    Scanner dato=new Scanner(System.in);
    public void opera(int a)
    {
        //Se dese calcular el ISR y el sueldo neto del sueldo de un empleado, 
        //con el fin de aselerar el trabajo administravo de una empresa.
        
        int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0,n11=0;
        double sal = 0,p1=0.00,p2=7.05,p3=183.45,p4=441.00,p5=538.65,p6=809.25;
        double p7=2469.15,p8=4557.75,p9=11183.40,p10=16130.55,p11=58180.35;
        double base,resultado,ISR,div,sn;
        double plf=1.92,f2=6.40,f3=10.88,f4=16.00,f5=17.92,f6=21.36,f7=23.52;
        double f8=30.00,f9=32.00,f10=34.00,f11=35.00;
         if(a==1)
             
             //ingresamos el numero del personal en nomina que se repetira el numero de veces que coloques.
            {
             //posteriormente elegimos el rango del salario que tiene el empledo
               do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
               }while(sal>=0.01 && sal>=368.10);
                 base=sal-p1;
                 resultado=base*plf;
                 div=resultado/100;
                ISR=div+p1;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+plf+"%");
                n1++;
            }
             //de una minima cantidad asta una elevada cantidad
             //el codigo preguntara el salario donde se colocara y este devolvera el ISR, salario neto y porcentaje restado  
             //lo cual acelera el trabajo del contado
         
            
            else if(a==2)
                //ingresa el salario mayor 368 y menor 3124
            {
                do{
                System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=368.11 && sal>=3124.35);
                 base=sal-p2;
                 resultado=base*f2;
                 div=resultado/100;
                ISR=div+p2;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f2+"%");
                n2++;
            }
            else if(a==3)
                //ingresa el salario mayor 3124 y menor 5490
            {
                do{
                System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=3124.36 && sal>=5490.75);
                 base=sal-p3;
                 resultado=base*f3;
                 div=resultado/100;
                ISR=div+p3;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f3+"%");
                n3++;
            }
            else if(a==4)
                //ingresa el salario mayor 5490 y menor6382
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=5490.76 && sal>=6382.80);
                 base=sal-p4;
                 resultado=base*f4;
                 div=resultado/100;
                ISR=div+p4;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f4+"%");
                n4++;
            }
            else if(a==5)
                //ingresa el salario mayor 6380 y menor 7641
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=6382.81 && sal>=7641.90);
                 base=sal-p5;
                 resultado=base*f5;
                 div=resultado/100;
                ISR=div+p5;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f5+"%");
                n5++;
            }
            else if(a==6)
                //ingresa el salario mayor 7641 y menor 15412
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                  }while(sal>=7641.91 && sal>=15412.80);
                 base=sal-p6;
                 resultado=base*f6;
                 div=resultado/100;
                ISR=div+p6;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f6+"%");
                n6++;
            }
            else if(a==7)
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=15412.81 && sal>=24292.65);
                 base=sal-p7;
                 resultado=base*f7;
                 div=resultado/100;
                ISR=div+p7;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f7+"%");
                n7++;
            }
            else if(a==8)
                //ingresa el salario mayor 24292 y menor 43778
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=24292.66 && sal>=46378.50);
                 base=sal-p8;
                 resultado=base*f8;
                 div=resultado/100;
                ISR=div+p8;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f8+"%");
               n8++; 
            }
            else if(a==9)
                //ingresa el salario mayor 46378 y menor 61838
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=46378.51 && sal>=61838.10);

                 base=sal-p9;
                 resultado=base*f9;
                 div=resultado/100;
                ISR=div+p9;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f9+"%");
                n9++;
            }
            else if(a==10)
                //ingresa el salario mayor 61838 y menor 185514
            {
                do{
                 System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=61838.11 && sal>=185514.30);
                 base=sal-p10;
                 resultado=base*f10;
                 div=resultado/100;
                ISR=div+p10;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f10+"%");
                n10++;
            }
            else if(a==11)
                //ingresa el salario mayor 185514 y menor 100000
                
            {
                do{
                System.out.println("ingresa tu salario");
                 sal=dato.nextDouble();
                 }while(sal>=185514.31 && sal>=1000000);
                 base=sal-p11;
                 resultado=base*f11;
                 div=resultado/100;
                ISR=div+p11;
                sn=sal-ISR;
                 System.out.println("ISR:"+ISR+"\nsueldo neto:"+sn+"\nporcentage:"+f11+"%"); 
                n11++;
                //el codigo devolvera el ISR, salario neto y porcentaje restado  lo cual acelera el trabajo del contado
            }
    }
    
}
