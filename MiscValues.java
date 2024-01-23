import java.util.ArrayList;

public class MiscValues {
    private double ans, PI, E;
    private ArrayList<Double> ansList;

    MiscValues() {
        this.ans = 0;
        this.ansList = new ArrayList<Double>();

        this.PI = Math.PI;
        this.E = Math.E;
    }

    void store(double answer) {
        this.ans = answer;
    }

    void store(ArrayList<Double> answer) {
        this.ansList = answer;
    }

    double get_ANS() {
        return this.ans;
    }

    ArrayList<Double> get_ANS_list() {
        return this.ansList;
    }

    double get_PI() {
        return this.PI;
    }

    double get_E() {
        return this.E;
    }
}
