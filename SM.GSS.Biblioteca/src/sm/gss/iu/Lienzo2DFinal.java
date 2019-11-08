/*
 * Copyright (C) 2019 Guillermo Sandoval Schmidt
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package sm.gss.iu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import sm.gss.eventos.*;
import sm.gss.graficos.Linea;
import sm.gss.graficos.Ovalo;
import sm.gss.graficos.Rectangulo;
import sm.gss.graficos.TipoRelleno;
import sm.gss.graficos.TipoTrazo;
import sm.gss.graficos.Trazo;

/**
 * Lienzo que gestiona elementos gráficos
 * @author Guillermo Sandoval Schmidt
 */
public class Lienzo2DFinal extends javax.swing.JPanel {

    /**
     * Modo de dibujo del lienzo
     */
    private DrawMode modo;
    
    /**
     * Color de trazo usado para crear figuras en el lienzo
     */
    private Color colorT;
    
    /**
     * Grado de tranparencia usado para crear figuras en el lienzo
     */
    private float transparencia;
    
    /**
     * Grosor de trazo usado para crear figuras en el lienzo
     */
    private int grosor;
    
    /**
     * Indica si las figuras creadas serán alisadas o no
     */
    private boolean alisado;
    
    /**
     * Tipo de trazo usado para crear figuras en el lienzo
     */
    private TipoTrazo tipoT;
    
    /**
    * Color de relleno usado para crear figuras en el lienzo
    */
    private Color colorR;
    
    /**
    * Tipo de relleno usado para crear figuras en el lienzo
    */
    private TipoRelleno tipoR;  
    
    /**
    * Lista de listeners asociados al lienzo
    */    
    ArrayList<LienzoListener> lienzoEventListeners = new ArrayList();
    
    /**
    * Índice que indica la figura actual del lienzo
    */
    private int figuraActual;
    
    /**
    * Punto inicial y final auxiliar para crear figuras en el lienzo
    * @see java.awt.Point
    */
    private Point ini, fin;
    
    /**
     * Añade un listener al lista de listeners del lienzo
     * @param listener Listener a añadir a la lista
     */
    public void addLienzoListener(LienzoListener listener){
        if (listener != null) {
            lienzoEventListeners.add(listener);
        }
    }
    /**
     * Añade un evento que notfica de la addición de una figura a los elementos 
     * de la lista de listeners del lienzo
     * @param evt Evento a añadir a la lista
     */
    private void notifyShapeAddedEvent(LienzoEvent evt) {
        if (!lienzoEventListeners.isEmpty()) {
            for (LienzoListener listener : lienzoEventListeners) {
                listener.shapeAdded(evt);
            }
        }
    }
    
    /**
     * Getter del parámetro 'modo'
     * @return Devuelve el modo de dibujo
     */
    public DrawMode getModo() {
        return modo;
    }

    /**
     * Setter del parámetro 'modo'
     * @param modo Nuevo valor del modo de dibujo
     */
    public void setModo(DrawMode modo) {
        this.modo = modo;
    }
    
    /**
     * Getter del parámetro 'colorT'
     * @return Devuelve el color de trazo
     */
    public Color getColorT() {
        return colorT;
    }
    
    /**
     * Setter del parámetro 'colorT'
     * @param colorT Nuevo valor del color del trazo
     */
    public void setColorT(Color colorT) {
        this.colorT = colorT;
    }

    /**
     * Getter del parámetro 'transparencia'
     * @return Devuelve el grado de transparencia
     */
    public float getTransparencia() {
        return transparencia;
    }
    
    /**
     * Setter del parámetro 'transparencia'
     * @param transparencia Nuevo valor del grado de transparencia
     */
    public void setTransparencia(float transparencia) {
        this.transparencia = transparencia;
    }
    
    /**
     * Getter del parámetro 'grosor'
     * @return Devuelve el grosor de trazo
     */
    public int getGrosor() {
        return grosor;
    }
    
    /**
     * Setter del parámetro 'grosor'
     * @param grosor Nuevo valor del grosor del trazo
     */
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    /**
     * Getter del parámetro 'alisado'
     * @return Devuelve si usamos alisado o no
     */    
    public boolean isAlisado() {
        return alisado;
    }

