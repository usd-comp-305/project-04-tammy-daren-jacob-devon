package edu.sandiego.comp305;

public final class Spaceship extends AbstractBody {

    public Spaceship(final String name, final double mass, final double radius,
                     final Vector2D position, final Vector2D velocity) {
        super(name, mass, radius, position, velocity);
    }

    @Override
    public BodyType getType() {
        return BodyType.SPACESHIP;
    }
}
