
import java.util.Arrays;

// import java.util.HashSet;
public class RepeatString{
    public static void characters(String name){
        //1 4 5 2 6 8 2 1
        int i=0,j=name.length-1;
        while(i<j){
            if(name[i]==name[j]){
                name[i]=name[j];
            }
        }
        System.out.print(Arrays.toString(name));

        // HashSet<Integer>seen=new HashSet<>();
        // HashSet<Integer> repeat=new HashSet<>();
        // int count=0;
        // for(int c:name){
        //     if(!seen.add(c)){
        //         count++;
        //     }
        //     else{
        //         count=0;
        //     }
        // }
        // System.out.println(count);
    }
    public static void main(String[] args) {
        String name1="sowmiya ganesh";
        // int arr[]={1,4,6,1,4,4,8,2,8};
        characters(name1);
    }
}