import java.util.ArrayList;
import java.util.List;

public class Employee {
    
    //Properties of Employee
    private String name;
    private String lastName;
    private List<Job> jobHistory;

    //Employee constractor
    public Employee(String name, String lastName) 
    {
        this.name = name;
        this.lastName = lastName;
        this.jobHistory = new ArrayList<>();
    }

    //Add job to the employee
    public void addJob(Job job) 
    {
        jobHistory.add(job);
    }

    //Method to display Employee's job history
    public void displayJobHistory() 
    {
        System.out.println("Job History for " + name + lastName +":\n");
        for (Job job : jobHistory) 
        {
            job.displayJobDetails();
            System.out.println("Job Duration: " + job.calculateJobDurationInYears() + " years");
            System.out.println("Job Satisfaction: " + job.assessJobSatisfaction());
            System.out.println("--------------------------------\n");
        }
    }

    //Method to Calculate total work experience in Years for the employee
    public long calculateTotalWorkExperienceInYears() 
    {
        long totalYears = 0;
        for (Job job : jobHistory) 
        {
            totalYears += job.calculateJobDurationInYears();
        }
        return totalYears;
    }

    //Method Calculates Job Satisfaction for the employee
    public String calculateAverageJobSatisfaction() 
    {
        double totalScore = 0;
        int count = 0;
        for (Job job : jobHistory) {
            String satisfaction = job.assessJobSatisfaction();
            int score = 0;
            if (satisfaction.equals("Highly Satisfied")) 
            {
                score = 3;
            } 
            else if (satisfaction.equals("Satisfied")) 
            {
                score = 2;
            } 
            else if (satisfaction.equals("Not Satisfied")) 
            {
                score = 1;
            }
            totalScore += score;
            count++;
        }

        double averageScore = totalScore / count;
        if (averageScore >= 2.5) 
        {
            return "Highly Satisfied";
        } 
        else if (averageScore >= 1.5) 
        {
            return "Satisfied";
        } 
        else 
        {
            return "Not Satisfied";
        }
    }
}
