package Rapido; 

public class BookingProcess {

   public BookingDetails ola(BookingDetails bookingDetails) {
       if (bookingDetails.getNoOfPersoan() >= 1) {
           bookingDetails.getBike();
           if (bookingDetails.getNoOfPersoan() <= 3) {
               bookingDetails.getAuto();

           } else {
               bookingDetails.getCar();

           }



       }return bookingDetails;


   }
}
