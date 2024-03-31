public class Person {
    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Сотрудник " + this.FIO + " на позиции " + position + ".\nВозраст: " + age + ".\nОклад: "
        + salary + ".\nКонтактная информация " + email + ", " + phoneNumber + ".");
    }
}