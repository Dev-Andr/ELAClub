import java.util.Scanner;

public class aaaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPalindrome = isPalindrome(number);
        
        System.out.println(number + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        
        scanner.close();
    }
    
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0, originalNumber = number;
        
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
