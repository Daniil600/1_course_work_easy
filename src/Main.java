

public class Main {
    public static void main(String[] args) {
        ArrEmployee arrEmployee = new ArrEmployee();

        arrEmployee.addSallary("Сазонов Даниил Романович", 1, 85000);
        arrEmployee.addSallary("Райевская Анна Алексеевна", 1, 87000);
        arrEmployee.addSallary("Волков Алексей Иванович", 4, 98000);
        arrEmployee.addSallary("Борова Виктория Сергеевна", 2, 56000);
        arrEmployee.addSallary("Калинин Павел Никитич", 4, 110000);
        arrEmployee.addSallary("Каховский Степан Владимирович", 3, 67000);
        arrEmployee.addSallary("Павлова Екатерина Евгеньевна", 4, 65000);
        arrEmployee.addSallary("Михалкова Полина Алексеевна", 2, 120000);


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

        arrEmployee.printAllSallary();

        System.out.println();

        arrEmployee.changeSallaryPerson(0, 190000);

        System.out.println();

        arrEmployee.changeDepartamentPerson(0, 3);

        System.out.println();

        arrEmployee.changeSallaryIndex(10);

        System.out.println();

        arrEmployee.printAllSallary();

        System.out.println();

        arrEmployee.minSallaryDepartament(4);

        System.out.println();

        arrEmployee.maxSallaryDepartament(4);

        System.out.println();

        arrEmployee.sumSallaryDepartament(4);

        System.out.println();

        arrEmployee.avgSallaryDepartament(4);

        System.out.println();

        arrEmployee.changeSallaryIndexDepartament(4, 15);

        System.out.println();

        arrEmployee.printInfoDepartament(4);

        System.out.println();

        arrEmployee.printMinSallaryOfNum(100000);

        System.out.println();

        arrEmployee.printMaxSallaryOfNum(100000);


    }
}
