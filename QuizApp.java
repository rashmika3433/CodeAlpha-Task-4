import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                
                "What is not included in oop concepts?",
                "Which OOP concept allows a class to inherit properties and behaviors from another class?",
                "What is the benefit of using polymorphism in OOP?"
        };

        String[][] selections = {
                
                {"A. Abstraction", "B. Encapsulation", "C. Decomposition", "D. Polymorphism"},
                {"A. Inheritance" , "B. Encapsulation", "C. Polymorphism", "D. Abstraction"},
                {"A. It ensures data integrity and hides implementation details.", "B. It allows for code reuse and reduces redundancy.", "C. It enables objects of different classes to respond to the same method call differently.", "D. It provides a way to define abstract classes and interfaces."}
        };

        int[] correctAnswers = {2, 0, 2};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String[] choices = selections[i];
            for (String choice : choices) {
                System.out.println(choice);
            }

            System.out.print("Enter your choice (A, B, C, or D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            int userChoice;
            switch (userAnswer) {
                case "A":
                    userChoice = 0;
                    if (0 == correctAnswers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } 
                    else {
                        System.out.println("Incorrect Answer!");
                    }
                    break;

                case "B":
                    userChoice = 1;
                    if (1 == correctAnswers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } 
                    else {
                        System.out.println("Incorrect Answer!");
                    }
                    break;

                case "C":
                    userChoice = 2;
                    if (2 == correctAnswers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } 
                    else {
                        System.out.println("Incorrect Answer!");
                    }
                    break;

                case "D":
                    userChoice = 3;
                    if (3 == correctAnswers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } 
                    else {
                        System.out.println("Incorrect Answer!");
                    }
                    break;

                default:
                    userChoice = -1;
                    System.out.println("Invalid Answer!");
                    break;
            }

            System.out.println();
        }

        
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}