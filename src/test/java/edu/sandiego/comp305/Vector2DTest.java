package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Vector2DTest {

    @Test
    void getXReturnsConstructorX() {
        final Vector2D v = new Vector2D(3.0, 4.0);
        assertEquals(3.0, v.getX());
    }

    @Test
    void getYReturnsConstructorY() {
        final Vector2D v = new Vector2D(3.0, 4.0);
        assertEquals(4.0, v.getY());
    }

    @Test
    void zeroConstantHasZeroX() {
        assertEquals(0.0, Vector2D.ZERO.getX());
    }

    @Test
    void zeroConstantHasZeroY() {
        assertEquals(0.0, Vector2D.ZERO.getY());
    }

    @Test
    void negativeXIsPreserved() {
        assertEquals(-1.5, new Vector2D(-1.5, 2.5).getX());
    }

    @Test
    void negativeYIsPreserved() {
        assertEquals(-2.5, new Vector2D(1.5, -2.5).getY());
    }

    @Test
    void equalVectorsAreEqual() {
        final Vector2D a = new Vector2D(1.0, 2.0);
        final Vector2D b = new Vector2D(1.0, 2.0);
        assertEquals(a, b);
    }

    @Test
    void differentXMakesUnequal() {
        assertNotEquals(new Vector2D(1.0, 2.0), new Vector2D(9.0, 2.0));
    }

    @Test
    void differentYMakesUnequal() {
        assertNotEquals(new Vector2D(1.0, 2.0), new Vector2D(1.0, 9.0));
    }

    @Test
    void notEqualToNull() {
        assertNotEquals(new Vector2D(1.0, 2.0), null);
    }

    @Test
    void notEqualToOtherType() {
        final Object notAVector = "1, 2";
        assertNotEquals(new Vector2D(1.0, 2.0), notAVector);
    }

    @Test
    void equalVectorsHaveSameHashCode() {
        final Vector2D a = new Vector2D(1.0, 2.0);
        final Vector2D b = new Vector2D(1.0, 2.0);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void toStringIncludesX() {
        assertTrue(new Vector2D(1.5, -2.5).toString().contains("1.5"));
    }

    @Test
    void toStringIncludesY() {
        assertTrue(new Vector2D(1.5, -2.5).toString().contains("-2.5"));
    }

    @Test
    void toStringIsNotEmpty() {
        assertFalse(new Vector2D(0.0, 0.0).toString().isEmpty());
    }
}
