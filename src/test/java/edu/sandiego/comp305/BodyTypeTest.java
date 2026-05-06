package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BodyTypeTest {

    @Test
    void starConstantNameMatches() {
        assertEquals("STAR", BodyType.STAR.name());
    }

    @Test
    void planetConstantNameMatches() {
        assertEquals("PLANET", BodyType.PLANET.name());
    }

    @Test
    void spaceshipConstantNameMatches() {
        assertEquals("SPACESHIP", BodyType.SPACESHIP.name());
    }

    @Test
    void hasExactlyThreeValues() {
        assertEquals(3, BodyType.values().length);
    }
}
