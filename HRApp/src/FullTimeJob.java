
public class FullTimeJob extends Job 
{
    
    //properties of the Full time Job

    private double hourlyWage;
    private int workingHoursPerWeek;
    private boolean hasOvertime;
    private boolean hasFlexibility;
    private int stressFactors;

    //Constructor for the full time job
    public FullTimeJob(String companyName, String position, int startDate, int endDate, double hourlyWage, int workingHoursPerWeek, boolean hasOvertime, boolean hasFlexibility, int stressFactors) 
    {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.hasOvertime = hasOvertime;
        this.hasFlexibility = hasFlexibility;
        this.stressFactors = stressFactors;
    }
    //Display all the details of the Part Time job
    @Override
    public void displayJobDetails() {
        super.displayJobDetails();
        System.out.println("Hourly Salary: $" + hourlyWage);
        System.out.println("Working Hours per Week: " + workingHoursPerWeek);
        System.out.println("Has Overtime: " + (hasOvertime ? "Yes" : "No"));
        System.out.println("Has Flexibility: " + (hasFlexibility ? "Yes" : "No"));
        System.out.println("Number of Stress Factors: " + stressFactors);
    }

    //Asses Job Satisfaction method from the Job abstact class
    //The formula to get employees job satisfaction is:
    // hourly salary / 5 - Number of Hours Employee works a week / 10
    @Override
    public String assessJobSatisfaction() 
    {
        double satisfactionScore = hourlyWage / 5 - workingHoursPerWeek / 10.0;
        if(satisfactionScore > 6 && hasFlexibility)
        {
            return "Highest Satisfaction level";
        }
        else if (satisfactionScore > 4) 
        {
            return "Very Satisfied";
        } 
        else if (satisfactionScore > 2) 
        {
            return "Satisfied";
        } 
        
        else {
            return "Not Satisfied";
        }
    }

    //Calculate annual salary using formula: hourly wage * working hours in a week * weeks in a year 
    public double calculateSalary()
    {
        return hourlyWage * workingHoursPerWeek * 52;
    }

    //Method to evaluate Work Life Balance for the employee depending on the working hours, flexibility and stress factors
    public String evaluateWorkLifeBalance()
    {
        if(workingHoursPerWeek < 40 && hasFlexibility && stressFactors == 0)
        {
            return "Excellent";
        }
        else if (workingHoursPerWeek < 44 && stressFactors < 2)
        {
            return "Moderate";
        }
        else
        {
            return "poor";
        }
    }
}
