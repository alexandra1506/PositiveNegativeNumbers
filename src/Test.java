import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int countPositive = 0;
        int countNegative = 0;
        if(a > 0) countPositive++;
        if(b > 0) countPositive++;
        if(c > 0) countPositive++;

        if(a < 0) countNegative++;
        if(b < 0) countNegative++;
        if(c < 0) countNegative++;

        System.out.println("количество отрицательных чисел: " + countNegative + "\n"
                + "количество положительных чисел: " + countPositive);

    }
}

