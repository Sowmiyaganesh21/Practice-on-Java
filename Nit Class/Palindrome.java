class Palindrome{
    public static int ispanlin(String name){
        // char[] n=name.toCharArray();
        String  rev="";
            for(int i=name.length()-1;i>=0;i--){
                // System.out.print(n[i]); 
                rev+=name.charAt(i);
            }
            if(name.equalsIgnoreCase(rev))
            return 2;
            else return 1;
            
    }
    public static void main(String[] args) {
        System.out.println(ispanlin("MADAM"));
    }

}