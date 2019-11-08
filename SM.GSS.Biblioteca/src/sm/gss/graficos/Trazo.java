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
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;

/**
 * Clase abstracta que representa el concepto 'forma' que usaremos para
 * representar distintas formas gráficas
 * @author Guillermo Sandoval Schmidt
 */
public abstract class Trazo {
    
    /**
     * Indica si el trazo está seleccionado o no
     */
    private boolean seleccion;
    
    /**
     * Color de la forma
     * @see java.awt.Color
     */
    private Color colorT;
    
    /**
     * Grado de transparencia de la forma
     */
    private float transparencia;
    
    /**
     * Grosor de la forma
     */
    private int grosor;
    
    /**
     * Indica si la forma es alisada o no
     */
    private boolean alisado;
    
    /**
     * Tipo de trazo usado por la forma
     * @see sm.gss.graficos.TipoTrazo
     */
    private TipoTrazo tipoT;
    
    /**
     * Elemento composite utilizado para dibujar el grado de transparencia
     * de la forma
     * @see java.awt.Composite
     */
    private Composite comp;
    
    /**
     * Elemento RenderingHints utilizado para dibujar el alisado de la forma
     * @see java.awt.RenderingHints
     */
    private RenderingHints render;
    
    /**
     * Elemento Stroke utilizado para dibujar el trazo de la forma
     * @see java.awt.Stroke
     */
    private Stroke stroke;


    /**
     * Crea un nuevo Trazo
     * @param color Color del nuevo trazo
     * @param transparencia Grado de transparencia del nuevo trazo
     * @param grosor Grosor del nuevo trazo
     * @param alisado Indica si el nuevo trazo está alisado o no
     * @param tipo Tipo de trazo del nuevo trazo
     * @see sm.gss.graficos.TipoTrazo
     */
    public Trazo(Color color, float transparencia, int grosor, boolean alisado, TipoTrazo tipo) {
        this.colorT = color;
        this.transparencia = transparencia;
        this.grosor = grosor;
        this.alisado = alisado;
        this.tipoT = tipo;
        seleccion = false;
    }

    /**
     * Getter del parámetro 'colorT'
     * @return Devuelve el color del trazo
     * @see java.awt.Color
     */
    public Color getColorT() {
        return colorT;
    }
    
    /**
     * Setter del parámetro 'colorT'
     * @param color Nuevo valor del color de trazo
     * @see java.awt.Color
     */
    public void setColorT(Color color) {
        this.colorT = color;
    }
    
    /**
     * Getter del parámetro 'transparencia'
     * @return Devuelve el grado de transparencia trazo
     */
    public float getTransparencia() {
        return transparencia;
    }
    
    /**
     * Setter del parámetro 'transparencia'
     * @param transparencia Nuevo valor del grado de transparencia del trazo
     */
    public void setTransparencia(float transparencia) {
        this.transparencia = transparencia;
    }
    
    /**
     * Getter del parámetro 'grosor'
     * @return Devuelve el grosor del trazo
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
     * @return Devuelve si el trazo está alisado o no
     */
    public boolean isAlisado() {
        return alisado;
    }
    
    /**
     * Setter del parámetro 'alisado'
     * @param alisado Indica si alisamos o no el trazo
     */
    public void setAlisado(boolean alisado) {
        this.alisado = alisado;
    }
    
    /**
     * Getter del parámetro 'seleccion'
     * @return Devuelve si el trazo está seleccionado o no
     */
    public boolean isSeleccion() {
        return seleccion;
    }
    
    /**
     * Setter del parámetro 'seleccion'
     * @param s Indica si el trazo está seleccionado o no
     */
    public void setSeleccion(boolean s) {
        seleccion = s;
    }
    
    /**
     * Getter del parámetro 'tipoT'
     * @return Devuelve el tipo de trazo 
     */
    public TipoTrazo getTipo() {
        return tipoT;
    }
    
    /**
     * Setter del parámetro 'tipoT'
     * @param tipo Nuevo valor del tipo de trazo
     */
    public void setTipoT(TipoTrazo tipo) {
        this.tipoT = tipo;
    }
    
     /**
     * Setter del parámetro 'fin' implementado en las clases finales
     * @param fin Nuevo valor del punto final de la línea
     * @see java.awt.Point
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract void setFin(Point fin);
    
    /**
     * Setter del parámetro 'colorR' implementado en las clases finales
     * @return Devuelve el color de relleno de la forma
     * @see java.awt.Color
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract Color getColorR();
    
    /**
     * Setter del parámetro 'ini' implementado en las clases finales
     * @param p Nuevo valor del punto inicial
     * @see java.awt.Point
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract void setIni(Point p);
    
    /**
     * Getter del parámetro 'ini' implementado en las clases finales
     * @return Devuelve el valor del punto inicial
     * @see java.awt.Point
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract Point getIni();
    
    /**
     * Setter del parámetro 'tipoR' implementado en las clases finales
     * @return Devuelve el tipo de relleno de la forma
     * @see java.awt.Color
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract TipoRelleno getTipoR();
    
    /**
     * Método que mueve un objeto implementado en las clases finales
     * @param p Punto al que se moverá el objeto
     * @see java.awt.Point
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract void move(Point p);
    
    /**
     * Setter del parámetro 'colorR' implementado en las clases finales
     *
     * @param c Nuevo valor del color de relleno
     * @see java.awt.Color
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract void setColorR(Color c);
    
     /**
     * Establece las propiedades del trazo relacionadas con transparencia, alisado,
     * tipo de trazo y grosor.
     * @param g2d Graphics2D que utilizamos para dibujar los componentes
     * @see java.awt.Graphics2D
     * @see java.awt.AlphaComposite
     * @see java.awt.BasicStroke
     * @see java.awt.RenderingHints
     */
    public void draw(Graphics2D g2d){
        comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparencia);
       
        if(alisado) render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        else render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        
        switch(tipoT){
            case BASIC:
                stroke = new BasicStroke(grosor);
            break;
            case LINE:
                stroke = new BasicStroke(grosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 , new float[]{grosor*5}, 0);
            break;
            case POINT:
                stroke = new BasicStroke(grosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0 , new float[]{grosor,2}, 0);
            break;
        }
        
        g2d.setComposite(comp);
        g2d.setStroke(stroke);
        g2d.setRenderingHints(render);

    }
    
    /**
     * Setter del parámetro 'tipoR' implementado en las clases finales
     *
     * @param t Nuevo valor del color de relleno
     * @see sm.gss.graficos.TipoRelleno
     * @see sm.gss.graficos.Linea
     * @see sm.gss.graficos.Rectangulo
     * @see sm.gss.graficos.Ovalo
     */
    public abstract void setTipoR(TipoRelleno t);

    

}
