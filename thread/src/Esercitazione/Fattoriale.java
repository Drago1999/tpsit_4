package Esercitazione;

public class Fattoriale extends Thread {

    private int n;
    private int calcolo = 1;
    public Fattoriale(int inserito) {
        this.n = inserito;
    }

    public void run() {
        if (this.n == 0) {
            calcolo = 1;
        }
        for (int x = 1; x < this.n + 1; x++) {
            calcolo = calcolo * x;
        }
        System.out.println("Il fattoriale di "+ this.n +" è "+calcolo);
    }

}
