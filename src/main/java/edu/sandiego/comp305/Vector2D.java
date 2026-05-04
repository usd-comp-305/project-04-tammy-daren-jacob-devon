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
        return x;
    }

    public double getY() {
        return y;
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Vector2D other)) {
            return false;
        }
        return Double.compare(x, other.x) == 0
                && Double.compare(y, other.y) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
