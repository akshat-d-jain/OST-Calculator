public class Fibonacci {
 public static void main(String[] args) {
 int n = 5;
 generateFibonacci(n);
 }
 public static void generateFibonacci(int n) {
 int firstTerm = 0, secondTerm = 1;
 System.out.println("Fibonacci Series for " + n + " terms:");
 for (int i = 0; i < n; i++) {
 System.out.print(firstTerm + " ");
 int nextTerm = firstTerm + secondTerm;
 firstTerm = secondTerm;
 secondTerm = nextTerm;
 }
 }
}