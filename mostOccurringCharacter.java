

public class mostOccurringCharacter
 {
    public static void main(String[] args) {
      char arr[] ={'t','c','m','m','t','Y','t'};
      int max=0;
      int count=0;
      char ans=0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count>max){
            ans=arr[i];
            max=count;
        }
        count=0;

      }
     System.out.println(ans);
      

       }

    }
  
