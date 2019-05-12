public class Plane {

        private TypeOfPlane type;
        private Airline ownerAirline;
//        private ArrayList<Passenger> passengers;

        public Plane(TypeOfPlane type, Airline ownerAirline) {
            this.type = type;
            this.ownerAirline = ownerAirline;
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
            return this.type.getCapacity();
        }
    }
