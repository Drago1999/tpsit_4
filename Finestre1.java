/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestre1;

import java.util.Scanner;

public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n;
        int p1=150, p2=150;
        do{
           Scanner input = new Scanner(System.in);
           System.out.print("Inserisci il numero di finestre che vuoi creare: ");
           n = input.nextInt();
        }while((n<0)||(n>20));

        Finestra f;
        for (int x = 0; x < n; x++) {
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("Sono la finestra " + (x + 1));
            f.setLocation(p1=p1+100,p2=p2+100);
            f.setTitle("Finestra "+(x+1));
        }
    }

}

