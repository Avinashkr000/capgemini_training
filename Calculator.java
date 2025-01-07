public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1/2/3/4/5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting...");
                break; // Exit the loop
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = calculator.divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        scanner.close(); // Close the scanner
    }
}
