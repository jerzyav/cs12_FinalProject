import java.util.ArrayList;

public class StoredValues {
    private double ans;
    private ArrayList<Double> ansList;
    private boolean emptyAns, emptyAnsList;

    StoredValues() {
        // most recent result (double)
        this.ans = 0;

        // most recent result for lists
        this.ansList = new ArrayList<Double>();

        this.emptyAns = true;
        this.emptyAnsList = true;
    }

    public void store(double answer) {
        this.ans = answer;

        // allows input to accept 'ANS'; enabled after getting first number result
        this.emptyAns = false;
    }

    public void store(ArrayList<Double> answer) {
        this.ansList = answer;

        // allows input to accept 'ANS' to store list;
        // only used for searching (#10); enabled after first sorted list result
        this.emptyAnsList = false;
    }

    public double get_ANS() {
        if (!this.ans_empty()) {
            return this.ans;
        }
        else {
            return Double.NaN;
        }
    }

    public ArrayList<Double> get_ANS_list() {
        return this.ansList;
    }

    public double get_PI() {
        return Math.PI;
    }

    public double get_E() {
        return Math.E;

    }

    public boolean ans_list_empty() {
        return this.emptyAnsList;
    }

    public boolean ans_empty() {
        return this.emptyAns;
    }
}
