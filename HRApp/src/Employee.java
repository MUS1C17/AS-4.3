import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String lastName;
    private List<Job> jobHistory;

    public Employee(String name, String lastName) 
    {
        this.name = name;
        this.lastName = lastName;
        this.jobHistory = new ArrayList<>();
    }

    public void addJob(Job job) 
    {
        jobHistory.add(job);
    }

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

    public long calculateTotalWorkExperienceInYears() 
    {
        long totalYears = 0;
        for (Job job : jobHistory) 
        {
            totalYears += job.calculateJobDurationInYears();
        }
        return totalYears;
    }

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
