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
package sm.gss.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Line2D;

/**
 * Clase que representa línea bidimensionales que extiende a la clase 
 * abstracta Trazo
 * @author Guillermo Sandoval Schmidt
 * @see sm.gss.graficos.Trazo
 */
public class Linea extends Trazo{
    /**
    * Punto inicial y final para crear lineas
    * @see java.awt.Point
    */
    private Point ini, fin;

     /**
     * Crea una nueva línea, llamando primero al contructor de Trazo
     * @param color Color de la nueva línea
     * @param transparencia Grado de transparencia de la nueva línea
     * @param grosor Grosor de la nueva línea
     * @param alisado Indica si la nueva línea está alisada o no
     * @param tipo Tipo de trazo de la nueva línea
     * @param x Punto de inicio de la nueva línea
     * @see sm.gss.graficos.TipoTrazo
     */
    public Linea(Color color, float transparencia, int grosor, boolean alisado, TipoTrazo tipo, Point x) {
        super(color, transparencia, grosor, alisado, tipo);
        ini = x;
    }
    
    /**
     * Método toString simplificado de la clase 'Linea'
     * @return Devuelve el nombre simplificado de la clase 'Linea'
     */
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * Getter del parámetro 'ini'
     * @return Devuelve el punto inicial de la línea
     * @see java.awt.Point
     */ 
    @Override
    public Point getIni() {
        return ini;
    }
    
    /**
     * Setter del parámetro 'ini'
     * @param ini Nuevo valor del punto inicial de la línea
     * @see java.awt.Point
     */ 
    @Override
    public void setIni(Point ini) {
        this.ini = ini;
    }
    
    /**
     * Getter del parámetro 'fin'
     * @return Devuelve el punto final de la línea
     * @see java.awt.Point
     */ 
    public Point getFin() {
        return fin;
    }
    
    /**
     * Setter del parámetro 'fin'
     * @param fin Nuevo valor del punto final de la línea
     * @see java.awt.Point
     */ 
    @Override
    public void setFin(Point fin) {
        this.fin = fin;
    }
    
     /**
     * Establece las propiedades de la línea relacionadas con transparencia, alisado,
     * tipo de trazo, grosor y color y pinta la línea con sus respectivas características.
     * @param g2d Graphics2D que utilizamos para dibujar los componentes
     * @see java.awt.Graphics2D
     * @see java.awt.Rectangle
     * @see java.awt.Stroke
     * @see java.awt.BasicStroke
     * @see java.awt.geom.Line2D
     */
    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
        if(!(ini == null || fin == null)){  
            Line2D.Double l = new Line2D.Double(ini, fin);
            g2d.setPaint(getColorT());
            g2d.draw(l);
            
            if(isSeleccion()){
                Rectangle r = new Rectangle();
                Point i = new Point(ini.x -5, ini.y -5);
                Point f = new Point(fin.x +5, fin.y +5);
                r.setFrameFromDiagonal(i, f);
                Stroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 , new float[]{1*5}, 0); 
                g2d.setStroke(stroke);
                g2d.setPaint(Color.RED);
                g2d.draw(r);
            }
            
            
        }
    }
            
    /**
     * Getter del parámetro 'colorR'
     * @return Devuelve null ya que la línea no tiene color de relleno
     * @see java.awt.Point
     */ 
    @Override
    public Color getColorR() {
        return null;
    }
    
     /**
     * Getter del parámetro 'tipoR'
     * @return Devuelve null ya que la línea no tiene tipo de relleno
     * @see java.awt.Point
     */ 
    @Override
    public TipoRelleno getTipoR() {
        return null;
    }
    
     /**
     * Setter del parámetro 'colorR' que no hace nada ya que la línea no tiene
     * color de relleno
     * @param c Color de relleno 
     * @see java.awt.Color
     */ 
    @Override
    public void setColorR(Color c) {}
    
    /**
     * Setter del parámetro 'tipoR' que no hace nada ya que la línea no tiene
     * tipo de relleno
     * @param t Tipo de relleno
     * @see sm.gss.graficos.TipoRelleno
     */
    @Override
    public void setTipoR(TipoRelleno t){}

    /**
     * Método que mueve la línea a un punto destino
     * @param p Punto al que se moverá la línea
     * @see java.awt.Point
     */
    @Override
    public void move(Point p) {
        Point f = new Point((int)(fin.getX()+(p.getX()-ini.getX())),
                            (int)(fin.getY()+(p.getY()-ini.getY())));
        setFin(f);
        setIni(p);
    }
    
}
