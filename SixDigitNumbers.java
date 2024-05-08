public class SixDigitNumbers {
    public static void main(String[] args) {
        int[] digits = {2, 3, 4, 5, 6, 7};
        int count = generateSixDigitNumbers(digits);
        System.out.println("Total count of 6-digit numbers: " + count);
    }

    public static int generateSixDigitNumbers(int[] digits) {
        int totalCount = 0;
        for (int d1 : digits) {
            for (int d2 : digits) {
                for (int d3 : digits) {
                    for (int d4 : digits) {
                        for (int d5 : digits) {
                            for (int d6 : digits) {
                                int sixDigitNumber = d1 * 100_000 + d2 * 10_000 + d3 * 1_000
                                        + d4 * 100 + d5 * 10 + d6;
                               System.out.println(sixDigitNumber);
                                totalCount++;
                            }
                        }
                    }
                }
            }
        }
        return totalCount;
    }
}
