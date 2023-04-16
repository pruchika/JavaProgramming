package ifStatements;
import java.util.Scanner;

/*
Problem Statement:

All Salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of %250.
Calculate final salary of the employee.

Algorithm:
1. Initialize the known values
2. Get the values for the unknown
3. Quick detour for the bonus earners
4. Display final salary
 */

public class SalaryCalculator {

    public static void main(String[] args) {

       int salary = 1000;
       int bonus = 250;
       int quota = 10;

       System.out.println("How many sales did the employee make this week?");
       Scanner scanner = new Scanner(System.in);
       int sales = scanner.nextInt();
       scanner.close();

       if(sales > quota){
           salary = salary + bonus;
       }

       System.out.println("The employee's pay is $ " + salary);
    }
}
