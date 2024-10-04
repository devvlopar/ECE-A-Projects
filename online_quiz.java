oimport java.util.HashMap;
import java.util.Scanner;

class Quiz {
    private HashMap<String, String> questions;

    public Quiz() {
        questions = new HashMap<>();
    }

    public void addQuestion(String question, String answer) {
        questions.put(question, answer);
        System.out.println("Question added.");
    }

    public void takeQuiz() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (String question : questions.keySet()) {
            System.out.println(question);
            String userAnswer = sc.nextLine();
            if (userAnswer.equalsIgnoreCase(questions.get(question))) {
                score++;
            }
        }
        System.out.println("Quiz finished! Your score: " + score);
    }
}

