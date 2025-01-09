import java.util.Scanner;

public class IT24102907Lab10Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a mark
        System.out.print("Enter the mark (0-100): ");
        int mark = scanner.nextInt();

        // Validate the mark using an assertion
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        // If the assertion passes, determine the grade
        char grade = determineGrade(mark);

        // Validate the grade using an assertion
        assert isValidGrade(mark, grade) : "Incorrect Grade Assigned";

        // Display the result
        System.out.println("Mark is Validated");
        System.out.println("The grade is: " + grade);
    }

    // Method to determine the grade based on the mark
    private static char determineGrade(int mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else if (mark >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to validate that the grade matches the mark
    private static boolean isValidGrade(int mark, char grade) {
        switch (grade) {
            case 'A':
                return mark >= 75;
            case 'B':
                return mark >= 60 && mark < 75;
            case 'C':
                return mark >= 50 && mark < 60;
            case 'D':
                return mark >= 40 && mark < 50;
            case 'F':
                return mark < 40;
            default:
                return false;
        }
    }
}
