public class Park {
    private String parkName;
    public Park(String parkName) {
        this.parkName = parkName;
    }
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private int ticketPrice;
        public Attraction(String attractionName, String workingHours, int ticketPrice) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.ticketPrice = ticketPrice;
        }
        public void displayInfo() {
            System.out.println("Парк: " + parkName);
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена билета: " + ticketPrice + " руб.");
            System.out.println("------------------------------------");
        }
    }
}