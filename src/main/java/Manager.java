public abstract class Manager extends Employee {

    private String deptName;

    public Manager(String name, String ni_number, int salary) {
        super(name, ni_number, salary);
        this.deptName = deptName;
    }

    @Override
    public String deptName(){
        return this.deptName;
    }

    public abstract double budget();

}
