package AssignmentQ3;

import java.util.*;

class Question {
    int qno;
    String question, opt1, opt2, opt3, opt4;
    int ans;
    int marks;

    Question(int qno, String question, String opt1, String opt2,
             String opt3, String opt4, int ans, int marks) {
        this.qno = qno;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
        this.marks = marks;
    }

    int askQuestion(Scanner sc) {
        System.out.println(qno + ". " + question);
        System.out.println("1." + opt1);
        System.out.println("2." + opt2);
        System.out.println("3." + opt3);
        System.out.println("4." + opt4);

        int userAns = sc.nextInt();

        if (userAns == ans)
            return marks;
        return 0;
    }
}

class Exam {
    int examId;
    String name, topic, date;
    Question[] questions;

    Exam(int examId, String name, String topic, String date, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.questions = questions;
    }

    int conductExam(Scanner sc) {
        int total = 0;

        for (Question q : questions) {
            total += q.askQuestion(sc);
        }

        return total;
    }
}

