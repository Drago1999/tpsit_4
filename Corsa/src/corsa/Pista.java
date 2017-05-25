package corsa;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Pista è la finestra che contiene il percorso di gara
 *
 * @author Amatucci/Draghetti 4 INB 23/05/2017
 */
public class Pista extends javax.swing.JFrame {

    private String nomeAtleta1;
    private String nomeAtleta2;
    private String nomeAtleta3;
    private String nomeAtleta4;
    private int y1;
    private int x;
    private int y2;
    private int y3;
    private int y4;

    public Pista(String Atleta1, String Atleta2, String Atleta3, String Atleta4) {
        initComponents();
        this.nomeAtleta1 = Atleta1;
        this.nomeAtleta2 = Atleta2;
        this.nomeAtleta3 = Atleta3;
        this.nomeAtleta4 = Atleta4;
        x = this.icoAtleta1.getX();
        y1 = this.icoAtleta1.getY();
        y2 = this.icoAtleta2.getY();
        y3 = this.icoAtleta3.getY();
        y4 = this.icoAtleta4.getY();
    }

    public void restart() {
        this.bottoneAvvio.setEnabled(true);
        this.Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Corsa/Semaforo.jpg")));
        this.icoAtleta1.setLocation(x, y1);
        this.icoAtleta2.setLocation(x, y2);
        this.icoAtleta3.setLocation(x, y3);
        this.icoAtleta4.setLocation(x, y4);

    }

    /*
    Semaforo.setVisible(false);
     Semaforo1.setVisible(false);
     Semaforo2.setVisible(false);
     Semaforo3.setVisible(false);
     Semaforo4.setVisible(false);
     Semaforo5.setVisible(false);
     Semaforo6.setVisible(false);
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Asfalto = new javax.swing.JPanel();
        icoAtleta1 = new javax.swing.JLabel();
        icoAtleta2 = new javax.swing.JLabel();
        icoAtleta3 = new javax.swing.JLabel();
        icoAtleta4 = new javax.swing.JLabel();
        StrisciaP = new javax.swing.JLabel();
        Separatore3 = new javax.swing.JLabel();
        Separatore1 = new javax.swing.JLabel();
        Separatore2 = new javax.swing.JLabel();
        StrisciaA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        Panel = new javax.swing.JPanel();
        bottoneAvvio = new javax.swing.JButton();
        Semaforo = new javax.swing.JLabel();
        statoGara = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Asfalto.setBackground(new java.awt.Color(0, 0, 0));
        Asfalto.setLayout(null);

        icoAtleta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Macchina1.jpg"))); // NOI18N
        Asfalto.add(icoAtleta1);
        icoAtleta1.setBounds(0, 20, 210, 90);

        icoAtleta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Macchina2.jpg"))); // NOI18N
        Asfalto.add(icoAtleta2);
        icoAtleta2.setBounds(0, 150, 210, 90);

        icoAtleta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Macchina3.jpg"))); // NOI18N
        Asfalto.add(icoAtleta3);
        icoAtleta3.setBounds(0, 280, 210, 90);

        icoAtleta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Macchina4.jpg"))); // NOI18N
        Asfalto.add(icoAtleta4);
        icoAtleta4.setBounds(0, 410, 210, 90);

        StrisciaP.setBackground(new java.awt.Color(255, 255, 255));
        StrisciaP.setForeground(new java.awt.Color(255, 255, 255));
        StrisciaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/StrisciaP.jpg"))); // NOI18N
        Asfalto.add(StrisciaP);
        StrisciaP.setBounds(180, 0, 30, 510);

        Separatore3.setBackground(new java.awt.Color(255, 255, 255));
        Separatore3.setForeground(new java.awt.Color(255, 255, 255));
        Separatore3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Separatore.jpg"))); // NOI18N
        Asfalto.add(Separatore3);
        Separatore3.setBounds(0, 380, 810, 20);

        Separatore1.setBackground(new java.awt.Color(255, 255, 255));
        Separatore1.setForeground(new java.awt.Color(255, 255, 255));
        Separatore1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Separatore.jpg"))); // NOI18N
        Asfalto.add(Separatore1);
        Separatore1.setBounds(0, 120, 810, 20);

        Separatore2.setBackground(new java.awt.Color(255, 255, 255));
        Separatore2.setForeground(new java.awt.Color(255, 255, 255));
        Separatore2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Separatore.jpg"))); // NOI18N
        Asfalto.add(Separatore2);
        Separatore2.setBounds(0, 250, 810, 20);

        StrisciaA.setBackground(new java.awt.Color(255, 255, 255));
        StrisciaA.setForeground(new java.awt.Color(255, 255, 255));
        StrisciaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/StrisciaA.jpg"))); // NOI18N
        Asfalto.add(StrisciaA);
        StrisciaA.setBounds(810, 0, 70, 510);

        lista.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(lista);

        Panel.setLayout(null);

        bottoneAvvio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bottoneAvvio.setText("VIA!");
        bottoneAvvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAvvioActionPerformed(evt);
            }
        });
        Panel.add(bottoneAvvio);
        bottoneAvvio.setBounds(20, 340, 90, 31);

        Semaforo.setBackground(new java.awt.Color(255, 255, 255));
        Semaforo.setForeground(new java.awt.Color(255, 255, 255));
        Semaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Semaforo.jpg"))); // NOI18N
        Panel.add(Semaforo);
        Semaforo.setBounds(0, 10, 134, 287);

        statoGara.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statoGara.setText("Gara non ancora iniziata");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Asfalto, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(statoGara))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Asfalto, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statoGara)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneAvvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAvvioActionPerformed

        Giudice giudice = new Giudice(this, nomeAtleta1, nomeAtleta2, nomeAtleta3, nomeAtleta4);
        giudice.start();
        this.bottoneAvvio.setEnabled(false);
    }//GEN-LAST:event_bottoneAvvioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Asfalto;
    private javax.swing.JPanel Panel;
    public javax.swing.JLabel Semaforo;
    public javax.swing.JLabel Separatore1;
    public javax.swing.JLabel Separatore2;
    public javax.swing.JLabel Separatore3;
    public javax.swing.JLabel StrisciaA;
    public javax.swing.JLabel StrisciaP;
    private javax.swing.JButton bottoneAvvio;
    public javax.swing.JLabel icoAtleta1;
    public javax.swing.JLabel icoAtleta2;
    public javax.swing.JLabel icoAtleta3;
    public javax.swing.JLabel icoAtleta4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList<String> lista;
    public javax.swing.JLabel statoGara;
    // End of variables declaration//GEN-END:variables
}
