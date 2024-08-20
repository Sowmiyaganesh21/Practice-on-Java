public class Employee_rating {
    public static void point(int erg){
        
           if (erg>30 && erg<50) System.out.println('d');
            else if (erg>51 && erg<60) System.out.println('e');
            else if(erg>61 && erg<80) System.out.println('f');
            else if (erg>81 && erg<100)System.out.println('g');
        }
    public static void main(String[] args) {
        point(64);
    }
    
}
