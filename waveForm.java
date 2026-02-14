class waveForm{

   
    public static void main(String[]args){
        int arr[][]={
            {3,6,4,2},
            {7,8,11,5},
            {9,3,2,1},
            {17,8,5,9}
        };

        for(int i=0;i<arr.length;i++){
            if(i%2==0){

                for(int j=0;j<arr[0].length;j++){
                        System.out.print(arr[j][i]);
                }
                System.out.println("");
            }
            else{
                for(int k=arr[0].length-1;k>=0;k--){
                    System.out.print(arr[k][i]);
                }
                System.out.println("");
            }
        }
    }
}