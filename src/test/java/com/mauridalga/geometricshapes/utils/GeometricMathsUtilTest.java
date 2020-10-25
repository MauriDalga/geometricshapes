package com.mauridalga.geometricshapes.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeometricMathsUtilTest {

    @Test
    public void CalculateCircleDiameter_WhitNullRadius_ShouldReturnNull() {
        // Arrange
        Double circleRadius = null;

        // Act
        Double result = GeometricMathsUtil.calculateCircleDiameter(circleRadius);

        //Assert
        assertNull(result);
    }

    @Test
    public void CalculateCircleDiameter_WhitPositiveRadius_ShouldReturnExpectedDiameter() {
        // Arrange
        Double circleRadius = 5.5;
        Double expectedDiameter = 11d;

        // Act
        Double result = GeometricMathsUtil.calculateCircleDiameter(circleRadius);

        //Assert
        assertEquals(expectedDiameter, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateCircleDiameter_WhitNegativeRadius_ShouldThrowException() {
        // Arrange
        Double circleRadius = -3.3;

        // Act
        Double result = GeometricMathsUtil.calculateCircleDiameter(circleRadius);
    }
}