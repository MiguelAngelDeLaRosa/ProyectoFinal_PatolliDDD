/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import aplicacion.Aplicacion;
import composite.TableroGraphic;
import dto.DTOCasilla;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 *
 * @author gerar
 */
public class FrmTablero extends javax.swing.JFrame implements Observer {

    private TableroGraphic tablero;
    private Aplicacion casosDeUso; 
    private Graphics g;
    private int numeroDeJugadorEnTurno;
    
    public FrmTablero(Aplicacion casosDeUso) {
        initComponents();
        this.casosDeUso = casosDeUso;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        tablero = new TableroGraphic(casosDeUso.enviarTableroAPresentacion());
        tablero.dibujar(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLanzarDados = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        caña1 = new javax.swing.JLabel();
        caña2 = new javax.swing.JLabel();
        caña3 = new javax.swing.JLabel();
        caña4 = new javax.swing.JLabel();
        caña5 = new javax.swing.JLabel();
        btnSiguienteTurno = new javax.swing.JButton();
        btnIniciarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLanzarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/txtLanzarDados.png"))); // NOI18N
        btnLanzarDados.setEnabled(false);
        btnLanzarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarDadosActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/txtSalir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png"))); // NOI18N
        caña1.setText("asda");

        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png"))); // NOI18N
        caña2.setText("asda");

        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png"))); // NOI18N
        caña3.setText("asda");

        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png"))); // NOI18N
        caña4.setText("asda");

        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png"))); // NOI18N
        caña5.setText("asda");

        btnSiguienteTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/txtSiguienteTurno.png"))); // NOI18N
        btnSiguienteTurno.setEnabled(false);
        btnSiguienteTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteTurnoActionPerformed(evt);
            }
        });

        btnIniciarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/txtIniciarPartida.png"))); // NOI18N
        btnIniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(caña1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caña2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caña3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caña4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caña5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSiguienteTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLanzarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSiguienteTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLanzarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caña1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caña4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        getAccessibleContext().setAccessibleName("Tablero");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnLanzarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadosActionPerformed
        lanzarCañas();
        System.out.println("avance" + avanceD);
        btnLanzarDados.setEnabled(false);
        siguienteTurno();

    }//GEN-LAST:event_btnLanzarDadosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSiguienteTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteTurnoActionPerformed
        limpiarCañas();
        btnLanzarDados.setEnabled(true);
    }//GEN-LAST:event_btnSiguienteTurnoActionPerformed

    private void btnIniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarPartidaActionPerformed
        btnLanzarDados.setEnabled(true);
        btnSiguienteTurno.setEnabled(true);
        btnIniciarPartida.setVisible(false);
        numeroDeJugadorEnTurno = 1;
    }//GEN-LAST:event_btnIniciarPartidaActionPerformed

    int avanceD;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarPartida;
    private javax.swing.JButton btnLanzarDados;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguienteTurno;
    private javax.swing.JLabel caña1;
    private javax.swing.JLabel caña2;
    private javax.swing.JLabel caña3;
    private javax.swing.JLabel caña4;
    private javax.swing.JLabel caña5;
    // End of variables declaration//GEN-END:variables
    /**
     * Método que lanza las cañas y actualiza en el Frame Tablero la cantidad de
     * cañas que fueron lanzadas (utilizado actualmente como un dado, en futuro
     * será un ArrayList para tener cada caña como individual, y con un
     * randomizer de 1 o 0)
     *
     * @return regresa la cantidad de pasos a avanzar con las cañas
     */
    public int lanzarCañas() {
        Random dado = new Random();
        int numeroCanias;
        numeroCanias = dado.nextInt(6);
        if (numeroCanias == 0) {
            avanceD = 0;
        }
        if (numeroCanias == 1) {

            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            avanceD = 1;
        }
        if (numeroCanias == 2) {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            avanceD = 2;
        }
        if (numeroCanias == 3) {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            avanceD = 3;
        }
        if (numeroCanias == 4) {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            avanceD = 4;
        }
        if (numeroCanias == 5) {
            caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaP.png")));
            avanceD = 5;
        }
        System.out.println("dado =" + numeroCanias);

        return numeroCanias;

    }
    /**
     * Método que limpia las cañas, este método se planea eliminar 
     */
    private void limpiarCañas() {
        caña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png")));
        caña2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png")));
        caña3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png")));
        caña4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png")));
        caña5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/Imagenes/cañaL.png")));
    }

    private void siguienteTurno() {

    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
