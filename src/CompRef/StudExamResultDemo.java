package CompRef;

public class StudExamResultDemo {
    public static void main(String[] args) {
        StudExamResult Student = new StudExamResult("Darawin", "Davy", 1);
        StudExamResult Student2 = new StudExamResult("Marcus", "Davy", 2);
        StudExamResult Student3 = new StudExamResult("Ashley", "yeats", 3);
        StudExamResult Student4 = new StudExamResult("Gavin", "James", 4);
        StudExamResult Student5 = new StudExamResult("Shahrukh", "Khan", 5);

        StudExamResult result = new StudExamResult(50, 50, 50, 150);
//        result.average = 30;
        StudExamResult result2 = new StudExamResult(60, 60, 60, 180);
        StudExamResult result3 = new StudExamResult(70, 70, 70, 210);
        StudExamResult result4 = new StudExamResult(80, 80, 80, 240);
        StudExamResult result5 = new StudExamResult(90, 90, 90, 270);

        Student.student();
        result.results();
        Student2.student();
        result2.results();
        Student3.student();
        result3.results();
        Student4.student();
        result4.results();
        Student5.student();
        result5.results();

    }
}