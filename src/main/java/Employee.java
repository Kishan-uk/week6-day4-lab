public abstract class Employee {
    private String name;
    private String ni_number;
    private int salary;

    public Employee(String name, String ni_number, int salary){
        this.name = name;
        this.ni_number = ni_number;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.ni_number;
    }

    public int getSalary() {
        return this.salary;
    }

//    public void raiseSalary() {
//        raiseSalary = (salary + 200);
//        }

    public double getBonus() {
       double bonusSalary;
       bonusSalary = (salary * 0.01);
       return bonusSalary;
    }

    public abstract String deptName();
}

