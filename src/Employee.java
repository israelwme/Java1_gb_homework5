public class Employee {

    private String fio;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fio, String position, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void Show(){
        System.out.println("ФИО: " +fio + " Должность: " + position + " email: " + email + " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age);
    }

}
