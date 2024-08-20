class Squares{
    public static int carpet(int n){
        int ans=0;
        if(n==1){ ans=n+1;}
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(n%2==0){if(j-i==0&&i+j==n)ans=(i+1)*(j+1);}
                else {if(j-i==1 && (i+j)==n)ans=(i+1) * (j+1);}}}
        return ans;}
    public static void main(String... finallygotitsowmi){
        System.out.println(carpet(10));
    }

}