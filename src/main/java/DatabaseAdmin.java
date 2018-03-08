public class DatabaseAdmin extends Employee {

    private String deptName;

    public DatabaseAdmin(String name, String ni_number, int salary) {
        super(name, ni_number, salary);
    }

    @Override

    public String deptName(){
        return this.deptName;
    }

}