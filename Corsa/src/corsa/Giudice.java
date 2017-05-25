package corsa;

import java.util.Vector;
import javax.swing.DefaultListModel;

/**
 * Giudice è la classe che determina il vincitore
 *
 * @author Amatucci/Draghetti 4 INB 23/05/2017
 */
public class Giudice extends Thread {

    private Pista pista;
    private String vincitore = "";
    private String nomeAtleta1;
    private String nomeAtleta2;
    private String nomeAtleta3;
    private String nomeAtleta4;
    private Vector v = new Vector(1, 1);
    DefaultListModel lm = new DefaultListModel();
    public boolean via = false;
    Suono s = new Suono();

    public Giudice(Pista p, String Atleta1, String Atleta2, String Atleta3, String Atleta4) {
        this.pista = p;
        this.nomeAtleta1 = Atleta1;
        this.nomeAtleta2 = Atleta2;
        this.nomeAtleta3 = Atleta3;
        this.nomeAtleta4 = Atleta4;
        this.pista.lista.setModel(lm);
    }
    
    public void prontipartenzavia(){
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo.jpg")));
        try{
        sleep(1000);
        }catch(Exception e){}
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo1.jpg")));
        try{
        sleep(500);
        }catch(Exception e){}
        s.init();
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo2.jpg")));
        try{
        sleep(500);
        }catch(Exception e){}
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo3.jpg")));
        try{
        sleep(500);
        }catch(Exception e){}
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo4.jpg")));
        try{
        sleep(500);
        }catch(Exception e){}
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo5.jpg")));
        try{
        sleep(1000);
        }catch(Exception e){}
        this.pista.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo6.jpg")));
        
        this.via = true;
        //notifyAll();
    }

    public void run() {
        Atleta a1 = new Atleta(this.nomeAtleta1, this.pista.icoAtleta1, this);
        Atleta a2 = new Atleta(this.nomeAtleta2, this.pista.icoAtleta2, this);
        Atleta a3 = new Atleta(this.nomeAtleta3, this.pista.icoAtleta3, this);
        Atleta a4 = new Atleta(this.nomeAtleta4, this.pista.icoAtleta4, this);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        this.prontipartenzavia();
        this.pista.statoGara.setText("Gara iniziata");
        try {
            a1.join();
            a2.join();
            a3.join();
            a4.join();
        } catch (Exception e) {}
        this.pista.statoGara.setText("Gara conclusa, ha vinto " + this.getVincitore());
        lm.addElement("1° " + (String) v.elementAt(0));
        this.pista.lista.setModel(lm);
        lm.addElement("2° " + (String) v.elementAt(1));
        this.pista.lista.setModel(lm);
        lm.addElement("3° " + (String) v.elementAt(2));
        this.pista.lista.setModel(lm);
        lm.addElement("4° " + (String) v.elementAt(3));
        this.pista.lista.setModel(lm);
        pista.restart();
    }

    synchronized public void hoFinito(String nomeAtleta) {
        if (this.vincitore == "") {
            this.vincitore = nomeAtleta;
        }
        v.addElement(nomeAtleta);
    }

    public String getVincitore() {
        return this.vincitore;
    }

    public Vector getClassifica() {
        return v;
    }

    public DefaultListModel getLista() {
        return lm;
    }
}
