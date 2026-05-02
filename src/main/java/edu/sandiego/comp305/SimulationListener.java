package edu.sandiego.comp305;
import java.util.List;

public interface SimulationListener {

    void onStateChanged(List<CelestialBody> bodies);

}

