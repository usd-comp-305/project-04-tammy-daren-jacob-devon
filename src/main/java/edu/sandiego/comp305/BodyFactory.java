package edu.sandiego.comp305;

import java.util.List;

/**
 * Builds the celestial bodies for the Simulation.
 * Implementations decide which bodies exist and what their
 * starting state looks like
 */
public interface BodyFactory {

    /**
     * Returns the bodies that make up the initial state
     */
    public abstract List<CelestialBody> createSolarSystem();

    /**
     * Returns a new spaceship positioned at the given world-space
     * coordinates. Used when the user clicks to spawn a ship.
     */
    public abstract CelestialBody createSpaceship(double x, double y);
}
