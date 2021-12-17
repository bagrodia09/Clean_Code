public class greatersmaller {
    static class Check {

        int smaller_number;
        int greater_number;
    }

    static greatersmaller.Check find_largest_smallest(int given_numberpool[], int  totalinputs) {
        greatersmaller.Check obj_to_check = new greatersmaller.Check();

        if (totalinputs == 1) {
            obj_to_check.smaller_number = given_numberpool[0];
            obj_to_check.greater_number = given_numberpool[0];
            return obj_to_check;
        }

        if (given_numberpool[0] > given_numberpool[1]) {
            obj_to_check.greater_number = given_numberpool[0];
            obj_to_check.smaller_number = given_numberpool[1];
        }
        else {
            obj_to_check.greater_number = given_numberpool[1];
            obj_to_check.smaller_number = given_numberpool[0];
        }

        for (int index_to_start_from = 2; index_to_start_from < totalinputs; index_to_start_from++) {
            if (given_numberpool[index_to_start_from] > obj_to_check.greater_number) {
                obj_to_check.greater_number = given_numberpool[index_to_start_from];
            }
            else if (given_numberpool[index_to_start_from] < obj_to_check.smaller_number) {
                obj_to_check.smaller_number = given_numberpool[index_to_start_from];
            }
        }

        return obj_to_check;
    }

    public static void main(String args[]) {
        int numberarr[] = {1000, 11, 445, 1, 330, 3000};
        int size_of_array = 6;
        greatersmaller.Check number = find_largest_smallest(numberarr, size_of_array);
        System.out.printf("\nGreatest number is %d", number.greater_number);
        System.out.printf("\nSmallest number is %d", number.smaller_number);
    }
}
