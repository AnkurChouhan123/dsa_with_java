package ExceptionHandling;

public class OrderOfMultipleCatchBlock {
    public static void main(String[] args) {

       /*

       xxxxxxxxxxxxx ------ invalid code-------xxxxxxxxxxxxx
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e) {
            System.out.println(10 / 2); //big umbrella
        }
        catch (ArithmeticException e) {  // small Umbrella
            System.out.println(e);
        }


         ---> Valid Code <---

       try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e) {  // small Umbrella
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(10 / 2); //big umbrella
        }




If you open a big umbrella (Exception) first →
no rain will ever reach the small umbrella (ArithmeticException) → compiler blocks it.

If you open the small umbrella first →
it will catch specific rain drops (ArithmeticException).
Then the big umbrella can still catch the rest (other exceptions).
        */


    }
}
