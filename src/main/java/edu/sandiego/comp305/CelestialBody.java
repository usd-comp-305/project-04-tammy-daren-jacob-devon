package edu.sandiego.comp305;

public interface CelestialBody {

    public abstract Vector2D getPosition();

    public abstract double getMass();

    public abstract double getRadius();

    public abstract Vector2D getVelocity();

    public abstract BodyType getType();

    public abstract void applyForce(Vector2D force);

    public abstract void update(double dt);

}
