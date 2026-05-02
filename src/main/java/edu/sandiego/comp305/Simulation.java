package edu.sandiego.comp305;

import java.util.List;

public class Simulation {

    private final List<CelestialBody> bodies;

    private boolean running;

    private final List<SimulationListener> listeners;

    public Simulation() {
        this.bodies = null;
        this.running = false;
        this.listeners = null;
    }

    public List<CelestialBody> getBodies() {
        return bodies;
    }

    public boolean isRunning() {
        return running;
    }

    public void addBody(final CelestialBody body) {
        return;
    }

    public void tick() {
        return;
    }

    public void pause() {
        return;
    }

    public void reset() {
        return;
    }

    public void addListener(final SimulationListener listener) {
        return;
    }

    public void removeListener(final SimulationListener listener) {
        return;
    }

    private void notifyListener(){
        return;
    }
}

