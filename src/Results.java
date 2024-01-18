public class Results {
    private double ANS;

    Results() {
        this.ANS = 0;
    }

    void display(double answer) {
        System.out.println("--*---*---*---*---*---*---*---*---*---*---*--");
        System.out.println("Result: " + answer);
        System.out.println("Saved to ANS.");
        System.out.println("--*---*---*---*---*---*---*---*---*---*---*--");

    }

//    void display(double[] result) {
//        System.out.print("------------------------");
//        System.out.println();
//        System.out.println("Result = " + result);
//        System.out.println("(Saved in ANS.)");
//        System.out.print("------------------------");
//        System.out.println();
//    }

    void store(double answer) {
        this.ANS = answer;
    }

    double get_ANS() {
        return this.ANS;
    }

//    boolean check_ANS() {
//        if (this.ANS != "unused") {
//
//        }
//
//        return false;
//    }
}