/*
 *	Author:      Jean-Adrien Chartron
 *	Date:        //
 */

package ch.epfl.rigel.math;

import ch.epfl.rigel.Preconditions;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class ClosedInterval extends Interval {

    private ClosedInterval(double low, double high) {
        super(low, high);
    }

    public static ClosedInterval of(double low, double high) {
        Preconditions.checkArgument(low < high);
        return new ClosedInterval(low, high);
    }

    public static ClosedInterval symmetric(double size) {
        Preconditions.checkArgument(size > 0.0);
        return new ClosedInterval(0.0 - size, 0.0 + size);
    }

    double clip(double v) {
        // Ecretage
    }

    @Override
    public boolean contains(double v) {
       return Preconditions.checkArgument(v < ?? & v > ??);
    }

    public String toString(String name, double value) {
        return String.format(Locale.ROOT, "La constante %s vaut %.2f.", name, value);
    }
}
