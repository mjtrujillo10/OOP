/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import com.sun.prism.paint.Color;

/**
 *
 * @author manuel
 */
class Player {
    private String name;
    private Color discColor;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the discColor
     */
    public Color getColor() {
        return discColor;
    }

    /**
     * @param discColor the discColor to set
     */
    public void setColor(Color discColor) {
        this.discColor = discColor;
    }
}
