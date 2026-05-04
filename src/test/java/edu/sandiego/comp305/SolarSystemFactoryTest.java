package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolarSystemFactoryTest {

    private SolarSystemFactory factory;

    @BeforeEach
    void setUp() {
        factory = new SolarSystemFactory();
    }

    @Nested
    @DisplayName("createSolarSystem")
    class CreateSolarSystemTests {

        private List<CelestialBody> bodies;

        @BeforeEach
        void setUp() {
            bodies = factory.createSolarSystem();
        }

        @Test
        void returnsNineBodies() {
            assertEquals(9, bodies.size());
        }

        @Test
        void firstBodyIsStar() {
            assertInstanceOf(Star.class, bodies.get(0));
        }

        @Test
        void sunAtOrigin() {
            CelestialBody sun = bodies.get(0);
            assertEquals(0.0, sun.getPosition().getX(), 1e-9);
            assertEquals(0.0, sun.getPosition().getY(), 1e-9);
        }

        @Test
        void sunHasZeroVelocity() {
            // TODO: cast to AbstractBody and check getVelocity()
            fail("Not yet implemented");
        }

        @Test
        void sunHasPositiveMass() {
            assertTrue(bodies.get(0).getMass() > 0);
        }

        @Test
        void remainingBodiesArePlanets() {
            for (int i = 1; i < bodies.size(); i++) {
                assertInstanceOf(Planet.class, bodies.get(i),
                        "body at index " + i + " should be a Planet");
            }
        }

        @Test
        void allPlanetNamesPresent() {
            Set<String> expected = Set.of(
                    "Mercury", "Venus", "Earth", "Mars",
                    "Jupiter", "Saturn", "Uranus", "Neptune"
            );
            Set<String> actual = new HashSet<>();
            for (int i = 1; i < bodies.size(); i++) {
                actual.add(bodies.get(i).getName());
            }
            assertEquals(expected, actual);
        }

        @Test
        void planetsOrderedByDistance() {
            // TODO: check that each planet is farther out than the one before it
            fail("Not yet implemented");
        }

        @Test
        void allPlanetsHavePositiveMass() {
            for (int i = 1; i < bodies.size(); i++) {
                assertTrue(bodies.get(i).getMass() > 0,
                        bodies.get(i).getName() + " mass should be > 0");
            }
        }

        @Test
        void allPlanetsHaveNonZeroVelocity() {
            // TODO: if velocity is zero they'll just fall into the sun
            fail("Not yet implemented");
        }

        @Test
        void noPlanetsOverlap() {
            for (int i = 1; i < bodies.size(); i++) {
                for (int j = i + 1; j < bodies.size(); j++) {
                    CelestialBody a = bodies.get(i);
                    CelestialBody b = bodies.get(j);
                    boolean samePos = a.getPosition().getX() == b.getPosition().getX()
                            && a.getPosition().getY() == b.getPosition().getY();
                    assertFalse(samePos,
                            a.getName() + " and " + b.getName() + " shouldn't be on top of each other");
                }
            }
        }

        @Test
        void allBodiesHaveNames() {
            for (CelestialBody body : bodies) {
                assertNotNull(body.getName());
                assertFalse(body.getName().isEmpty());
            }
        }

        @Test
        void callingTwiceGivesIndependentLists() {
            List<CelestialBody> second = factory.createSolarSystem();
            assertNotSame(bodies, second);
            assertEquals(bodies.size(), second.size());
        }
    }

    @Nested
    @DisplayName("createSpaceship")
    class CreateSpaceshipTests {

        @Test
        void returnsSpaceship() {
            CelestialBody ship = factory.createSpaceship(100, 200);
            assertInstanceOf(Spaceship.class, ship);
        }

        @Test
        void placedAtGivenCoordinates() {
            CelestialBody ship = factory.createSpaceship(42.5, -73.0);
            assertEquals(42.5, ship.getPosition().getX(), 1e-9);
            assertEquals(-73.0, ship.getPosition().getY(), 1e-9);
        }

        @Test
        void startsStationary() {
            // TODO: cast to AbstractBody and check getVelocity()
            fail("Not yet implemented");
        }

        @Test
        void hasSmallMass() {
            CelestialBody ship = factory.createSpaceship(0, 0);
            assertTrue(ship.getMass() > 0);
            assertTrue(ship.getMass() < 100, "should be way smaller than a planet");
        }

        @Test
        void hasAName() {
            CelestialBody ship = factory.createSpaceship(0, 0);
            assertNotNull(ship.getName());
            assertFalse(ship.getName().isEmpty());
        }

        @Test
        void uniqueNames() {
            CelestialBody ship1 = factory.createSpaceship(0, 0);
            CelestialBody ship2 = factory.createSpaceship(10, 10);
            CelestialBody ship3 = factory.createSpaceship(20, 20);
            assertNotEquals(ship1.getName(), ship2.getName());
            assertNotEquals(ship2.getName(), ship3.getName());
            assertNotEquals(ship1.getName(), ship3.getName());
        }

        @Test
        void countIncrements() {
            assertEquals(0, factory.getSpaceshipCount());
            factory.createSpaceship(0, 0);
            assertEquals(1, factory.getSpaceshipCount());
            factory.createSpaceship(10, 10);
            assertEquals(2, factory.getSpaceshipCount());
        }

        @Test
        void worksAtOrigin() {
            CelestialBody ship = factory.createSpaceship(0, 0);
            assertEquals(0.0, ship.getPosition().getX(), 1e-9);
            assertEquals(0.0, ship.getPosition().getY(), 1e-9);
        }

        @Test
        void worksWithNegativeCoords() {
            CelestialBody ship = factory.createSpaceship(-500, -300);
            assertEquals(-500.0, ship.getPosition().getX(), 1e-9);
            assertEquals(-300.0, ship.getPosition().getY(), 1e-9);
        }
    }

    @Nested
    @DisplayName("resetSpaceshipCount")
    class ResetTests {

        @Test
        void resetsToZero() {
            factory.createSpaceship(0, 0);
            factory.createSpaceship(0, 0);
            assertEquals(2, factory.getSpaceshipCount());
            factory.resetSpaceshipCount();
            assertEquals(0, factory.getSpaceshipCount());
        }

        @Test
        void namesRestartAfterReset() {
            CelestialBody first = factory.createSpaceship(0, 0);
            factory.resetSpaceshipCount();
            CelestialBody afterReset = factory.createSpaceship(0, 0);
            assertEquals(first.getName(), afterReset.getName());
        }
    }

    @Nested
    @DisplayName("BodyFactory interface")
    class InterfaceTests {

        @Test
        void implementsBodyFactory() {
            assertInstanceOf(BodyFactory.class, factory);
        }

        @Test
        void createSolarSystemNotNull() {
            assertNotNull(factory.createSolarSystem());
        }

        @Test
        void createSpaceshipNotNull() {
            assertNotNull(factory.createSpaceship(0, 0));
        }
    }
}