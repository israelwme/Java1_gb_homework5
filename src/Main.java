public class Main {

    public static void main(String[] args) {
	    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
        // Конструктор класса должен заполнять эти поля при создании объекта;
        // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
        // Создать массив из 5 сотрудников
        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer  ", "teste@gmail.com", 892312312, 5000, 31);
        employeeArray[1] = new Employee("Ivanov Ivan", "Doctor    ", "testd@gmail.com", 892312314, 3500, 42);
        employeeArray[2] = new Employee("Ivanov Ivan", "Driver    ", "testr@gmail.com", 892312315, 4000, 55);
        employeeArray[3] = new Employee("Ivanov Ivan", "Programmer", "testp@gmail.com", 892312316, 3000, 49);
        employeeArray[4] = new Employee("Ivanov Ivan", "Manager   ", "testm@gmail.com", 892312317, 4500, 52);

        for(Employee i: employeeArray){
            if(i.getAge()>40) i.Show();
        }
    }

}
