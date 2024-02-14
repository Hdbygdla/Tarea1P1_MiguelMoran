/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1p1_miguelmoran;
import java.util.Scanner;
/**
 *
 * @author flash
 */
public class Tarea1P1_MiguelMoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("1. Triangulos");
            System.out.println("2. Anita lava la tina");
            System.out.println("3. Codigos secretos");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1 ->{
                    System.out.println("1. Triangulo isoceles");
                    System.out.println("2. Triangulo rectangulo");
                    System.out.print("Elija una opcion: ");
                    opcion = sc.nextInt();
                    System.out.print("Escriba el tamaño del triangulo: ");
                    int size = sc.nextInt();
                    switch(opcion){
                        case 1 ->{
                            for(int i = 0; i <= size; i++){
                                for(int j = size - i; j > 0; j--){
                                    System.out.print(" ");
                                }
                                for(int j = 0; j < i; j++){
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                        }
                        case 2 ->{
                            for(int i = 0; i <= size; i++){
                                for(int j = 0; j < i; j++){
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                        }
                    }
                }
                case 2 ->{
                    System.out.print("Escriba una oracion o palabra: ");
                    String pal = sc.next();
                    String reversa = "";
                    for(int i = pal.length() - 1; i >= 0; i--){
                        reversa = reversa + pal.charAt(i);
                    }
                    if(pal.equalsIgnoreCase(reversa)){
                        System.out.println("La palabra o oracion es un palindromo");
                    } else {
                        System.out.println("La palabra o oracion no es un palindromo");
                    }
                }
                case 3 ->{
                    System.out.println("Escriba un codigo con el formato LetraNumeroLetra...");
                    System.out.print("Escriba el codigo: ");
                    String codigo = sc.next();
                    String desif = "";
                    for(int i = 0; i < codigo.length() - 1; i += 2){
                        int rep = Character.getNumericValue(codigo.charAt(i + 1));
                        for (int j = 0; j < rep; j++) {
                            desif = desif + codigo.charAt(i);
                        }
                    }
                    System.out.println(desif);
                }
                case 4 ->{
                    seguir = false;
                }
                default ->{
                    System.out.println("Elija una opcion valida");
                }
            }
            System.out.println("");
        }
    }
}
