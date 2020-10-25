package com.mauridalga.geometricshapes.utils;

public final class GeometricMathsUtil {
    private GeometricMathsUtil() {
    }

    public static Double calculateCircleDiameter(Double circleRadius) {
        if(circleRadius == null) {
            return null;
        }

        if(circleRadius < 0) {
            throw new IllegalArgumentException("Circle radius cannot be negative");
        }

        return circleRadius * 2;
    }
}
