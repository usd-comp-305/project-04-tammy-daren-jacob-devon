package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StarTest {

    @Test
    void getTypeReturnsStar() {
        final Star star = new Star("Sun", 100.0, Vector2D.ZERO, Vector2D.ZERO);
        assertEquals(BodyType.STAR, star.getType());
    }
}
