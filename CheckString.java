public class CheckString{
     static String reverse(String lett){
        int uC=0;
        int lC=0;
        for(int i=0;i<lett.length();i++){ 
            char c= lett.charAt(i);
            if(Character.isUpperCase(c)){
                uC++;
            }else{
                lC++;
            }
        }
        if(uC>lC){
            return lett.toUpperCase();
        }
        else{
            return lett.toLowerCase();
        }
    }
    public static void main(String[] args) {
        String lett="SowmiYAGANESh";
        System.out.println(reverse(lett));
    }
}