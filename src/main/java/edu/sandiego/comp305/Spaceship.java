package edu.sandiego.comp305;

public class Spaceship extends AbstractBody {

    public Spaceship(final String name, final double mass,
                     final Vector2D position, final Vector2D velocity) {
        super(name, mass, position, velocity);
    }

    @Override
    public BodyType getType() {
        return BodyType.SPACESHIP;
    }
}
