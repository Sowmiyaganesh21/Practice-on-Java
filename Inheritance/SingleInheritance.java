public class SingleInheritance {
   public static void main(String[] args) {
        Shape obj=new Shape();     
        Rectangle obj1=new Rectangle();
        System.out.println(obj.getarea(12)+" and "+obj1.getarea(3,6));
   }
}
class Shape{
    public int getarea(int area){
            return area;
    }
}
class Rectangle extends Shape{
    public int getarea(int length,int width){
        return length * width;
    }
}
