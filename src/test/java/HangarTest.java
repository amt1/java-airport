import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Plane plane;
    Plane smallPlane;
    Hangar hangar;

    @Before
    public void before(){
        plane = new Plane(TypeOfPlane.PinkyPonk, Airline.VS);
        smallPlane = new Plane(TypeOfPlane.LearJet, Airline.VS);
        hangar = new Hangar(2);
    }

    @Test
    public void hasPlaneCount() {
        assertEquals(0, hangar.countPlanesInside());
    }
    @Test
    public void hasCapacity() {
        assertEquals(2, hangar.getCapacity());
    }

    @Test
    public void canAddPlane() {
        hangar.addPlane(plane);
        hangar.addPlane(smallPlane);
        assertEquals(2, hangar.countPlanesInside());

    }
    @Test
    public void canBeFull() {
        hangar.addPlane(plane);
        hangar.addPlane(smallPlane);
        assertEquals(true, hangar.isFull());

    }

    @Test
    public void cantAddPlanesWhenFull() {
        hangar.addPlane(plane);
        hangar.addPlane(smallPlane);
        hangar.addPlane(plane);
        assertEquals(2, hangar.countPlanesInside());
    }

    @Test
    public void canLetPlaneOut() {
        hangar.addPlane(plane);
        hangar.addPlane(smallPlane);
        assertEquals(2, hangar.countPlanesInside());

        assertEquals(plane, hangar.letOut(plane));
        assertEquals(1, hangar.countPlanesInside());

    }
}
