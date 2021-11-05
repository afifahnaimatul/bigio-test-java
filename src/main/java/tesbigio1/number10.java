package tesbigio1;

public class number10 {

    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = i; k < row; k++) {
                System.out.print(" ");
                if (k != row) {
                    System.out.print(" ");
                }
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        
        // reverse
        for (int i = row-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = i; k < row; k++) {
                System.out.print(" ");
                if (k != row) {
                    System.out.print(" ");
                }
            }

            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
