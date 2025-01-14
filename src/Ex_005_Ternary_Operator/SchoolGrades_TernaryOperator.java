package Ex_005_Ternary_Operator;

// Grade A -> Marks > 90
// Grade B ->  89 > Marks > 80
// Grade c ->  79 > Marks > 70
// Grade D ->  69 > Marks > 60
// Grade E ->  59 > Marks > 50
// Grade F ->  50 > Marks
public class SchoolGrades_TernaryOperator {
    public static void main(String[] args) {
        int marks = 34;
        char grade = marks > 90 ? 'A' : (marks > 80) ? 'B' : (marks > 70) ? 'C' : (marks > 60) ? 'D' : (marks > 50) ? 'E': 'F';

        System.out.println(grade);
    }
}
