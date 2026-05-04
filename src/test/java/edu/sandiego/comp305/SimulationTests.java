package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTests {

    @Test
    void simulationGetsStarted() {
        Simulation sim = new Simulation();
        sim.start();
        assertEquals(SimulationStatus.RUNNING, sim.getStatus());
    }

    @Test
    void simulationGetsPaused() {
        Simulation sim = new Simulation();
        sim.start();
        sim.pause();
        assertEquals(SimulationStatus.PAUSED, sim.getStatus());
    }

    @Test
    void simulationGetsResumed() {
        Simulation sim = new Simulation();
        sim.start();
        sim.pause();
        sim.resume();
        assertEquals(SimulationStatus.RUNNING, sim.getStatus());
    }

}
