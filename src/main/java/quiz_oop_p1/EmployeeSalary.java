package quiz_oop_p1;

public class EmployeeSalary {

    public float calculateWeeklySalary(float workhour, float normalEarn, float overtimeHour, float otRate) {
        float normalWeeklySalary = normalEarn * workhour;
        float otSalary = overtimeHour * (otRate * normalEarn);
        return normalWeeklySalary;
    }

    public static void main(String[] args) {
        EmployeeSalary salary = new EmployeeSalary();
        float totalWeeklySalary = salary.calculateWeeklySalary(40,25,13,1.5f);
        System.out.printf("Total weekly salary %10.2f ", totalWeeklySalary);
    }

}
