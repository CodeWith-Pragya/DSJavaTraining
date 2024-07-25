public class TimeComplexityWithDebugging {
    public static void main(String[] args) {
        int [] number = { 1, 3, 5, 7, 11, 13 , 9  };
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        int avg =  (sum/number.length);
        System.out.println(avg);
    }
}

