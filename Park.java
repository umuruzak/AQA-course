public class Park {

    public class Attraction{
        private String name;
        private String description;
        private String workingHours;
        private int priceForRide;

        public Attraction(String name, String description, String workingHours, int priceForRide) {
            this.name = name;
            this.description = description;
            this.workingHours = workingHours;
            this.priceForRide = priceForRide;
        }

        public void showInfo(){
            System.out.println("Аттракцион " + name + ". " + description + ". Рабочие часы: " + workingHours +
                    ". Цена: " + priceForRide + ".");
        }
    }
}
