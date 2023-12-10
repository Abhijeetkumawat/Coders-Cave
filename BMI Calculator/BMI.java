import java.util.Scanner;

class BMICalculator {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Input height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display the result
        System.out.println("Your BMI is: " + bmi);

        // Interpret BMI
        interpretBMI(bmi);

        scanner.close();
    }

    // Function to calculate BMI
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Function to interpret BMI
    private static void interpretBMI(double bmi) {
        System.out.print("Interpretation: ");

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
