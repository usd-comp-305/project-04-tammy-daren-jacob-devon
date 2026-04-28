package edu.sandiego.comp305;
import java.util.List;

public class SimulationServer implements SimulationListener {
    private final Simulation simulation;
    private final BodyFactory bodyFactory;

    public SimulationServer(Simulation simulation, BodyFactory bodyFactory){
        this.simulation = simulation;
        this.bodyFactory = bodyFactory;
    }

    @Override
    public void onStateChanged(List<CelestialBody> bodies) {
        return;
    }

    public void handleMessage(String msg) {
        return;
    }
}
