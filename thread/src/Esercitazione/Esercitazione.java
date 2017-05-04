package Esercitazione;

public class Esercitazione {

    public static void main(String[] args) {
        Fattoriale f;
        for (int x = 0; x < 11; x++) {
            f = new Fattoriale(x);
            f.start();
        }
    }

}
