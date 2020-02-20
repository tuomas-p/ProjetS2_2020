/*
 *	Author:      Jean-Adrien Chartron
 *	Date:        //
 */

package ch.epfl.rigel.math;

import java.util.Scanner;
import java.util.ArrayList;

public final class Angle {
    public static final double TAU = 2 * Math.PI;
    private static final double DEG_PER_RAD = 360.0/TAU;
    private static final double RAD_PER_DEG = TAU/360.0;
    private static final double HR_PER_RAD = 24.0/TAU;
    private static final double RAD_PER_HR = TAU/24.0;


    public static double normalizePositive(double rad){}
    public static double ofArcsec(double sec){}
    public static double ofDMS(int deg, int min, double sec){}
    public static double ofDeg(double deg){ return Math.toRadians(deg);}
    public static double toDeg(double rad){ return Math.toDegrees(rad);}
    public static double ofHr(double hr){ return hr * RAD_PER_HR;}
    public static double toHr(double rad){ return rad * HR_PER_RAD;}
}
