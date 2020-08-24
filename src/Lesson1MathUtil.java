import java.sql.SQLOutput;

public class Lesson1MathUtil {

    public static void main(String[] args) {
        System.out.println(max(10, 10));
        System.out.println(abs(13));
        System.out.println(min(5, -12, -12));
        System.out.println(max(12, 12, 5));
    }

    public static int min(int a, int b) {
        int minimum;
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            minimum = a;
        } else {
            minimum = b;
        }
        return minimum;
    }

    public static int max(int a, int b) {
        int maximum;
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        return maximum;
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a < 0) {
            a = -a;
        }
        return a;
    }

    public static boolean isEven(int a) {
        boolean even;
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        if (a % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }

    public static int min(int a, int b, int c) {
        int minimum;
        // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {
            minimum = a;
        } else if (b <= a && b <= c) {
            minimum = b;
        } else {
            minimum = c;
        }
        return minimum;
    }

    public static int max(int a, int b, int c) {
        int maximum;
        // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            maximum = a;
        } else if (b >= a && b >= c) {
            maximum = b;
        } else {
            maximum = c;
        }
        return maximum;
    }

}
