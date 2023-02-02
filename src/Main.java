

public class Main {
    public static void main(String[] args) {
        ArrEmployee arrEmployee = new ArrEmployee();

        arrEmployee.addContact("Сазонов Даниил Романович", 1, 85000);
        arrEmployee.addContact("Райевская Анна Алексеевна", 1, 87000);
        arrEmployee.addContact("Волков Алексей Иванович", 4, 98000);
        arrEmployee.addContact("Борова Виктория Сергеевна", 2, 56000);
        arrEmployee.addContact("Калинин Павел Никитич", 4, 110000);
        arrEmployee.addContact("Каховский Степан Владимирович", 3, 67000);
        arrEmployee.addContact("Павлова Екатерина Евгеньевна", 4, 65000);
        arrEmployee.addContact("Михалкова Полина Алексеевна", 2, 120000);


        arrEmployee.printFullName();

        System.out.println();

        System.out.println("Общая трата на зарплаты " + arrEmployee.calculateSumSallary());

        System.out.println();

        System.out.println("Минимальная зарплата " + arrEmployee.minSallary());

        System.out.println();

        System.out.println("Максимальная зарплата " + arrEmployee.maxSallary());

        System.out.println();

        System.out.println("Средняя зарплата " + arrEmployee.calculateAvgSallary());

        System.out.println();

        arrEmployee.printAllContacts();

        System.out.println();

        arrEmployee.changeSallaryPerson(0, 190000);

        System.out.println();

        arrEmployee.changeDepartamentPerson(0, 3);



        arrEmployee.printAllContacts();


    }
}
