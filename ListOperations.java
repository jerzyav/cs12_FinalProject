import java.util.ArrayList;

public class ListOperations {

    ListOperations() {};

    public ArrayList<Double> sort_list(UserInput userInput, StoredValues storedValues) {

        System.out.println("Sorting a list of numbers, from least to greatest.");

        ArrayList<Double> unsortedList = userInput.get_unsorted_list(storedValues);
        ArrayList<Double> sortedList = merge_sort(unsortedList, 0, unsortedList.size()-1);

        return sortedList;
    }

    public int search_list(UserInput userInput, StoredValues storedValues) {
        int index;
        double itemToSearch;
        ArrayList<Double> sortedList;

        System.out.println("Searching for a number in a given sorted list.");

        // forces user to enter and sort a list if there is none previously sorted
        if (storedValues.ans_list_empty())  {
            sortedList = sort_list(userInput, storedValues);
        }
        else {
            // gives user the option to use previous or use new list
            boolean useRecentList = userInput.get_user_list(storedValues);
            if (useRecentList) {
                sortedList = storedValues.get_ANS_list();
            }
            else {
                sortedList = sort_list(userInput,storedValues);
            }
        }

        storedValues.store(sortedList);
        System.out.println("[?] The list: " + sortedList);


        itemToSearch = userInput.get_user_number("number to search", storedValues);
        index = recursive_binary_search(sortedList, itemToSearch, 0, sortedList.size()-1);

        return index;
    }

    private static int recursive_binary_search(ArrayList<Double> sortedList, double itemToSearch, int start, int end) {
        int mid = (start + end) / 2;

        if (start > end) {
            return -1;
        }
        else if (itemToSearch == sortedList.get(mid)) {
            return mid;
        }
        else if (itemToSearch < sortedList.get(mid)) {
            return recursive_binary_search(sortedList, itemToSearch, start, mid - 1);
        }
        else if (sortedList.get(mid) < itemToSearch) {
            return recursive_binary_search(sortedList, itemToSearch, mid + 1, end);
        }

        return -1;
    }

    private static ArrayList<Double> merge_sort(ArrayList<Double> myList, int start, int end) {
        // base case
        if (start >= end) {
            return new ArrayList<Double>(myList.subList(start, start+1));
        }

        // left half
        ArrayList<Double> LHS = merge_sort(myList, start, (int)((start + end)/2));

        // right half
        ArrayList<Double> RHS = merge_sort(myList, (int)((start + end)/2) + 1, end);

        // zipper (merge) LHS and RHS
        return zipper(LHS, RHS);
    }

    // zipper (merge)
    private static ArrayList<Double> zipper(ArrayList<Double> LHS, ArrayList<Double> RHS) {
        ArrayList<Double> zippedList = new ArrayList<Double>();
        while (LHS.size() > 0 || RHS.size() > 0)
            if (LHS.size() > 0 && RHS.size() > 0) {
                if (LHS.get(0) < RHS.get(0)) {
                    zippedList.add(LHS.get(0));
                    LHS.remove(0);
                }
                else {
                    zippedList.add(RHS.get(0));
                    RHS.remove(0);
                }
            }
            else if (LHS.size() == 0) {
                zippedList.add(RHS.get(0));
                RHS.remove(0);
            }
            else if (RHS.size() == 0) {
                zippedList.add(LHS.get(0));
                LHS.remove(0);
            }
        return zippedList;
    }
}
