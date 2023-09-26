// 1.WAP to find the sum of the odd numbers between 7 to 21 using for loop.Display the odd numbers and print the sum as an output.
public class SumOfOdd {
    public static void main(String[] args) {
        int start = 7;
        int end = 21;
        int sum = 0;

        System.out.println("Odd numbers are : ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers  " + start+ " and "+ end +" is "+ sum);
    }
}