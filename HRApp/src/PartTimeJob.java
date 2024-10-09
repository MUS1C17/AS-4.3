
public class PartTimeJob extends Job{

    //properties
    private double hourlyWage;
    private int hoursPerWeek;

    public PartTimeJob(String companyName, String position, int startDate, int endDate, double hourlyWage, int hoursPerWeek) 
    {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    //Dislplay all the job details
    @Override
    public void displayJobDetails() {
        super.displayJobDetails();
        System.out.println("Hourly Wage: $" + hourlyWage);
        System.out.println("Hours per Week: " + hoursPerWeek);
    }

    ///Asses Job Satisfaction method from the Job abstact class
    //The formula to get employees job satisfaction is:
    // (hourly salary * hours per week) / 100
    @Override
    public String assessJobSatisfaction() 
    {
        double satisfactionScore = (hoursPerWeek * hourlyWage) / 100;
        if (satisfactionScore > 8) 
        {
            return "Highly Satisfied";
        } 
        else if (satisfactionScore > 5)
        {
            return "Satisfied";
        } 
        else 
        {
            return "Not Satisfied";
        }
    }

    //Calculate Weekly earnings of the employee
    public double calculateWeeklyEarnings() {
        return hourlyWage * hoursPerWeek;
    }

    //See how flexible is employee's schedule
    public String assessScheduleFlexibility() 
    {
        if (hoursPerWeek <= 20) 
        {
            return "High Flexibility";
        } 
        else if (hoursPerWeek <= 30) 
        {
            return "Moderate Flexibility";
        } 
        else 
        {
            return "Low Flexibility";
        }
    }
}
