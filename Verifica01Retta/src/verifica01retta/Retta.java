package verifica01retta;

public class Retta {

    private double a; // x della retta
    private double b; // y della retta
    private double c;
    private double x; // coordinata x del punto da controllare
    private double y; // coordinata y del punto da controllare
    private double risultato = 0;

    public Retta(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getTipo() {
        if ((a == 0) && (b == 0)) {
            FinestraErrore fe;
            fe = new FinestraErrore();
            fe.setVisible(true);
            fe.setTitle("Errore");
            fe.setLocation(500, 550);
            return "";
        }
        if (a == 0) {
            return "Orizzontale";
        }
        if (b == 0) {
            return "Verticale";
        }
        return "Obliqua";
    }

    public boolean appartiene(double x, double y) {
        this.x = x;
        this.y = y;
        risultato = (a * x) + (b * y) + c;
        if (risultato == 0) {
            return true;
        }
        return false;
    }

    public String stampa() {
        if ((a < 0)&&(b < 0)&&(c < 0)){
            return  a + "x" + b + "y" + c + "=0";
        }
         if ((a < 0)&&(c < 0)){
            return  a + "x+" + b + "y" + c + "=0";
        }
          if ((b < 0)&&(c < 0)){
            return  a + "x" + b + "y" + c + "=0";
        }
        if ((a < 0)&&(b < 0)){
            return  a + "x" + b + "y+" + c + "=0";
        }
         if (b < 0){
            return  a + "x" + b + "y+" + c + "=0";
        }
          if (c < 0){
            return  a + "x+" + b + "y" + c + "=0";
        }
        return a + "x+" + b + "y+" + c + "=0";
    }
}
