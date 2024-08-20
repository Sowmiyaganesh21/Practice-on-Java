enum EventType {
    MOVIE, SPORTS, CONCERT
}

class Event{
    private String name;
    private String eventDate;
    private String eventTime;
    private String venueName;
    private int totalSeats;
    private int availableSeats;
    private double ticketPrice;
    private EventType eventType;

    public Event(String name, String eventDate, String  eventTime, String venueName, 
                         int totalSeats, int availableSeats, double ticketPrice, EventType eventType) {
        this.name = name;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.venueName = venueName;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String get() {
        return eventDate;
    }

    public void set(String eventDate) {
        this.eventDate = eventDate;
    }
    public String get() {
        return eventTime;
    }

    public void set(String eventTime) {
        this.eventTime = eventTime;
    }
    public String get() {
        return venueName;
    }

    public void set(String venueName) {
        this.venueName = venueName;
    }
    public int get() {
        return totalSeats;
    }

    public void set(int totalSeats) {
        this.totalSeats =totalSeats;
    }
    public int get() {
        return availableSeats;
    }

    public int set(int availableSeats) {
        this.availableSeats=availableSeats;
    }

    public int get() {
        return ticketPrice;
    }

    public void set(int ticketPrice) {
        this.ticketPrice= ticketPrice;
    }
    public EventType get() {
        return eventType;
    }

    public void set(enum eventType) {
        this.eventType =eventType;
    }

    public int totalRevenue() {
        int soldSeats = totalSeats - availableSeats;
        return (int) (soldSeats * ticketPrice);
    }

    public int calculateTotalRevenue() {
        return totalSeats - availableSeats;
    }

    public int bookTickets(int numTickets) {
        if (numTickets <= availableSeats) {
            availableSeats -= numTickets;
        }
        return availableSeats;
    }

    public int cancelBooking(int numTickets) {
        availableSeats += numTickets;
        return availableSeats;
    }

    public void displayEventDetails() {
        System.out.println("Event Details:");
        System.out.println("Name: " + name);
        System.out.println("Date: " + formatDate(eventDate));
        System.out.println("Time: " + formatTime(eventTime));
        System.out.println("Venue: " + venueName);
        System.out.println("Event Type: " + eventType);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Ticket Price: $" + String.format("%.2f", ticketPrice));
    }

    private String formatDate(String date) {
        String dateStr = String.valueOf(date);
        return dateStr.substring(0, 4) + "-" + dateStr.substring(4, 6) + "-" + dateStr.substring(6);
    }

    private String formatTime(String time) {
        String timeStr = String.format("%04d", time);
        return timeStr.substring(0, 2) + ":" + timeStr.substring(2);
    }
}

class TicketBooking {
    public static void main(String[] args) {
        Event tk = new Event("Summer Concert", "04/07/2024", "4.00pm", "Kongunadu college", 1000, 1000, 150.00, EventType.CONCERT);
        Venue vn=new Venue("KONGUNADU COLLEGE","THOTIYAM ,TRICHY");
        Customer cos=new Customer("sowmiya", "sowmiyaugi@gmail.com", 8300064450);
        
        tk.displayEventDetails();
        
        System.out.println("\nBooking 5 tickets...");
        int availableSeats = tk.bookTickets(5);
        System.out.println("Available seats after booking: " + availableSeats);
        int Cancelled=tk.cancelBooking(4);
        System.out.println("Cancelled seats:"+ Cancelled);
        
        System.out.println("\nTotal revenue: $" + tk.totalRevenue());
        
        System.out.println("\nUpdated event details: " );
        tk.displayEventDetails();
        System.out.println("Venue Event Details");
        vn.displayVenueEventDetails();
        System.out.println("Costomer Details");
        cos.displayCustomerDetails();
        
    }
}
class Venue{
    private String name;
    private String address;
    
    public Venue(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }   
    public String get(){
        return address;
    }
    public void set(String address){
        this.address=address;
    }    
    public void displayVenueEventDetails(){
        System.out.println("Venue Details");
        System.out.println("venue name"+name);
        System.out.println("venue address"+address);
    }
}
class Customer{
    private String customer_name;
    private String email;
    private double phone_number;

    public Customer(String customer_name,String email,double phone_number){
        this.customer_name=customer_name;
        this.email=email;
        this.phone_number=phone_number;
    }
    public String getName(String customer_name){
        return customer_name;
    }
    public void setName(String customer_name){
        this.customer_name=customer_name;
    }
    public String get(String email){
        return email;
    }
    public void set(String email){
        this.email=email;
    }
    public double get(double phone_number){
        return phone_number;
    }
    public void set(double phone_number){
        this.phone_number=phone_number;
    }
    public void displayCustomerDetails(){
        System.out.println("Customer Details");
        System.out.println("Customer Name"+customer_name);
        System.out.println("Email"+email);
        System.out.println("phone number"+phone_number);
    }

}
class Booking{
    public void calculate_booking_cost(int num_tickets){

    }
}
