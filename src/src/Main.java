public class Main {
    public static void main(String[] args) {

        int a = 18;
        int b = 56;
        int с = 90;
        int e = 112;

        int sum1 = a + b;
        int sum2 = с + e;

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum1 > sum2);

        sum1 += 1;
        sum2 -= 2;

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum1 > sum2);

        System.out.println(sum1 % 2 < 1 || sum2 % 2 < 1 ? "True" : "False");

        System.out.println(sum1 % 2);
        System.out.println(sum2 % 2);

    }
}