
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

class UpperCase{
    public static String SecondUpperCase(){
        String input1="Wipro technology answer";
        //wipro=0 --5
        //technology-1---10
        //banglore-2--8
        // System.out.println(input1.trim());
        if(input1.split(" ").length>1){
            return input1.split(" ")[1].toUpperCase();
        }else{
            return "LESS";
        }
    }
    public static void SSecond(){
        String input1="wirpo tech";
        StringTokenizer st=new StringTokenizer(input1," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
     public static void SSecond1(){
       String input1="wirpo assessment tech";
        List<String> arr=new ArrayList<>();
        char[] arrfinal=input1.toCharArray();
        String temp="";
        for(int i=0;i<arrfinal.length;i++){
            if(arrfinal[i]!=' '){
                temp+=arrfinal[i];
            }
            else{
                arr.add(temp);
                temp="";
            }
        } 
        arr.stream().forEach(n ->System.out.println(n));
    }
    public static void main(String[] args) {
        // System.out.println(SecondUpperCase());
        // SSecond();
        // SSecond1();
         
    }

}