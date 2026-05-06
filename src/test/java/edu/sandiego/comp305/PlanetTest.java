package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlanetTest {

    @Test
    void getTypeReturnsPlanet() {
        final Planet planet = new Planet(
                "Earth", 1.0, 5.0,
                new Vector2D(10.0, 0.0), new Vector2D(0.0, 1.0));
        assertEquals(BodyType.PLANET, planet.getType());
    }

    @Test
    void getRadiusReturnsConstructorRadius() {
        final Planet planet = new Planet(
                "Earth", 1.0, 5.0,
                new Vector2D(10.0, 0.0), new Vector2D(0.0, 1.0));
        assertEquals(5.0, planet.getRadius());
    }
}
