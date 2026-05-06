package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpaceshipTest {

    @Test
    void getTypeReturnsSpaceship() {
        final Spaceship ship = new Spaceship(
                "Ship-1", 1.0, Vector2D.ZERO, Vector2D.ZERO);
        assertEquals(BodyType.SPACESHIP, ship.getType());
    }
}
