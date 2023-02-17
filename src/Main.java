public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задание1");
        int[] arr = generateRandomArray();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
            System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2() {
        System.out.println("Задание2");
        int[] arr = generateRandomArray();
        int minSpendPerDay=200000;
        int maxSpendPerDay=100000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minSpendPerDay) {
                minSpendPerDay=arr[i];
            }
            if (arr[i]>maxSpendPerDay) {
                maxSpendPerDay=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSpendPerDay+" рублей. Максимальная сумма трат за день составила "+maxSpendPerDay+"рублей");

    }
    public static void task3() {
        System.out.println("Задание3");
        int[] arr = generateRandomArray();
        int sum=0;
        for (int element : arr) {
            sum+=element;
        }
        System.out.println("Средняя сумма трат за месяц составила "+(double)sum/ arr.length+" рублей");
    }
    public static void task4() {
        System.out.println("Задание4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
