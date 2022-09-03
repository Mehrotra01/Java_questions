class solution{
  public static void main(String []args){
    int[] arr = {8,7,6,1,2,3,4};
    System.out.println(getPivot(arr)):
  }
  public static int getPivot(int[] arr){
      int start=o,end=arr.length-1;
      int mid = start+(end-start)/2;
      while(start<end){
        if(arr[mid]>=arr[0]){
          start=mid+1;
        }else{
          end =mid; 
         }
      }
      return start;
  }
}
