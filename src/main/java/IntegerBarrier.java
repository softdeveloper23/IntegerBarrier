import java.util.Scanner;

/*
 * "The integer barrier"
 * Write a program that inputs a sequence of integer numbers in a loop and calculates their sum under the following conditions:
 * 1) if a new number is 0, the program must stop the loop and output the accumulated sum;
 * 2) if the sum is equal to or exceeds the limit of 1000, the program must also stop reading the numbers and output the value equal to the sum minus 1000.
 * Note: the input can contain extra numbers. Just ignore them.
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                if (sum < 1000) {
                    sum += n;
                } else {
                    continue;
                }
            }
        }
        if (sum < 1000) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}
