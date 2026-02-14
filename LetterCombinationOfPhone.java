import java.util.ArrayList;

public class LetterCombinationOfPhone {
    static String[]arr;
    static ArrayList<String>list;
    public static void main(String[] args) {
       int[] nums={8,8,1};
       list=new ArrayList<>();
        possibleWords(nums);
        System.out.println(list);
    }
  static public ArrayList<String> possibleWords(int[] nums) {
        arr=new String[10];
        arr[1]="";
        arr[2]="abc";
        arr[3]="def";
        arr[4]="ghi";
        arr[5]="jkl";
        arr[6]="mno";
        arr[7]="pqrs";
        arr[8]="tuv";
        arr[9]="wxyz";

        helper(nums,0,"");
        return list;
    }
   static void helper(int[]nums, int idx, String s){

        if(idx==nums.length){
            list.add(s);
            return;
        }
        for(int i=0;i<arr[nums[idx]].length();i++){
             helper(nums,idx+1,s+arr[nums[idx]].charAt(i));
        }


    }
}
