import java.util.ArrayList;

public class Plane {

        private TypeOfPlane type;
        private Airline ownerAirline;
        private ArrayList<Passenger> passengers;
        private int capacity;

        public Plane(TypeOfPlane type, Airline ownerAirline) {
            this.type = type;
            this.ownerAirline = ownerAirline;
            this.passengers = new ArrayList<>();
            this.capacity = this.type.getCapacity();
        }

        public TypeOfPlane getType(){
            return type;
        }

        public Airline getAirlineCode() {
            return ownerAirline;
        }

        public String getAirlineName() {
        return ownerAirline.getName();
    }

        public int getCapacity(){
            return capacity;
        }

    public Passenger letOutPassenger(String passengerName) {
        for (Passenger passenger : passengers)
            if (passenger.getName().equals(passengerName)) {
                passengers.remove(passenger);
                return passenger;
            }
        return null;
    }

    public void addPassenger(Passenger passenger) {
            passengers.add(passenger);
    }

    public int countPassengers(){
            return passengers.size();
    }

    public void letAllPassengersOut() {
            passengers.clear();
    }

    public boolean isFull() {
        if (countPassengers() >= capacity) return true;
        return false;
    }

    public boolean hasSeatsLeft() {
        if (countPassengers() < capacity) return true;
        return false;
    }

    } // end class
