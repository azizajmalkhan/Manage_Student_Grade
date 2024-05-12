import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        while (true) {
            System.out.println("Student Grade Tracker");
            System.out.println("1. Add Grade");
            System.out.println("2. Edit Grade");
            System.out.println("3. Delete Grade");
            System.out.println("4. Calculate Average Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the grade: ");
                    double grade = scanner.nextDouble();
                    grades.add(grade);
                    System.out.println("Grade added successfully.");
                    break;
                case 2:
                    if (!grades.isEmpty()) {
                        System.out.print("Enter the index of the grade to edit (0-" + (grades.size() - 1) + "): ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < grades.size()) {
                            System.out.print("Enter the new grade: ");
                            grade = scanner.nextDouble();
                            grades.set(index, grade);
                            System.out.println("Grade edited successfully.");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    } else {
                        System.out.println("No grades available to edit.");
                    }
                    break;
                case 3:
                    if (!grades.isEmpty()) {
                        System.out.print("Enter the index of the grade to delete (0-" + (grades.size() - 1) + "): ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < grades.size()) {
                            grades.remove(index);
                            System.out.println("Grade deleted successfully.");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    } else {
                        System.out.println("No grades available to delete.");
                    }
                    break;
                case 4:
                    if (!grades.isEmpty()) {
                        double sum = 0;
                        for (double g : grades) {
                            sum += g;
                        }
                        double average = sum / grades.size();
                        System.out.println("Average Grade: " + average);
                    } else {
                        System.out.println("No grades available to calculate average.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
