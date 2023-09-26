// 2.Write a Java switch case program to take the students names and attendance % of 10 students as input and display their grades according to the below conditions:
//  * If attendance above 90 then “A” 
//  * If attendance between 90-80 then “B” 
//  * If attendance between 80-70 then “C” 
//  * If attendance between 70-60 then “D” 
//  * If attendance between 45-60 then “E”



import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String s=sc.next();
        System.out.println(s);
        System.out.println("Enter Your %");
        int per=sc.nextInt();
        switch (per/10) {
            case 9:
            System.out.println("A");
                break;
                case 8:
            System.out.println("B");
                break;
                case 7:
            System.out.println("C");
                break;
                case 6:
            System.out.println("D");
                break;
                case 5:
            System.out.println("E");
                break;
        }
    }
}
