import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab02_1 {

    public static void main(String[] args) {
        float height, weight, BMI;
        String result;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your height(m): ");
        height = sc.nextFloat();
        System.out.print("Please enter your weight(kg): ");
        weight = sc.nextFloat();

        DecimalFormat dF = new DecimalFormat("#.##");
        BMI = Float.parseFloat(dF.format(weight / (height * height)));
        System.out.println("Your BMI is " + BMI);

        if (BMI < 18.5) {
            result = "You are underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            result = "You are normal weight";
        } else if (BMI >= 25 && BMI <= 29.9) {
            result = "You are overweight";
        } else {
            result = "You are obesity!!!";
        }
        System.out.println(result);

    }
}
