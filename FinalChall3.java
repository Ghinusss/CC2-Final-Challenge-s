// Ambales Geneses L.
//CITCS 1-N
//Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)

public class FinalChall3 {
    public static void main(String[] args) {
        // One-dimensional array to store student names
        String[] students = {"Anna", "Pedro", "John", "Mark" , "Eve"};
        
        // Two-dimensional array to store grades (5 students, 3 subjects)
        int[][] grades = {
            {85, 90, 88},  // Grades for Anna
            {78, 82, 80},  // Grades for Pedro
            {92, 95, 93},  // Grades for John
            {70, 75, 72},  // Grades for Mark
            {88, 91, 90}   // Grades for Eve
        };

        // Calculate and display each student's average grade
        for (int i = 0; i < students.length; i++) {
            int total = 0;

            // Sum up the grades for each student
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }

            //Calculate the average grade for the student
            double average = total / (double) grades[i].length;

            // Display the student's name and their average grade
            System.out.printf("%s's Average Grade: %.2f%n", students[i], average);
        }
    }
}