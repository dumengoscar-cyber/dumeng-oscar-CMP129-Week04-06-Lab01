// Name: oscar dumeng
// Week: 4-6
// Lab: 1
// Date: 10/1/2026
// Course: CMP 129

import java.util.Scanner;

public class DriversLicenseExam {

    public static void main(String[] args) {

        // Correct answers
        char[] answers = {
            'a', 'd', 'b', 'b', 'c',
            'b', 'a', 'b', 'c', 'd',
            'a', 'c', 'd', 'b', 'd',
            'c', 'c', 'a', 'd', 'b'
        };

        // Student answers
        char[] inputs = new char[20];

        // Store incorrect question numbers
        int[] wrongQuestions = new int[20];

        int correct = 0;
        int incorrect = 0;
        int badCount = 0;

        Scanner keyboard = new Scanner(System.in);

        // Collect student answers
        for (int i = 0; i < 20; i++) {

            while (true) {

                System.out.print("Enter answer for question "
                        + (i + 1) + " (a, b, c, d): ");

                String entry = keyboard.next().toLowerCase();

                if (entry.length() == 1 &&
                    (entry.charAt(0) == 'a' ||
                     entry.charAt(0) == 'b' ||
                     entry.charAt(0) == 'c' ||
                     entry.charAt(0) == 'd')) {

                    inputs[i] = entry.charAt(0);
                    break;

                } else {
                    System.out.println(
                            "Invalid answer. Enter a, b, c, or d.");
                }
            }
        }

        // Grade the exam
        for (int i = 0; i < 20; i++) {

            if (inputs[i] == answers[i]) {
                correct++;
            } else {
                incorrect++;
                wrongQuestions[badCount] = i + 1;
                badCount++;
            }
        }

        // Display results
        System.out.println("\nCorrect answers: " + correct);
        System.out.println("Incorrect answers: " + incorrect);

        System.out.print("Incorrect question numbers: ");

        for (int j = 0; j < badCount; j++) {
            System.out.print(wrongQuestions[j] + " ");
        }

        System.out.println();

        // Display pass or fail
        if (correct >= 15) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }

        keyboard.close();
    }
}
