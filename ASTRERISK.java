public class ASTRERISK {
    public static void main(String[] args) {
        int term = 6;
        for (int i = 0; i < term; i++) { 
           
            for (int j = term - i; j > 1; j--) {
                System.out.print(" "); 
            }
            // Print asterisks
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(""); 
        }
    }
}


/*public class PrintingPatterns {

    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int k = 2 * n - 2;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        k = -1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = k; j >= 0; j--) {
                System.out.print(" ");
            }
            k = k + 2;
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    */