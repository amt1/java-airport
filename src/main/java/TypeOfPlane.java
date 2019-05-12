public enum TypeOfPlane {
        PinkyPonk(50),
        BOEING787(335),
        LearJet(4);

        private final int capacity;

        TypeOfPlane(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

}
