/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaFinal;

import java.awt.Dimension;
import sm.gss.iu.LienzoImagen2D;

/**
 *
 * @author gsandoval
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    public LienzoImagen2D getLienzo2D() {
        return lienzoImagen2D;
    }

    /**
     * Creates new form VentanaInterna
     */
    public VentanaInterna() {
        initComponents();
    }  
    
    public void setLimit(Dimension d){
        this.setMaximumSize(d);
        this.setPreferredSize(d);
        this.lienzoImagen2D.setMaximumSize(d);
        this.lienzoImagen2D.setPreferredSize(d);
        this.setSize(d);
        this.lienzoImagen2D.setSize(d);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lienzoImagen2D = new sm.gss.iu.LienzoImagen2D();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout lienzoImagen2DLayout = new javax.swing.GroupLayout(lienzoImagen2D);
        lienzoImagen2D.setLayout(lienzoImagen2DLayout);
        lienzoImagen2DLayout.setHorizontalGroup(
            lienzoImagen2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        lienzoImagen2DLayout.setVerticalGroup(
            lienzoImagen2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(lienzoImagen2D);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        ((VentanaPrincipal)(this.getParent().getParent().getParent().getParent().getParent().getParent().getParent())).vaciarLista();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        ((VentanaPrincipal)(this.getParent().getParent().getParent().getParent().getParent().getParent().getParent())).cambiarLista();
    }//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private sm.gss.iu.LienzoImagen2D lienzoImagen2D;
    // End of variables declaration//GEN-END:variables
}
