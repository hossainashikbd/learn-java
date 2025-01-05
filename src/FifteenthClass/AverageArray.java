package FifteenthClass;

    public class AverageArray {
        public static void main(String[] args) {

            int[] numbers = {20, 40, 50, 60, 70};

            double average = calculateAverage(numbers);

            System.out.println("The average value of the array is: " + average);
        }


        public static double calculateAverage(int[] array) {
            int sum = 0;


            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return (double) sum / array.length;
        }
    }
