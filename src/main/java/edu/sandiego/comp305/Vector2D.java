package edu.sandiego.comp305;

/**
 * Every operation returns a new Vector2D.
 * Used for positions, velocities, and forces in the physics simulation.
 */
public final class Vector2D {

    public static final Vector2D ZERO = new Vector2D(0.0, 0.0);

    private final double x;

    private final double y;

    public Vector2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return 0.0;
    }

    public double getY() {
        return 0.0;
    }

    public Vector2D add(final Vector2D other) {
        return null;
    }

    public Vector2D subtract(final Vector2D other) {
        return null;
    }

    public Vector2D scale(final double s) {
        return null;
    }

    public double magnitude() {
        return 0.0;
    }

    public double magnitudeSquared() {
        return 0.0;
    }

    public double distanceTo(final Vector2D other) {
        return 0.0;
    }

    public double distanceSquaredTo(final Vector2D other) {
        return 0.0;
    }

    public Vector2D normalize() {
        return null;
    }

    public double dot(final Vector2D other) {
        return 0.0;
    }

    @Override
    public boolean equals(final Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}