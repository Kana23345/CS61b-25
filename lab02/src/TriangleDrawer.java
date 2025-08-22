public class TriangleDrawer {

    public static void drawTriangle() {
        int size = 5;
        int col = 0;
        int row = 1;
        while (row <= size) {
            while (col < row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            col = 0;

        }
    }

    public static void main(String[] args) {
        drawTriangle();
    }
}
