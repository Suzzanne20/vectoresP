/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg3.suz;
import java.util.Scanner;

/**
 *
 * @author susan
 */
public class ClassTwo extends ClassX {

//Bob el Constructor//
    int xpar,ximp, sump, suma,sumi, prom, lista[], result;


    public ClassTwo(){

    }

    public int parimp(){
    Scanner in = new Scanner(System.in);
     this.historial("Los Numeros Pares ", num1,0);
    lista = new int[10];

        for(int i=1; i<=10; i++){
            System.out.print("(" + i + "/10) ");
            lista[i]=in.nextInt();

            if(num1 % 2==0)
                xpar=xpar+1;
            else
                ximp=ximp+1;

            if(num1 % 2==0)
                sump=sump+num1;

            else
                sumi=sumi+num1;
        }

        suma=sump+sumi;
        prom=sumi/ximp;
        
        System.out.println("La cantidad de PARES es: "+xpar+"\nLa suma de los numeros PARES es: "+sump+"\nEl promedio de los Impares es: "+prom);
        return 0;
    }
    public int labo(int num1){
        this.historial("Los dias laborales ", num1,0);
        int result;
        if(num1<=5)
        System.out.println("Es un dia Laboral");
        else
        System.out.println("Es un dia de Descanso");
        return 0;

    }

public void historial(String oper , int primer, int result){
contador=contador+1;
vector[contador]="--> "+oper + " "+primer+" es: "+result;
}


public void mostrarHistorial(){
try{
    System.out.println(vector.length);
    for(int i=1; i<vector.length;i++){
        if (!vector[i].isEmpty()){
           System.out.println(vector[i]);
        }       
    }
}catch(Exception e){
    System.out.println(e.getMessage());
        }

    }   


}


