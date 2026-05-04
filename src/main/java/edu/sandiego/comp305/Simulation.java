package edu.sandiego.comp305;

import java.util.ArrayList;

import java.util.List;

public class Simulation {

    private final List<CelestialBody> bodies;

    private SimulationStatus status;

    private final List<SimulationListener> listeners;

    public Simulation() {
        this.bodies = new ArrayList<>();
        this.status = SimulationStatus.INITIAL;
        this.listeners = new ArrayList<>();
    }

    public String getBodies() {
        return bodies.toString();
    }

    public boolean isRunning() {
        return false;
    }

    public void addBody(final CelestialBody body) {
        return;
    }

    public void tick(final double dt) {
        return;
    }

    public void start() {
        return;
    }

    public void pause() {
        return;
    }

    public void resume() {
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

