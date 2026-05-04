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

    public SimulationStatus getStatus() {
        return this.status;
    }

    public void addBody(final CelestialBody body) {
        return;
    }

    public void tick(final double dt) {
        return;
    }

    public void start() {
        this.status = SimulationStatus.RUNNING;
    }

    public void pause() {
        this.status = SimulationStatus.PAUSED;
    }

    public void resume() {
        this.status = SimulationStatus.RUNNING;
    }

    public void reset() {
        this.status = SimulationStatus.INITIAL;
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

