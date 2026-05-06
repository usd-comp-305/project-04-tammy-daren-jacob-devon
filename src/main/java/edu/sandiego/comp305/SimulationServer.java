package edu.sandiego.comp305;

import java.util.List;

public class SimulationServer implements SimulationListener {

    public SimulationServer(final Simulation simulation){
    }

    @Override
    public void onStateChanged(final List<CelestialBody> bodies) {
        return;
    }

    public void handleMessage(final String msg) {
        return;
    }
}
