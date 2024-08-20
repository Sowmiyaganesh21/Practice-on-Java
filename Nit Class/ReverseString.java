public class ReverseString {
    public static void reverse(String name){
        // char n=name.charAt();
        // for(int i=name.length();i>0;i--){
        //     // if(name!="_")
        //     System.out.print(name[i]);
        // }
        // char[] n=name.toCharArray();
        // for(int i=n.length-1;i>=0;i--)System.out.print(n[i]);
        byte[] n1=name.getBytes();
        byte[] result= new byte[n1.length];
        for(int i=n1.length-1;i>=0;i--)
            result[i]=n1[n1.length-i-1];
            System.out.print(new String(result));
       

    }
    public static void main(String[] args) {
        String name="\"hellooothisissowmiya\"";
        reverse(name);
    }
    
}
