/*
 *	Author:      Jean-Adrien Chartron
 *	Date:        //
 */

package ch.epfl.rigel;

import java.util.Scanner;
import java.util.ArrayList;
import ch.epfl.rigel.math.Interval;

public final class Preconditions {

    private Preconditions() {} // le constructuer est privé pour rendre impossible l'instanciation de la classe
    public static void checkArgument(boolean isTrue){
        if(isTrue == false){ throw new IllegalArgumentException("ERROR"); }
    }

    public static double checkInInterval(Interval interval, double value) {
        if()
        //qui lève l'exception IllegalArgumentException si value n'appartient pas à interval,
        // et retourne value sinon.
    }
}
