 class ChartBarArray{
 
   
    public static void main(String[] args) {
       int arr[]={3,1,0,7,5};
       //int maxi=7;
       for(int max=7;max>0;max--){
        for(int  j=0;j<arr.length;j++){
            if(arr[j]<max){
                System.out.print("    ");
            }
            else{
                System.out.print("*   ");
            }
        }
        System.out.println("  ");
       }
        
     

}

 }