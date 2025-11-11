// Bugs added:
// b <= 4000000 instead of b < 4000000
// b % 2 != 0 instead of b % 2 == 0
// sumEven = b instead of sumEven += b
// -EG

public class sum_even_fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int sumEven = 0;
        while (b <= 4000000) {
            if (b % 2 != 0) {
                sumEven = b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
