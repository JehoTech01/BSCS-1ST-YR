import javax.swing.JOptionPane;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        int age = getIntInput("Enter your age:", 0, Integer.MAX_VALUE);
        int numberId = getIntInput("Enter your number ID:", 0, Integer.MAX_VALUE);

        boolean isEmployee = JOptionPane.showConfirmDialog(null, "Are you an employee?", "Employee Status",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        double salary = 0;
        double workHours = 0;
        if (isEmployee) {
            salary = getDoubleInputWithCurrency("Enter your monthly salary:", 0, Double.MAX_VALUE);
            workHours = getDoubleInput("Enter your average work hours per week:", 0, Double.MAX_VALUE);
        }

        double principal = getDoubleInputWithCurrency("Enter the principal amount (minimum 1000):", 1000, Double.MAX_VALUE);
        double rate = getDoubleInput("Enter annual interest rate (0% - 100%):", 0, 100);
        double time = getDoubleInput("Enter time in years (1 - 80):", 1, 80);

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        StringBuilder result = new StringBuilder("--- Resume ---\n");
        result.append("Name: ").append(name).append("\n")
              .append("Age: ").append(age).append("\n")
              .append("Number ID: ").append(numberId).append("\n")
              .append("Annual Interest Rate: ").append(rate).append("%\n")
              .append("Years Complied: ").append(time).append("\n")
              .append("Simple Interest Earned: ").append(simpleInterest).append("\n")
              .append("Employment Status: ").append(isEmployee ? "Employed" : "Unemployed");

        if (isEmployee) {
            result.append("\nMonthly Salary: ").append(salary)
                  .append("\nWeekly Work Hours: ").append(workHours);

            result.append("\nYour salary is ")
                  .append(salary >= simpleInterest ? "sufficient" : "NOT sufficient")
                  .append(" to cover the interest payment.");
        } else {
            result.append("\nAs you are unemployed, covering the interest might be challenging.");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static int getIntInput(String message, int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(JOptionPane.showInputDialog(message));
                if (value >= min && value <= max) {
                    return value;
                }
                JOptionPane.showMessageDialog(null, "Value must be between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static double getDoubleInput(String message, double min, double max) {
        while (true) {
            try {
                double value = Double.parseDouble(JOptionPane.showInputDialog(message));
                if (value >= min && value <= max) {
                    return value;
                }
                JOptionPane.showMessageDialog(null, "Value must be between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }

    public static double getDoubleInputWithCurrency(String message, double min, double max) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(message);
                input = input.replaceAll("[^0-9.]", ""); // Remove any non-numeric characters including currency signs
                double value = Double.parseDouble(input);
                if (value >= min && value <= max) {
                    return value;
                }
                JOptionPane.showMessageDialog(null, "Value must be between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }
}