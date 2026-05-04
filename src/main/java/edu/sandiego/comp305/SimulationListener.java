package edu.sandiego.comp305;

import java.util.List;

public interface SimulationListener {

    public abstract void onStateChanged(List<CelestialBody> bodies);

}