    /**
     * Setter del parámetro 'alisado'
     * @param alisado Indica si alisamos o no las figuras
     */
    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }

    /**
     * Getter del parámetro 'tipoT'
     * @return Devuelve el tipo de trazo
     */
    public TipoTrazo getTipoT() {
        return tipoT;
    }
    
    /**
     * Setter del parámetro 'tipoT'
     * @param tipoT Nuevo valor del tipo del trazo
     */
    public void setTipoT(TipoTrazo tipoT) {
        this.tipoT = tipoT;
    }

    /**
     * Getter del parámetro 'colorR'
     * @return Devuelve el color de relleno
     */
    public Color getColorR() {
        return colorR;
    }
    
    /**
     * Setter del parámetro 'colorR'
     * @param colorR Nuevo valor del color de relleno
     */
    public void setColorR(Color colorR) {
        this.colorR = colorR;
    }
    
    /**
     * Getter del parámetro 'tipoR'
     * @return Devuelve el tipo de trazo
     */
    public TipoRelleno getTipoR() {
        return tipoR;
    }
    
    /**
     * Setter del parámetro 'tipoT'
     * @param tipoR Nuevo valor del tipo de trazo
     */
    public void setTipoR(TipoRelleno tipoR) {
        this.tipoR = tipoR;
    }

    /**
     * Getter del parámetro 'formas'
     * @return Devuelve la lista de formas asociadas al lienzo
     */
    public List<Trazo> getFormas() {
        return formas;
    }
    
    /**
     * Setter del parámetro 'formas'
     * @param formas Nuevo lista de formas asociadas al lienzo
     */
    public void setFormas(List<Trazo> formas) {
        this.formas = formas;
    }
    
    /**
     * Devuelve una forma concreta de la lista de formas
     * @param t Trazo a buscar en la lista de formas
     * @return Devuelve la forma buscada
     */
    public Trazo getForma(Trazo t){
        return formas.get(formas.indexOf(t));
    }
    
    
    /**
     * Crea un nuevo Lienzo2D
     */
    public Lienzo2DFinal() {
        initComponents();      
        formas = new ArrayList<>();
    }
    
     /**
     * Dibuja las formas asociadas al lienzo, llamando al método draw de la
     * clase Trazo
     * @param g Graphics que utilizamos para dibujar los componentes
     * @see sm.gss.graficos.Trazo
     * @see java.awt.Graphics
     * @see java.awt.Graphics2D
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        for(Trazo s : formas){
            s.draw(g2d);          
        }
    }
    
     /**
     * Crea una nueva figura en función del modo de dibujo actual, lanzando el evento
     * asociado y añadiendo la figura a la lista de figuras asociada al lienzo
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public void nuevaFigura(){
        switch(modo){
            case LINE:
                Linea l = new Linea(colorT, transparencia, grosor, alisado, tipoT, ini);
                formas.add(l);
                notifyShapeAddedEvent( new LienzoEvent(this,l) );
                figuraActual = formas.size()-1;
            break;
            case RECT:
                Rectangulo r = new Rectangulo(colorT, transparencia, grosor, alisado, tipoT, colorR, tipoR,ini);
                formas.add(r);
                notifyShapeAddedEvent( new LienzoEvent(this,r) );
                figuraActual = formas.size()-1;
                break;
            case OVAL:
                Ovalo ov = new Ovalo(colorT, transparencia, grosor, alisado, tipoT, colorR, tipoR, ini);
                formas.add(ov);
                notifyShapeAddedEvent( new LienzoEvent(this,ov) );
                figuraActual = formas.size()-1;
            break;            
        }
    }

    /**
     * Actualiza el punto final de la figura actual de la lista de figuras del lienzo
     */
    private void updateShape(){
            formas.get(figuraActual).setFin(fin);         
    }
    
    /**
     * Elimina el trazo pasado de la lista de figuras del lienzo
     * @param t Trazo a eliminar de la lista de figuras del lienzo
     * @see sm.gss.graficos.Trazo
     */
    public void eliminar(Trazo t){
        if(!formas.isEmpty()){
            formas.remove(t);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(254, 254, 254));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        ini = evt.getPoint(); 
        nuevaFigura();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        fin = evt.getPoint();
        this.updateShape();
        this.repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.formMouseDragged(evt);
    }//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    /**
    * Lista de formas asociadas al lienzo
    */
    private List<Trazo> formas;
    
    
}
