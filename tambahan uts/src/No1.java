import java.util.Scanner;
class Main{
   
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[] = new int[N];
        
        for(int i=0; i<array.length; i++){
            int data = sc.nextInt();
            array[i] = data;
        }
        
        int K = sc.nextInt();
        simpleSearch(K,array);   
    }

    public static void simpleSearch(int K,int[]array){
        for(int i=0; i<array.length; i++){
            if(K == array[i]){
                System.out.println(i);
            }
        }
    }
}