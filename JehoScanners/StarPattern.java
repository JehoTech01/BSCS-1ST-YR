
public class StarPattern {
    public static void main(String[] args) {
      int rows = 6; // Number of rows in the pattern
  
      // Left side of the pattern
      for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
  
      // Right side of the pattern
      for (int i = rows; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
          System.out.print("  ");
        }
        for (int k = 1; k <= rows - i + 1; k++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }