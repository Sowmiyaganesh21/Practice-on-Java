
import java.util.regex.*;


class CharAtFunction{
    public static boolean charAtFun(){
        String input1="egg";
        String input2="boil";
    if(input1.charAt(0)==input2.charAt(input2.length()-1))
        return true;
        else 
        return false;

    }
    public static void main(String[] args) {
        System.out.println("CharAt && toCharArray");
        System.out.print(charAtFun());
        System.out.println("sowmiya ganesh".toCharArray());
    }}
    class EqualsFunction{
    public static boolean equalsFun(){
        String name1="sowmi";
        String name2="kamal";
        if(name1.equals(name2)) return true ;
        else return false ;
    }
    public static void main(String[] args) {
        System.out.println("EqualsFunction");
        System.out.print(equalsFun());
    }
    }
    class EqualsIgnoreFunction{
    public static boolean equalsIgnoreCaseFun(){
        String name="MadaM",rev="";
        for(int i=name.length()-1;i>=0;i--)
        rev+=name.charAt(i);
        if(name.equalsIgnoreCase(rev)) 
             return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        System.out.println(equalsIgnoreCaseFun());
    }
    }
    class CompareToFUnction{
    public static void compareToFun(){
        String name1="sowmiyaganesh";
        String name2="kamaleshganeSh";
        System.out.print(name1.compareTo(name2));
        String name3="KAMALESH";
        System.out.println(name1.compareToIgnoreCase(name3));
    }
    public static void main(String[] args) {
        System.out.println("Compareto && CompareIgnorecase");
        compareToFun();
    }
    }
   class StartsWith{
    public static boolean start(String name){
        if(name.startsWith("s")) return true ;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("StartsWith");
        System.out.print(start("sowmiya"));
    }
   }
   class EndsWith{
    public static boolean endswith(){
        String name="karthick";
        if(name.endsWith("l")) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("EndsWith");
        System.out.print(endswith());
    }
   }
   class HashCode{
    public static void main(String[] args) {
        System.out.println("Hasgcode");
        System.err.print("sowmiya".hashCode());
    }
   }
   class IndexOf{
    public static void main(String[] args) {
        System.out.println("Indexof");
        System.out.print("Sanjay".indexOf("j"));
        System.out.println("LastIndexof");
        System.out.print("Sanjay".lastIndexOf("j"));
        System.out.println("lastIndexofWithStart");
        System.out.print("Sanjay".lastIndexOf('y',2));
    }
   }
   class Concat{
    public static void main(String[] args) {
        System.out.println("Concatination");
        System.out.print("Lucky".concat("Girl"));
    }
   }
   class Replace{
    public static void main(String[] args) {
        System.out.println("Replace");
        System.out.print("sowmiyaganesh".replace("ganesh", "kamalesh"));
        System.out.print("sowmiyaganesh".replaceAll("w", "kamalesh"));
    }
   }
   class Contains{
    public static void main(String[] args) {
        String name="CracyIdiot";
            System.out.println("Contains");
            System.out.print(name.contains("i"));
    }
   }
   class Case{
    public static void main(String... iwilldoit){
        System.out.println("Uppercase && LowerCase");
        System.out.print("be_happy_always".toUpperCase());
        System.out.print("UNTILL YOU DECIDE!! YOU CAN".toLowerCase());
    }
   }
   class Empty{
    public static void main(String[] args) {
        String name="unlucky girl";
        System.out.println("IsEmpty && IsBoolean");
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
    }
   }
   class Split{
    public static void main(String[] args) {
        String input1="IDIOTIC FRIENDS";
        System.out.println("Split");
        System.out.println(input1.split(" ")[1].toLowerCase());
    }
   }
   class Formatter{
    public static void main(String[] args) {
        System.out.println("FORMATTING && JOIN");
        System.out.print(String.format("Sowmiya"));
        System.out.print(String.join("Hate you is my favourite command"));
    }
   }
   class Intern{
    public static void main(String[] args){
        String input1=new String("Sowmiya Ganesh").intern();
        String input2=new String("Sowmiya Ganesh");
         System.out.println("INTERN");
        if(input1==input2) System.out.println("true");
         System.out.println("VALUE OF");
         System.out.println(String.valueOf("Dont quit baby still there are more heights to reach"));
       System.out.println("PATTERN && MATCHES");
        System.out.println(Pattern.matches("idiot","id"));
    }
   }
   class Codepoint{
    public static void main(String[] args){
        System.out.println("CODEPOINTAT");
        System.out.print("sowmiya".codePointAt(3));
    }
   }


   