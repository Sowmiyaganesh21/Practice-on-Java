class PossibleString{
	static void possible(String str,String empty){
		if(str.length()==0){
			System.out.print(empty+" ");
			return;
		}
		// if(n==0){
		// 	return ;
		// }
		for(int i=0;i<str.length();i++){
			String result=str.substring(0, i)+str.substring( i+1);
			possible(result, empty+str.charAt(i));
		}
	}
	public static void main(String[] args) {
		//int n=3;
		String str="()()()"; //o/p - ["((()))","(()())","(())()","()(())","()()()"] 
		possible(str," ");
	}
}


// 
// class PossibleString {
//     static StringBuilder result = new StringBuilder();

//     static void possible(String str, String empty, int n) {
//         if (n == 0 && str.length() == 0) {
//             result.append("\"").append(empty).append("\",");
//             return;
//         }
//         if (n > 0) {
//             possible(str, empty + "(", n - 1);
//         }
//         if (str.length() > 0) {
//             possible(str.substring(1), empty + ")", n);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "()";
//         result.append("[");
//         possible(str, "", 1);
//         if (result.length() > 1) {
//             result.setLength(result.length() - 1);
//         }
//         result.append("]");
//         System.out.println(result.toString());
//     }
// }