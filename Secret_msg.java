public class Secret_msg {
    public static int agency(String data){
        int count=0;
        for(char c:data.toCharArray()){
            if(Character.isLetter(c)){

            }
            else{
            count++;
            }
        }
        return count;
        }
        public static void main(String[] args) {
            String input="sowmiyaugi@#gmailcom";
            System.out.println(agency(input));

    }
}
