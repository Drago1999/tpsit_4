/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;

import java.util.Scanner;

/**
 *
 * @author studente
 */
public class Areaperimetrotriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l1, l2, l3, p, h;
        float A;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Inserisci la base del trinagolo: ");
        l1 = input.nextInt();
        } while ( l1 <= 0 );
        
        do{
        System.out.println("Inserisci lato del triangolo: ");
        l2 = input.nextInt();
        } while ( l2 <=0 );
        
        System.out.println("Inserisci lato del triangolo: ");
        l3 = input.nextInt();
        while ( ( l3 <=0 ) || ( l3 > ( l2 + l1) ) ){
            System.out.println ( "Valore inserito non valido...Reinserisci: " );
            l3 = input.nextInt();
        }
        
        System.out.println ( "Inserisci l'altezza del triangolo: " );
        h = input.nextInt();
        
        p = l1 + l2 + l3;
        A = (h * l1) / 2;

        System.out.println("Perimetro= " + p);
        System.out.println("Area= " + A);
        
    }

}
