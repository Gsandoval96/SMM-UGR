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

import java.awt.Color;

/**
 * Clase abstracta que representa el concepto 'figura' que usaremos para
 * representar distintas formas gráficas con relleno que extiende a Trazo
 * @author Guillermo Sandoval Schmidt
 * @see sm.gss.graficos.Trazo
 */
public abstract class Figura extends Trazo{
    /**
     * Color de relleno de la figura
     * @see java.awt.Color
     */
    private Color colorR;
    
    /**
     * Tipo de relleno de la figura
     * @see sm.gss.graficos.TipoRelleno
     */
    private TipoRelleno tipoR;
    
    /**
     * Crea una nueva figura, llamando primero al contructor de Trazo
     * @param color Color del borde de la nueva figura
     * @param transparencia Grado de transparencia de la nueva figura
     * @param grosor Grosor de la nueva figura
     * @param alisado Indica si la nueva figura está alisada o no
     * @param tipoT Tipo de borde de la nueva figura
     * @param c Color de relleno de la nueva figura
     * @param t Tipo de relleno de la nueva figura
     * @see sm.gss.graficos.TipoRelleno
     * @see sm.gss.graficos.TipoTrazo
     */
    public Figura(Color color, float transparencia, int grosor, boolean alisado, TipoTrazo tipoT, Color c, TipoRelleno t) {
        super(color, transparencia, grosor, alisado, tipoT);
        colorR = c;
        tipoR = t;
    }

    /**
     * Getter del parámetro 'colorR'
     * @return Devuelve color de relleno de la figura
     */   
    @Override
    public Color getColorR() {
        return colorR;
    }
    
    /**
     * Setter del parámetro 'colorR'
     * @param colorR Nuevo valor del color de relleno de la figura
     */
    @Override
    public void setColorR(Color colorR) {
        this.colorR = colorR;
    }
    
    /**
     * Getter del parámetro 'tipoR'
     * @return Devuelve el tipo de relleno de la figura
     */
    @Override
    public TipoRelleno getTipoR() {
        return tipoR;
    }
    
    /**
     * Setter del parámetro 'tipoR'
     * @param tipoR Nuevo valor del tipo de relleno de la figura
     */
    @Override
    public void setTipoR(TipoRelleno tipoR) {
        this.tipoR = tipoR;
    }
}
