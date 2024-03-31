public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Michael Scott", "Regional manager", "mmm.sctt@gmail.com", "+12345678", 2500, 40);
        persArray[1] = new Person("Dwight Schrute", "Salesman", "d.schrute@gmail.com", "+234567891", 1500, 35);
        persArray[2] = new Person("Jim Halpert", "Sales representative", "jmhal@gmail.com", "+345678912", 1250, 29);
        persArray[3] = new Person("Pam Beesly", "Receptionist", "pambeesly@gmail.com","+456789123", 1200, 28);
        persArray[4] = new Person("Ryan Howard", "Temporary employee", "notryanhoward@gmail.com", "+567891234", 1000, 30);
        for(Person pers : persArray){
            pers.showInfo();
        }

        Park park = new Park();
        Park.Attraction mumboJumbo = park.new Attraction("Mumbo Jumbo", "World’s steepest roller coaster made from steel 'til 1st July 2011", "10:00 - 20:00", 4);
        mumboJumbo.showInfo();
    }
}