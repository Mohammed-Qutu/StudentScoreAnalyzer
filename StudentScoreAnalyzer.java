/*
Mohammed Qutu
3/3/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/
import java.util.Scanner;

public class StudentScoreAnalyzer {

    public static void main(String[] args) {
        int[] scores = {90, 100, 80, 85, 63, 73, 80, 92, 90};
        int sum = 0;
        int average = 0;
        int largest = scores[0];
        int smallest = scores[0];

        // Calculate sum and average
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        average = sum / scores.length;

        // Find largest score
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > largest) {
                largest = scores[i];
            }
        }

        // Find smallest score
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < smallest) {
                smallest = scores[i];
            }
        }

        // Count grades A, B, C, D, F
        int A = 0, B = 0, C = 0, D = 0, F = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                A++;
            } else if (scores[i] >= 80 && scores[i] < 90) {
                B++;
            } else if (scores[i] >= 70 && scores[i] < 80) {
                C++;
            } else if (scores[i] >= 60 && scores[i] < 70) {
                D++;
            } else {
                F++;
            }
        }

        // Output results
        System.out.println("The Sum is: " + sum);
        System.out.println("The Average is: " + average);
        System.out.println("The Largest score is: " + largest);
        System.out.println("The Lowest score is: " + smallest);
        System.out.println("The number of students with scores of 90 - 100 (A) is: " + A);
        System.out.println("The number of students with scores of 80 - 89 (B) is: " + B);
        System.out.println("The number of students with scores of 70 - 79 (C) is: " + C);
        System.out.println("The number of students with scores of 60 - 69 (D) is: " + D);
        System.out.println("The number of students with scores below 60 (F) is: " + F);
    }
}
