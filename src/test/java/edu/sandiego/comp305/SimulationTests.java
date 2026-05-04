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
    void simulationTriesToStartAgain() {
        Simulation sim = new Simulation();
        sim.start();
        assertThrows(IllegalStateException.class, sim::start);
    }

    @Test
    void simulationTriesToStartWhilePaused() {
        Simulation sim = new Simulation();
        sim.start();
        assertThrows(IllegalStateException.class, sim::start);
    }

    @Test
    void simulationGetsPaused() {
        Simulation sim = new Simulation();
        sim.start();
        sim.pause();
        assertEquals(SimulationStatus.PAUSED, sim.getStatus());
    }

    @Test
    void simulationTriesToPauseAgain() {
        Simulation sim = new Simulation();
        sim.start();
        sim.pause();
        assertThrows(IllegalStateException.class, sim::pause);
    }

    @Test
    void simulationTriesToPauseWithoutStarting() {
        Simulation sim = new Simulation();
        assertThrows(IllegalStateException.class, sim::pause);
    }

    @Test
    void simulationGetsResumed() {
        Simulation sim = new Simulation();
        sim.start();
        sim.pause();
        sim.resume();
        assertEquals(SimulationStatus.RUNNING, sim.getStatus());
    }

    @Test
    void simulationTriesToResumeWithoutPausing() {
        Simulation sim = new Simulation();
        sim.start();
        assertThrows(IllegalStateException.class, sim::resume);
    }

    @Test
    void simulationGetsReset() {
        Simulation sim = new Simulation();
        sim.start();
        sim.reset();
        assertEquals(SimulationStatus.INITIAL, sim.getStatus());
    }

    @Test
    void simulationTriesToResetAgain() {
        Simulation sim = new Simulation();
        sim.start();
        sim.reset();
        assertThrows(IllegalStateException.class, sim::reset);
    }
}
