import java.util.Scanner;
 class FavNumbers {
     static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int favoriteInt = SafeInput.getInt(in, "Please enter an int: ");

         double favoriteDouble = SafeInput.getDouble(in, "Please enter an double");

         System.out.println("Your favorite integer is: " + favoriteInt);
         System.out.println("Your favorite double is: " + favoriteDouble);


     }

     private static class SafeInput {
         public static int getInt(Scanner in, String s) {

             return 0;
         }

         public static double getDouble(Scanner in, String pleaseEnterAnDouble) {
             return 0;
         }
     }
 }

