public class Director extends Manager {

    private double budget;

    public Director(String name, String ni_number, int salary, double budget){
        super(name, ni_number, salary);
        this.budget = budget;
    }

    @Override
    public double budget(){
        return this.budget;
    }
}
