
public class ContractJob extends Job{
    private double hourlyRate;
    private int totalHours;
    private double bonus;
    private double penalty;
    private int contractDurationMonths;
    private boolean isStable;

    public ContractJob(String companyName, String position, int startDate, int endDate, double hourlyRate, int totalHours, double bonus, double penalty, int contractDurationMonths, boolean isStable) 
    {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
        this.bonus = bonus;
        this.penalty = penalty;
        this.contractDurationMonths = contractDurationMonths;
        this.isStable = isStable;
    }

    //Display all the details of the Contract job
    @Override
    public void displayJobDetails() 
    {
        super.displayJobDetails();
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Hours: " + totalHours);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Penalty: $" + penalty);
        System.out.println("Contract Duration (Months): " + contractDurationMonths);
        System.out.println("Is Contractor Stable: " + (isStable ? "Yes" : "No"));
    }

    //Asses Job Satisfaction method from the Job abstact class
    //The formula to get employees job satisfaction is:
    // (hourly rate * total hours spend on the job + bonus - penalty) / 1000
    @Override
    public String assessJobSatisfaction() 
    {
        double satisfactionScore = (hourlyRate * totalHours + bonus - penalty) / 1000;
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

    //Calculate total payents from the job
    public double calculatePayment() {
        return (hourlyRate * totalHours) + bonus - penalty;
    }

    //Evaluates the level of job security associated with the contract job
    public String evaluateJobSecurity() 
    {
        if (contractDurationMonths >= 12 && isStable) 
        {
            return "High";
        } 
        else if (contractDurationMonths >= 6 || isStable) 
        {
            return "Medium";
        } 
        else 
        {
            return "Low";
        }
    }
}
