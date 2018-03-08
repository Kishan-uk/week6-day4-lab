public class Developer extends Employee {

    private String deptName;

    public Developer(String name, String ni_number, int salary) {
        super(name, ni_number, salary);
    }

    @Override

    public String deptName(){
        return this.deptName;
    }

}

