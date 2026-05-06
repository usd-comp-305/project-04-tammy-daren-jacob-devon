package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds the default solar system and creates spaceships when the user clicks.
 * All the planet constants and setup logic lives here so the rest of the code
 * doesn't have to deal with it.
 */
public class SolarSystemFactory implements BodyFactory {

    private static final double SUN_MASS = 10000.0;

    private static final double SUN_RADIUS = 30.0;

    private static final double SPACESHIP_MASS = 1.0;

    private int spaceshipCount = 0;

    @Override
    public List<CelestialBody> createSolarSystem() {
        final List<CelestialBody> bodies = new ArrayList<>();

        bodies.add(createSun());

        // TODO: fill in real distance/mass/radius values for each planet
        bodies.add(createPlanet("Mercury",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Venus",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Earth",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Mars",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Jupiter",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Saturn",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Uranus",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));
        bodies.add(createPlanet("Neptune",
                /* distance */ 0, /* mass */ 0, /* radius */ 0));

        return bodies;
    }

    @Override
    public CelestialBody createSpaceship(final double x, final double y) {
        spaceshipCount++;
        final String name = "Spaceship-" + spaceshipCount;
        final Vector2D position = new Vector2D(x, y);
        return new Spaceship(name, SPACESHIP_MASS, position, Vector2D.ZERO);
    }

    private Star createSun() {
        return new Star("Sun", SUN_MASS, Vector2D.ZERO, Vector2D.ZERO);
    }

    // places the planet at (distance, 0)
    // and gives it a tangential velocity
    // so it starts in a roughly circular orbit
    private Planet createPlanet(
            final String name, final double distance, final double mass, final double radius) {
        final Vector2D position = new Vector2D(distance, 0);

        // TODO: v = sqrt(G * SUN_MASS / distance) — need to match whatever G
        //       the Simulation class uses
        final double tangentialSpeed = 0;
        final Vector2D velocity = new Vector2D(0, tangentialSpeed);

        return new Planet(name, mass, position, velocity);
    }

    public int getSpaceshipCount() {
        return spaceshipCount;
    }

    // used when the simulation resets
    public void resetSpaceshipCount() {
        spaceshipCount = 0;
    }
}
