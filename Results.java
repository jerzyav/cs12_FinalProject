import java.util.ArrayList;

public class Results {
    Results() {
    }

    void display(double answer) {
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        System.out.println("Result: " + answer);
        System.out.println("Saved to ANS.");
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");

    }

    void display(ArrayList<Double> answerList) {
        System.out.print("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        System.out.println();
        System.out.println("Result: " + answerList);
        System.out.println("(Saved in ANS.)");
        System.out.print("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        System.out.println();
    }
}