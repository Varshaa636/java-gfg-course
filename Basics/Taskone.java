public class Taskone {
    public static void main(String[] args) {
         String firstName="Sandy";
        String lastName="Jones";
        String movieTitle="The Source Code";
        int numberOfTickets=8;
        double pricePerTicket=10.57;
       // System.out.println("First Name: "+firstName);
       // System.out.println("Last Name: "+lastName);
       // System.out.println("Movie: "+movieTitle);
     //   System.out.println("Number of Tickets: "+numberOfTickets);
        //System.out.println("Price per ticket in USD: "+pricePerTicket);
        double totalPrice= numberOfTickets * pricePerTicket;
       // System.out.println("Total Price of 8 tickets: "+totalPrice);
        String username=(firstName+lastName).toLowerCase();
        //System.out.println("Username: "+username);
        String movieName=movieTitle.toUpperCase();
        //System.out.println("Movie: "+movieName);
        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println("Username: "+username);
        System.out.println("Movie: "+movieName);
        System.out.println("Number of Tickets: "+numberOfTickets);
        System.out.println("Price per ticket: $%.2f"+pricePerTicket);
        System.out.println("Total price of %d tickets: $%.2f"+numberOfTickets+totalPrice);
        System.out.println("\nThank you for choosing us for booking your movietickets");
        System.out.println("Enjoy your movie!!!");

    }
}
