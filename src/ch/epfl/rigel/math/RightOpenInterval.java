/*
 *	Author:      Jean-Adrien Chartron
 *	Date:        //
 */

package ch.epfl.rigel.math;

import java.util.Scanner;
import java.util.ArrayList;
import ch.epfl.rigel.Preconditions;

public final class RightOpenInterval extends Interval {
    private RightOpenInterval(double low, double high){ super(low, high); }

    public static RightOpenInterval of(double low, double high){
        Preconditions.checkArgument(low < high);
        return new RightOpenInterval(low, high);
    }

    public static RightOpenInterval symmetric(){

        // retourne un intervalle semi ouvert à droite
    }

    public double reduce(double v){
        //reduction de v à l'interval
    }

    @Override
    public boolean contains(double v) {
        return Preconditions.checkInInterval();
    }

    public String toString(){} //comme dans la classe clossedInterval
}
