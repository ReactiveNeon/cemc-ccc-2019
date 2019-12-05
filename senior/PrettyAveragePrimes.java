import java.util.Scanner;

public class PrettyAveragePrimes {
   public static boolean isPrime (int other) {
      // if other == prime
      for(int i = 2; i < other; i++) {
         if (other % i == 0) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      
      int[] ns = new int[t];
      
      for (int i = 0; i < t; i++) {
         ns[i] = sc.nextInt();
      }
      
      for (int i = 0; i < t; i++) {
         
         int n = ns[i];
         int[] addends = new int[2];
         
         n *= 2;
         
         boolean hasPrime = false;
         for (int j = 2; !hasPrime; j++) {
            if (j % 2 != 0 && j != 2) {
               if (isPrime(j)) {
                  if (isPrime(n-j)) {
                     addends[0] = n - j;
                     addends[1] = j;
                     break;
                  }
               }
            }
         }
         
         System.out.println(addends[0] + " " + addends[1]);
      }
   }
}