public class Rotate {
    //0 3 6 9 12 14 18 20 22 25 27 , pos-4 
    //12 14 18 20 22 25 27 0 3 6 9
    public static void rot(int[] arr,int pos){
    int p=1;
    while(p<=pos){
        int last=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=last;
        p++;
    }
    for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
} public static void main(String[] args) {
    int[] arr={0 ,3 ,6, 9 ,12 ,14 ,18 ,20 ,22, 25 ,27};
    rot(arr, 4);
}
}
