public class Main {
        public static void main(String[] args) {
                int[] arr = generateRandomArray();
                //task1
                int total = 0;
                for (int i = 0; i < arr.length; i++) {
                        total = total + arr[i];
                        if(i == arr.length-1) {
                                System.out.println("Сумма трат за месяц составила " + total + " руб.");}

                }
                //task2
                int maxExpense = 0;
                for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > maxExpense){
                                maxExpense = arr[i];
                        }
                }
                System.out.println("Максимальная сумма трат за день составила " + maxExpense + " руб.");
                int minExpense = maxExpense;
                for (int i = 0; i < arr.length; i++) {
                        if (arr[i] < minExpense) {
                                minExpense = arr[i];
                        }
                }
                System.out.println("Минимальная сумма трат за день составила " + minExpense + " руб.");
                //task3
                Float midExpense = total/30f;
                System.out.println("Средняя сумма трат за месяц составила " + midExpense + " руб.");

                //task4
                char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                char symbol;
                for (int i = 0; i < reverseFullName.length/2; i++) {
                        symbol = reverseFullName[i];
                        reverseFullName[i] = reverseFullName[reverseFullName.length-1 - i];
                        reverseFullName[reverseFullName.length-1 - i] = symbol;}
                for (char letter : reverseFullName){
                        System.out.print(letter);
                }
        }
        public static int[] generateRandomArray() {
                java.util.Random random = new java.util.Random();
                int[] arr = new int[30];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(100_000) + 100_000;;
                }
                return arr;
        }
}

