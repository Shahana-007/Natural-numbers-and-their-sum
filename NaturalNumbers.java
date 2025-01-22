import java.util.Scanner;
class NaturalNumbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of natural numbers: ");
int n = sc.nextInt();
int sum = 0;
System.out.println("The first " + n + " natural numbers are:");
for (int i = 1; i <= n; i++) {
System.out.println(i);
sum += i;
}
System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
sc.close();
}
}

