import java.util.*;

public class subsequence {

    public static void main(String[] args) {
      int arr[]={1,2,3,3};
        System.out.println(subseq(arr));
    }

//    static ArrayList<String> subseq(String p,String up){
//
//        if(up.isEmpty()){
//           ArrayList<String>list=new ArrayList<>();
//           list.add(p);
//           return list;
//        }
//        char ch=up.charAt(0);
//
//         ArrayList <String> left=subseq(p+ch,up.substring(1));
//         ArrayList<String>right=subseq(p,up.substring(1));
//         ArrayList<String>ascii=subseq(p+(ch+0),up.substring(1));
//       left.addAll(right);
//       left.addAll(ascii);
//       return left;
//    }

    static List<List<Integer>> subseq(int [] arr){

        Arrays.sort(arr);

        List<List<Integer>>outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            start=0;


              if(i>0&&(arr[i]==arr[i-1])){
                  start=end+1;
              }
              end=outer.size()-1;
            int n=outer.size();
                for (int j = start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                }
            }


  return outer;
    }
}
