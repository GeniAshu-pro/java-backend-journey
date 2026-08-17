public class PartTimeEmployee  extends Employee{
private int hourlyWorked;
private double hourlyRate;
    public PartTimeEmployee(int id, String name ,int hourlyWorked , int hourlyRate) {
        super(id, name);
        this.hourlyWorked = hourlyWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public int getHourlyWorked() {
        return hourlyWorked;
    }
    public void setHourlyWorked(int hourlyWorked){
        this.hourlyWorked =hourlyWorked;
    }
    public void setHourlyRate(int hourlyRate){
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate*hourlyWorked;
    }
}
