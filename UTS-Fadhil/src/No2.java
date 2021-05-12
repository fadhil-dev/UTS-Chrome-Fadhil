class No2{
    public static void main (String[]args){
      int data[] = {2,3,1,5,4};
      insertionSort(data);
      for(int i : data){
          System.out.print(i+" ");
      }
    }
 
    public static void insertionSort(int[]array){
        for(int i=0; i<array.length; i++){
            for(int j=i; j>0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}