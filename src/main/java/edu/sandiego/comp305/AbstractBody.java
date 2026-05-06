package edu.sandiego.comp305;

public abstract class AbstractBody implements CelestialBody {

    protected String name;

    protected double mass;

    protected Vector2D position;

    protected Vector2D velocity;

    private Vector2D netForce = Vector2D.ZERO;

    public AbstractBody(final String name,
                        final double mass,
                        final Vector2D position,
                        final Vector2D velocity) {
        this.name = name;
        this.mass = mass;
        this.position = position;
        this.velocity = velocity;
    }

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
    public Vector2D getVelocity() {
        return velocity;
    }

    @Override
    public void applyForce(final Vector2D force) {
        this.netForce = netForce.add(force);
    }

    @Override
    public void update(final double dt) {
        final Vector2D acceleration = netForce.scale(1.0 / mass);
        velocity = velocity.add(acceleration.scale(dt)); // v += a·dt
        position = position.add(velocity.scale(dt)); // x += v·dt
        netForce = Vector2D.ZERO; // reset for next tick
    }
}
