public class Inverted_Half_Pyramid_with_spaces_rotated_by_180_degree {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}