package Multithreading;
class BookTicket{
       int total_seats=10;
      synchronized void bookSeats(int seats){

           if(total_seats>=seats){
               System.out.println(seats+" seat succesfully booked");
               total_seats=total_seats-seats;
               System.out.println("total seats available : "+total_seats);
           }
           else{
               System.out.println("seats not available");
               System.out.println("total seats available : "+total_seats);
           }

       }
        }
public class TicketBookingApp extends Thread {
   static BookTicket b;
    int seats;
    public void run(){
        b.bookSeats(seats);
    }
    public static void main(String[] args) {
         b=new BookTicket();
         TicketBookingApp ankur=new TicketBookingApp();
         ankur.seats=6;
         ankur.start();
         TicketBookingApp akash=new TicketBookingApp();
         try{
             ankur.join();
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         akash.seats=4;
         akash.start();

    }
}
