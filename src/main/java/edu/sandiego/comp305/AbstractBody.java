package edu.sandiego.comp305;

public abstract class AbstractBody implements celestialBody {

    protected String name;

    protected double mass;

    protected Vector2D position;

    protected Vector2D velocity;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public Vector2D getPosition() {
        return position;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public void applyForce(final Vector2D force) {
        final Vector2D acceleration = force.scale(1.0 / mass); //a = F/m
        velocity = velocity.add(acceleration); // v = v0 + a (simplified)
    }

    @Override
    public void update(final double dt) {
        position = position.add(velocity.scale(dt)); // x = x0 + v*t
    }
}
