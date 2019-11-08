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

/**
 * Tipos de relleno que podemos usar
 * @author Guillermo Sandoval Schmidt
 */
public enum TipoRelleno {
    /**
     * Tipo de relleno vacío
     */
    EMPTY, 
    
    /**
     * Tipo de relleno plano (monocroma)
     */
    PLAIN, 
     
     /**
     * Tipo de relleno con degradado vertical (izquierda->derecha)
     */
    D_VERTICAL, 
    
    /**
     * Tipo de relleno con degradado horizontal (arriba->abajo)
     */
    D_HORIZONTAL, 
    
    /**
     * Tipo de relleno con degradado diagonal (esquina superior izquierda->
     * esquina inferior derecha)
     */
    D_DIAGONAL;
}
