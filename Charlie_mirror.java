public class Charlie_mirror {
    public static int magic(String word){
        char[] word1=word.toCharArray();
        StringBuilder reverse=new StringBuilder();
        for(int i=word1.length-1;i>=0;i--){
            reverse.append(word1[i]);
        }
        if(word.equals(reverse.toString())){
            return 1;
        }else{
        return 0;
    }
        
    }
    public static void main(String[] args) {
        System.out.println(magic("plesam"));
    }
}
