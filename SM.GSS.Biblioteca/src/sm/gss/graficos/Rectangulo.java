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

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;

/**
 * Clase que representa rectángulos bidimensionales que extiende a la clase 
 * abstracta Figura
 * @author Guillermo Sandoval Schmidt
 * @see sm.gss.graficos.Figura
 */
public class Rectangulo extends Figura{
    /**
    * Punto inicial y final para crear rectángulos
    * @see java.awt.Point
    */
    private Point ini, fin;
    
    /**
     * Crea una nueva figura, llamando primero al contructor de Trazo
     * @param color Color del borde del nuevo rectángulo
     * @param transparencia Grado de transparencia del nuevo rectángulo
     * @param grosor Grosor del borde del nuevo rectángulo
     * @param alisado Indica si el nuevo rectánguloa está alisada o no
     * @param tipoT Tipo de borde del nuevo rectángulo
     * @param c Color de relleno del nuevo rectángulo
     * @param t Tipo de relleno del nuevo rectángulo
     * @param x Punto inicial del nuevo rectángulo
     * @see sm.gss.graficos.TipoRelleno
     * @see sm.gss.graficos.TipoTrazo
     * @see java.awt.Point
     * @see java.awt.Color
     */
    public Rectangulo(Color color, float transparencia, int grosor, boolean alisado, TipoTrazo tipoT, Color c, TipoRelleno t, Point x) {
        super(color, transparencia, grosor, alisado, tipoT, c, t);
        ini = x;
    }
    
    /**
     * Método toString simplificado de la clase 'Rectangulo'
     * @return Devuelve el nombre simplificado de la clase 'Rectangulo'
     */
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    } 

    /**
     * Getter del parámetro 'ini'
     * @return Devuelve el punto inicial del rectángulo
     * @see java.awt.Point
     */ 
    @Override
    public Point getIni() {
        return ini;
    }
    
    /**
     * Setter del parámetro 'ini'
     * @param ini Nuevo valor del punto inicial del rectángulo
     * @see java.awt.Point
     */ 
    @Override
    public void setIni(Point ini) {
        this.ini = ini;
    }
    
    /**
     * Getter del parámetro 'fin'
     * @return Devuelve el punto final del rectángulo
     * @see java.awt.Point
     */ 
    public Point getFin() {
        return fin;
    }
    
    /**
     * Setter del parámetro 'fin'
     * @param fin Nuevo valor del punto final del rectángulo
     * @see java.awt.Point
     */ 
    @Override
    public void setFin(Point fin) {
        this.fin = fin;
    }
    
    
     /**
     * Establece las propiedades del rectángulo relacionadas con transparencia, alisado,
     * tipo de trazo, grosor, relleno, color, y pinta el rectángulo con sus respectivas características.
     * @param g2d Graphics2D que utilizamos para dibujar los componentes
     * @see java.awt.Graphics2D
     * @see sm.gss.graficos.TipoRelleno
     * @see java.awt.GradientPaint
     * @see java.awt.Rectangle
     * @see java.awt.Stroke
     * @see java.awt.BasicStroke
     */
    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
        Rectangle r = new Rectangle(ini);
        if(ini!=null && fin !=null){
            r.setFrameFromDiagonal(ini, fin);        
        
            if(getTipoR()==TipoRelleno.PLAIN){
                g2d.setPaint(getColorR());
                g2d.fill(r);
            }

            else if(getTipoR()==TipoRelleno.D_VERTICAL){
                int x = (ini.x - fin.x)/2;
                GradientPaint c = new GradientPaint(x, ini.y, getColorT(), x, fin.y, getColorR());
                g2d.setPaint(c);
                g2d.fill(r);
            }

            else if(getTipoR()==TipoRelleno.D_HORIZONTAL){
                int y = (ini.y - fin.y)/2;
                GradientPaint c = new GradientPaint(ini.x, y, getColorT(), fin.x, y, getColorR());
                g2d.setPaint(c);
                g2d.fill(r);
            }

            else if(getTipoR()==TipoRelleno.D_DIAGONAL){
                GradientPaint c = new GradientPaint(ini.x, ini.y, getColorT(), fin.x, fin.y, getColorR());
                g2d.setPaint(c);
                g2d.fill(r);
            }

            g2d.setPaint(getColorT());
            g2d.draw(r);

            if(isSeleccion()){                 
                Rectangle re = new Rectangle();
                Point i = new Point(ini.x -5, ini.y -5);
                Point f = new Point(fin.x +5, fin.y +5);
                re.setFrameFromDiagonal(i, f);
                Stroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 , new float[]{1*5}, 0); 
                g2d.setStroke(stroke);
                g2d.setPaint(Color.RED);
                g2d.draw(re);
            }
 
        }

    }
    
    /**
     * Método que mueve el rectángulo a un punto destino
     * @param p Punto al que se moverá el rectángulo
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
