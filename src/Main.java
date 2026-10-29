public class Main {

    public static void main(String[] args) {
        int val = 123;

        int sum = find_Sum_of_Digits(val);
        System.out.println("Sum is :" + sum);
    }

    public static int find_Sum_of_Digits(int val) {

        if (val == 0)
            return 0;
        else {
            return val + find_Sum_of_Digits(val / 10);
        }
    }
}

//find_Sum_of_Digits(123) = 3 + find_Sum_of_Digits(12)
// find_Sum_of_Digits(12) = 2 + find_Sum_of_Digits(1)
//find_Sum_of_Digits(1) = 1 + find_Sum_of_Digits(0)
 // find_Sum_of_Digits(0) = 0
 // find_Sum_of_Digits(1) = 1 + 0
 // find_Sum_of_Digits(12) = 2 + 1
// find_Sum_of_Digits(123) =
