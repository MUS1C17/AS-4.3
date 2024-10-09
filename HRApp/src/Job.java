
public abstract class Job 
{
    //Job Properties 
    protected String companyName;
    protected String position;
    protected int startDate; //Start year in the company
    protected int endDate; //End year in the company

    //Job Constructor that takes company name, position, startDate and endDate (dates are in years)
    public Job(String companyName, String position, int startDate, int endDate) 
    {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Displays all the Job Details
    public void displayJobDetails() 
    {
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Start Year: " + startDate);
        System.out.println("End Year: " + endDate);
    }

    //Calculates how many years at the job
    public int calculateJobDurationInYears() 
    {
        return endDate - startDate;
    }

    //Abstart class to assess Job Satisfaction
    public abstract String assessJobSatisfaction();
}
