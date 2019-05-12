import java.util.ArrayList;

public class Hangar {

    private int capacity;
    private ArrayList<Plane> planes;

    public Hangar(int capacity){
        this.capacity = capacity;
        this.planes = new ArrayList<>();
    }

    public int countPlanesInside(){
        return planes.size();
    }

    public int getCapacity(){
        return capacity;
    }

    public boolean isFull(){
        if (countPlanesInside() >= capacity) return true;
        return false;
    }

    public boolean addPlane(Plane plane){
        if (isFull()) return false;
        planes.add(plane);
        return true;
    }

    public Plane letOut(Plane plane){
        planes.remove(plane);
        return plane;
    }

}
