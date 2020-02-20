/*
 *	Author:      Jean-Adrien Chartron
 *	Date:        //
 */

package ch.epfl.rigel.math;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class Interval {
    private final double low;
    private final double high;
    protected Interval (double low, double high){
        this.low = low;
        this.high = high;
    }

    private double low(){ return low; } //retourne la borne inférieur de l'intervalle
    private double high(){ return high; } // retourne la borne supérieur de l'intervalle
    private double size(){ return Math.abs(low) + Math.abs(high); } // retourne la taille de l'intervalle
    public abstract boolean contains(double v); //qui retourne vrai ssi la variable v appartient à l'intervalle

    @Override
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    /**ces deux dernière méthodes sont héritée de la classe object, afin qu'elles lèvent l'exception
     *  UnsupportedOperationException. Pour garantir qu'aucune sous-classe ne les redéfinira,
     *  ces méthodes sont déclarées finales.
     */

}
