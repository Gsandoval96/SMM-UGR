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
package sm.gss.eventos;

/**
 * Adapted de listener del lienzo
 * @author Guillermo Sandoval Schmidt
 * @see sm.gss.eventos.LienzoListener
 */
public class LienzoAdapter implements LienzoListener{
    
    /**
     * Indica que se ha añadido una forma al lienzo
     * @param evt Evento que se lanza cuando se añade una forma
     * @see sm.gss.eventos.LienzoEvent
     */
    @Override
    public void shapeAdded(LienzoEvent evt){}
}
