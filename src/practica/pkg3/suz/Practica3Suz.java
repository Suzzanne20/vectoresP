/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3.suz;
import java.util.Scanner;

/**
 *
 * @author susan
 */
public class Practica3Suz {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        ClassOne calcu=new ClassOne();
        ClassTwo calc=new ClassTwo();
        ClassX cal=new ClassX();

///
        int []vect1=new int [1];
        int []vect2=new int[1];

///
        calcu.facto(4);
        Scanner num=new Scanner(System.in);
        Scanner nun=new Scanner(System.in);
        Scanner nuo=new Scanner(System.in);
        System.out.println("----MENU PRINCIPAL---");
        System.out.println("Ingrese el # de opcion\n1: Clase 1\n2: Clase 2\n3: Adicional");
        int opc=num.nextInt();
        switch(opc){
        case 1:
        System.out.println("----MENU CLASE 1---");

        System.out.println("Ingrese el # de funcion que desea aplicar:\n1: Factorial\n2: Tabla Multiplicar");
        int opc2=nun.nextInt();
            switch(opc2){
                case 1:
                System.out.println("----CALCULO DE FACTORIAL----");
                System.out.println("Ingresa un Numero para poder inicar");
                int result=calcu.facto(num.nextInt());
                System.out.println("El resultado es: "+result);
                
                case 2:
                System.out.println("----CALCULO DE TABLA DE MULTIPLICAR----");
                System.out.println("Ingresa los dos valores para poder inicar");
                result=calcu.tabMult(num.nextInt());
                System.out.println("El resultado es: "+result);
                calcu.mostrarHistorial();
                break;
                default:
                System.out.println("Opcion invalida");
                break;
            }

        case 2:
        System.out.println("----MENU CLASE 2---");

        System.out.println("Ingrese el # de funcion que desea aplicar:\n1: Pares e Impares\n2: Dia de la semana");
        int opc3=nun.nextInt();
            switch(opc3){
                case 1:
                System.out.println("----PARES E IMPARES----");
                System.out.println("Ingresa 10 valores para poder iniciar");
                int igu=calc.parimp();
                System.out.println("La cantidad de PARES es: ");
                System.out.println("La suma de los numeros PARES es: ");
                System.out.println("El promedio de los Impares es: ");
                


                case 2:
                System.out.println("----DIA DE LA SEMANA----");
                System.out.println("Selecciones una opcion:\n1: Lunes\n2: Martes\n3: Miercoles\n4: Jueves\n5: Viernes\n6: Sabado\n7: Domingo");
                igu=calc.labo(num.nextInt());
                break;
                default:
                System.out.println("Opcion invalida");
                calcu.mostrarHistorial();
                break;

            }
        case 3:
        System.out.println("----MENU ADICIONAL---");

        System.out.println("Ingrese el # de funcion que desea aplicar:\n1: Suma\n2: Resta\n3: Multiplicion\n4: Division");
        int opc4=nun.nextInt();
            switch(opc4){
                case 1:
                System.out.println("----SUMA----");
                System.out.println("Ingresa los dos valores para poder inicar");
                int result=cal.suma(num.nextInt(), num.nextInt());
                System.out.println("El resultado es: "+result);
                
                case 2:
                System.out.println("----RESTA----");
                System.out.println("Ingresa los dos valores para poder inicar");
                result=cal.resta(num.nextInt(), num.nextInt());
                System.out.println("El resultado es: "+result);
                
                case 3:
                System.out.println("----MULTIPLICACION----");
                System.out.println("Ingresa los dos valores para poder inicar");
                result=cal.multi(num.nextInt(), num.nextInt());
                System.out.println("El resultado es: "+result);
                
                case 4:
                System.out.println("----DIVISION----");
                System.out.println("Ingresa los dos valores para poder inicar");
                result=cal.divi(num.nextInt(), num.nextInt());
                System.out.println("El resultado es: "+result);

                System.out.println("\n---HISTORIAL DE OPERACIONES---");
                cal.mostrarHistorial();
                cal.ingVect();
                break;

                default:
                System.out.println("Opcion invalida");
                break;

            }
        default:
        System.out.println("Opcion invalida");
        break;


    }

    }
    
}
