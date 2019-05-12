public enum Airline {
        BA("British Airways"),
        VS("Virgin Atlantic");

        private final String name;

        Airline(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
}
