import java.util.*;
class Resort{
   int roomno;
    String[] customer_name;
    int charge_per_day;
    int days_stay;
// public static int getName(int[] roomno){
//     for(int i:roomno){
//         roomno();
//     }
// }
public static String customername(String customer_name){
    return customer_name;
}
public static double charge(double charge_per_day){
    int day_am=2;
    return charge_per_day*day_am;
}

}
class Booking {
    public static void main(String... booking){
        
        Scanner input=new Scanner(System.in);
        Resort book=new Resort();
        book.roomno=input.nextInt();
        book.customer_name=input.nextLine();
        book.charge_per_day=input.nextInt();
        System.out.println(customername(book.customer_name));
        System.out.println(charge(book.charge_per_day));
        

        input.close();
    }
}