public class Main {
    public static int r;

    public static void main(String[] args) {
        Squares();
        Cubes();
        Fibonacci();
        Prime();
        Triangles();
    }

    public static void Squares() {
        int x = 1;
        System.out.print("First 10 Square Numbers: ");
        while (x <= 10) {
            int a = x * x;
            System.out.print(a + " ");
            x = x + 1;
        }
        System.out.println();
    }

    public static void Cubes() {
        int x = 1;
        System.out.print("First 10 Cube Numbers: ");
        while (x <= 10) {
            int a = x * x * x;
            System.out.print(a + " ");
            x = x + 1;
        }
        System.out.println();
    }

    public static void Fibonacci() {
        int x = 1;
        int a = 1;
        int b = 0;
        System.out.print("First 10 Fibonacci Numbers from 1: ");
        while (x <= 10) {
            int n = a + b;
            System.out.print(n + " ");
            b = a;
            a = n;
            x = x + 1;
        }
        System.out.println();
    }

    public static void Prime() {
        int x = 1;
        int y = 3;
        int n = 2;
        System.out.print("First 10 Prime Numbers: 2 ");
        while (x <= 9) {

            while (y != n) {
                r = y % n;
                if (r == 0) {
                    y = y + 1;
                    n = y;
                } else {
                    if (y == n + 1) {
                        System.out.print(y + " ");
                        x = x + 1;
                        y = y + 1;
                        n = y;
                    } else {
                        n = n + 1;
                    }
                }
            }
            n = 2;
        }
        System.out.println();
}
    public static void Triangles() {
        int x = 1;
        int a = 0;
        int b = 1;
        System.out.print("First 10 Triangle Numbers: ");
        while (x <= 10) {
            int n = a + b;
            System.out.print(n + " ");
            b = b + 1;
            a = n;
            x = x + 1;
        }
        System.out.println();
    }

}
