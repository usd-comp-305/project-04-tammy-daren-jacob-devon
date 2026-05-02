package edu.sandiego.comp305;
import java.util.List;

public class SimulationServer implements SimulationListener {
    private final Simulation simulation;

    public SimulationServer(Simulation simulation){
        this.simulation = simulation;
    }

    @Override
    public void onStateChanged(List<CelestialBody> bodies) {
        return;
    }

    public void handleMessage(String msg) {
        return;
    }
}
