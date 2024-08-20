public class IP_replace {
    public static void replace(String address){
        //System.out.printf("\""+(address.replace(".","[.]"))+"\"");
        String ans="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                ans+="[.]";
            }
            else{
                ans+=address.charAt(i);
            }
        }
        System.out.print(ans);
    }

    public static void main(String[] args) {
        String address="255.255.255.255";
        replace(address);
    }
    
}
