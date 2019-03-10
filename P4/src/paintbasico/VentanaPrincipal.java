/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Guillermo Sandoval Schmidt
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoHerramientas = new javax.swing.ButtonGroup();
        GrupoColores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        botonLapiz = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonOvalo = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        colorNegro = new javax.swing.JToggleButton();
        colorRojo = new javax.swing.JToggleButton();
        colorAzul = new javax.swing.JToggleButton();
        colorBlanco = new javax.swing.JToggleButton();
        colorAmarillo = new javax.swing.JToggleButton();
        colorVerde = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        checkRelleno = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        nombreHerramienta = new javax.swing.JLabel();
        lienzo = new paintbasico.Lienzo();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemNuevo = new javax.swing.JMenuItem();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        menuStatusBar = new javax.swing.JCheckBoxMenuItem();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PaintBásico - Guillermo Sandoval Schmidt");

        jPanel1.setBorder(null);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        GrupoHerramientas.add(botonLapiz);
        botonLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        botonLapiz.setSelected(true);
        botonLapiz.setFocusable(false);
        botonLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLapiz.addActionListener(formListener);
        jToolBar1.add(botonLapiz);

        GrupoHerramientas.add(botonLinea);
        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(formListener);
        jToolBar1.add(botonLinea);

        GrupoHerramientas.add(botonRectangulo);
        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        botonRectangulo.setFocusable(false);
        botonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRectangulo.addActionListener(formListener);
        jToolBar1.add(botonRectangulo);

        GrupoHerramientas.add(botonOvalo);
        botonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        botonOvalo.setFocusable(false);
        botonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOvalo.addActionListener(formListener);
        jToolBar1.add(botonOvalo);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(2, 3));

        colorNegro.setBackground(new java.awt.Color(1, 1, 1));
        GrupoColores.add(colorNegro);
        colorNegro.setSelected(true);
        colorNegro.setPreferredSize(new java.awt.Dimension(30, 25));
        colorNegro.addActionListener(formListener);
        jPanel3.add(colorNegro);

        colorRojo.setBackground(new java.awt.Color(255, 0, 0));
        GrupoColores.add(colorRojo);
        colorRojo.setPreferredSize(new java.awt.Dimension(30, 25));
        colorRojo.addActionListener(formListener);
        jPanel3.add(colorRojo);

        colorAzul.setBackground(new java.awt.Color(0, 0, 255));
        GrupoColores.add(colorAzul);
        colorAzul.setPreferredSize(new java.awt.Dimension(30, 25));
        colorAzul.addActionListener(formListener);
        jPanel3.add(colorAzul);

        colorBlanco.setBackground(new java.awt.Color(255, 255, 255));
        GrupoColores.add(colorBlanco);
        colorBlanco.addActionListener(formListener);
        jPanel3.add(colorBlanco);

        colorAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        GrupoColores.add(colorAmarillo);
        colorAmarillo.addActionListener(formListener);
        jPanel3.add(colorAmarillo);

        colorVerde.setBackground(new java.awt.Color(0, 255, 0));
        GrupoColores.add(colorVerde);
        colorVerde.setPreferredSize(new java.awt.Dimension(30, 25));
        colorVerde.addActionListener(formListener);
        jPanel3.add(colorVerde);

        jPanel2.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        checkRelleno.setText("Relleno ");
        checkRelleno.addActionListener(formListener);
        jPanel4.add(checkRelleno, java.awt.BorderLayout.LINE_END);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        nombreHerramienta.setText("Punto");
        jPanel5.add(nombreHerramienta, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        jPanel1.add(lienzo, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        menuItemNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/documento.png"))); // NOI18N
        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.addActionListener(formListener);
        menuArchivo.add(menuItemNuevo);

        menuItemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carpeta.png"))); // NOI18N
        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(formListener);
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        menuItemGuardar.setText("Guardar");
        menuItemGuardar.addActionListener(formListener);
        menuArchivo.add(menuItemGuardar);

        barraMenu.add(menuArchivo);

        menuEdicion.setText("Edición");

        menuStatusBar.setSelected(true);
        menuStatusBar.setText("Ver barra de estado");
        menuStatusBar.addActionListener(formListener);
        menuEdicion.add(menuStatusBar);

        barraMenu.add(menuEdicion);

        setJMenuBar(barraMenu);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == botonLapiz) {
                VentanaPrincipal.this.botonLapizActionPerformed(evt);
            }
            else if (evt.getSource() == botonLinea) {
                VentanaPrincipal.this.botonLineaActionPerformed(evt);
            }
            else if (evt.getSource() == botonRectangulo) {
                VentanaPrincipal.this.botonRectanguloActionPerformed(evt);
            }
            else if (evt.getSource() == botonOvalo) {
                VentanaPrincipal.this.botonOvaloActionPerformed(evt);
            }
            else if (evt.getSource() == colorNegro) {
                VentanaPrincipal.this.colorNegroActionPerformed(evt);
            }
            else if (evt.getSource() == colorRojo) {
                VentanaPrincipal.this.colorRojoActionPerformed(evt);
            }
            else if (evt.getSource() == colorAzul) {
                VentanaPrincipal.this.colorAzulActionPerformed(evt);
            }
            else if (evt.getSource() == colorBlanco) {
                VentanaPrincipal.this.colorBlancoActionPerformed(evt);
            }
            else if (evt.getSource() == colorAmarillo) {
                VentanaPrincipal.this.colorAmarilloActionPerformed(evt);
            }
            else if (evt.getSource() == colorVerde) {
                VentanaPrincipal.this.colorVerdeActionPerformed(evt);
            }
            else if (evt.getSource() == checkRelleno) {
                VentanaPrincipal.this.checkRellenoActionPerformed(evt);
            }
            else if (evt.getSource() == menuItemNuevo) {
                VentanaPrincipal.this.menuItemNuevoActionPerformed(evt);
            }
            else if (evt.getSource() == menuItemAbrir) {
                VentanaPrincipal.this.menuItemAbrirActionPerformed(evt);
            }
            else if (evt.getSource() == menuItemGuardar) {
                VentanaPrincipal.this.menuItemGuardarActionPerformed(evt);
            }
            else if (evt.getSource() == menuStatusBar) {
                VentanaPrincipal.this.menuStatusBarActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void botonLapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLapizActionPerformed
        lienzo.setMode(DrawMode.POINT);
        nombreHerramienta.setText("Punto");
    }//GEN-LAST:event_botonLapizActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        lienzo.setMode(DrawMode.LINE);
        nombreHerramienta.setText("Línea");
    }//GEN-LAST:event_botonLineaActionPerformed

    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        lienzo.setMode(DrawMode.RECT);
        nombreHerramienta.setText("Rectángulo");
    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOvaloActionPerformed
        lienzo.setMode(DrawMode.OVAL);
        nombreHerramienta.setText("Óvalo");
    }//GEN-LAST:event_botonOvaloActionPerformed

    private void checkRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRellenoActionPerformed
        lienzo.setFilled(rootPaneCheckingEnabled);
    }//GEN-LAST:event_checkRellenoActionPerformed

    private void colorNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorNegroActionPerformed
        lienzo.setColor(Color.BLACK);
    }//GEN-LAST:event_colorNegroActionPerformed

    private void colorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRojoActionPerformed
        lienzo.setColor(Color.RED);
    }//GEN-LAST:event_colorRojoActionPerformed

    private void colorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAzulActionPerformed
        lienzo.setColor(Color.BLUE);
    }//GEN-LAST:event_colorAzulActionPerformed

    private void colorBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlancoActionPerformed
        lienzo.setColor(Color.WHITE);
    }//GEN-LAST:event_colorBlancoActionPerformed

    private void colorAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAmarilloActionPerformed
        lienzo.setColor(Color.YELLOW);
    }//GEN-LAST:event_colorAmarilloActionPerformed

    private void colorVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorVerdeActionPerformed
        lienzo.setColor(Color.GREEN);
    }//GEN-LAST:event_colorVerdeActionPerformed

    private void menuStatusBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStatusBarActionPerformed
        jPanel5.setVisible(menuStatusBar.isSelected());
    }//GEN-LAST:event_menuStatusBarActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        lienzo.reset();
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_menuItemGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoColores;
    private javax.swing.ButtonGroup GrupoHerramientas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JToggleButton botonLapiz;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JToggleButton botonOvalo;
    private javax.swing.JToggleButton botonRectangulo;
    private javax.swing.JCheckBox checkRelleno;
    private javax.swing.JToggleButton colorAmarillo;
    private javax.swing.JToggleButton colorAzul;
    private javax.swing.JToggleButton colorBlanco;
    private javax.swing.JToggleButton colorNegro;
    private javax.swing.JToggleButton colorRojo;
    private javax.swing.JToggleButton colorVerde;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToolBar jToolBar1;
    private paintbasico.Lienzo lienzo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JCheckBoxMenuItem menuStatusBar;
    private javax.swing.JLabel nombreHerramienta;
    // End of variables declaration//GEN-END:variables
}