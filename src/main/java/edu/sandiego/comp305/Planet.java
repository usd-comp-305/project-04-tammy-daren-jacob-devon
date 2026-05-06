package edu.sandiego.comp305;

public class Planet extends AbstractBody {

    public Planet(final String name, final double mass, final double radius,
                  final Vector2D position, final Vector2D velocity) {
        super(name, mass, radius, position, velocity);
    }

    @Override
    public BodyType getType() {
        return BodyType.PLANET;
    }
}
