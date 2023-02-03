public class ArrEmployee {
    private final Employee[] persons;
    private int size;

    public ArrEmployee() {
        this.persons = new Employee[10];
        // Задали массиву Contact длину — 10
    }


    // Реализуем метод add (создать сотрудника):
    public void addContact(String fullName, int departament, int sallary) {
        if (size >= persons.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newContact = new Employee(fullName, departament, sallary);
        persons[size++] = newContact;
    }


    // Реализуем метод printAllContacts (распечатать всех сотрудников)
    public void printAllContacts() {
        for (int i = 0; i < size; i++) {
            Employee newPerson = persons[i];
            System.out.println(newPerson.toString());
        }
    }

    public void printFullName() {
        for (int i = 0; i < size; i++) {
            Employee fullName = persons[i];
            System.out.println(fullName.getFullName());
        }
    }

    public int calculateSumSallary(){
        int sum = 0;
        for (int i = 0; i < size; i++) {
            Employee sumCal = persons[i];
            sum += sumCal.getSallary();
        }
        return sum;
    }

    public int minSallary(){
        int sallary = 1_000_000;
        for (int i = 0; i < size; i++) {
            Employee sallaryMin = persons[i];
            if (sallary > sallaryMin.getSallary()) {
                sallary = sallaryMin.getSallary();
            }
        }
        return sallary;
    }

    public int maxSallary(){
        int sallary = 0;
        for (int i = 0; i < size; i++) {
            Employee sallaryMin = persons[i];
            if (sallary < sallaryMin.getSallary()) {
                sallary = sallaryMin.getSallary();
            }
        }
        return sallary;
    }

    public int calculateAvgSallary(){
        int sum = 0;
        int i = 0;
        for (; i < size; i++) {
            Employee sumCal = persons[i];
            sum += sumCal.getSallary();
        }
        return sum / i;
    }

    public void changeSallaryPerson(int id, int changeSallary){
        for (int i = 0; i < size; i++) {
            if (persons[i].getId() == id) {
                persons[i].setSallary(changeSallary);
                break;
            }
        }
    }

    public void changeDepartamentPerson(int id, int changeDepartament){
        for (int i = 0; i < size; i++) {
            if (persons[i].getId() == id) {
                persons[i].setDepartament(changeDepartament);
                break;
            }
        }
    }
}


