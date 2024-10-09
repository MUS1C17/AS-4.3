
public class TestProgram {
    public static void main(String[] args) 
    {
        Employee employee = new Employee("John", "Doe");

        // Add FullTimeJob
        FullTimeJob fullTimeJob = new FullTimeJob("Google", "Software Engineer", 1996, 2005, 60, 41, true, true, 2);

        // Add PartTimeJob
        PartTimeJob partTimeJob = new PartTimeJob("Facebook","Sales",2006,2009,50, 20);

        // Add ContractJob
        ContractJob contractJob = new ContractJob("Murray State University","Professor", 2015, 2016, 70, 1000, 5000, 2000, 12, false);

        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        // Display job history
        employee.displayJobHistory();

        // Calculate total work experience
        long totalExperienceMonths = employee.calculateTotalWorkExperienceInYears();
        System.out.println("Total Work Experience: " + totalExperienceMonths + " years");

        // Calculate average job satisfaction
        String averageSatisfaction = employee.calculateAverageJobSatisfaction();
        System.out.println("Average Job Satisfaction: " + averageSatisfaction);

        // Extra methods for the Full time job
        System.out.println("Full Time Job Yearly Salary: $" + fullTimeJob.calculateSalary());
        System.out.println("Full Time Job Work-Life Balance: " + fullTimeJob.evaluateWorkLifeBalance());

        // Extra methods for the Part time job
        System.out.println("Part Time Job Weekly Earnings: $" + partTimeJob.calculateWeeklyEarnings());
        System.out.println("Part Time Job Schedule Flexibility: " + partTimeJob.assessScheduleFlexibility());

        // Extra methods for the Contract job
        System.out.println("Contract Job Payment: $" + contractJob.calculatePayment());
        System.out.println("Contract Job Security: " + contractJob.evaluateJobSecurity());
    }
    
}
