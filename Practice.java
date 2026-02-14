//////import java.util.Scanner;
//////
////
////import java.util.ArrayList;
////
//
//import java.util.ArrayList;
//import java.util.List;
//
////import static Recursion.NQueen.list;
//
/////// /////import java.util.ArrayList;
/////// /////import java.util.Arrays;
/////// /////
/////// ///
/////// ///import java.util.Arrays;
/////// ///
/////// /////////////import java.util.*;
/////// /////////////import java.util.HashMap;
/////// /////////////
/////// /////////////public class Practice {
/////// /////////////     public  static void main(String[] args) {
/////// /////////////
/////// ////////////// /       ArrayList<Integer>list=new ArrayList<>();
/////// ////////////// /
/////// ////////////// /       list.add(10);
/////// ////////////// /       list.add(20);
/////// ////////////// /       list.add(30);
/////// ////////////// /       list.add(20);
/////// ////////////// /        ListIterator<Integer> itr=list.listIterator();
/////// ////////////// /        while(itr.hasNext()){
/////// ////////////// /            int x=itr.next();
/////// ////////////// /            if(x%20==0) {
/////// ////////////// /                itr.remove();
/////// ////////////// /                }
/////// ////////////// /            else{
/////// ////////////// /                System.out.println(x);
/////// ////////////// /            }
/////// ////////////// /
/////// ////////////// /        }
/////// ////////////// /
/////// ////////////// /
/////// ////////////// /    TreeSet<Integer>set=new TreeSet<>();
/////// ////////////// /    //set.add('null');
/////// ////////////// /   // set.add(null);
/////// ////////////// /        System.out.println(set);
/////// ////////////// /
/////// /////////////
/////// ///////////////
/////// ///////////////      System.out.println(Thread.currentThread().getName());
/////// ///////////////      int arr[]={1,1,0,0,1,1,0,0,1};
/////// ///////////////        int arr[]={0,1,0,1};
/////// ///////////////        System.out.println(bulbs(arr));
/////// ///////////////
/////// ///////////////    }
/////// ///////////////    static int bulbs(int []arr){
/////// ///////////////         int n=arr.length;
/////// ///////////////         int minSwitches=n;
/////// ///////////////         int count=0;
/////// ///////////////        for(int i=0;i<n;i++){
/////// ///////////////            if(i==0&&arr[0]==1){
/////// ///////////////                count+=1;
/////// ///////////////                minSwitches-=count;
/////// ///////////////
/////// ///////////////            }
/////// ///////////////            else if(arr[i]==arr[i-1]){
/////// ///////////////                count+=1;
/////// ///////////////            }
/////// ///////////////            else{
/////// ///////////////
/////// ///////////////                minSwitches-=count-1;//minSwithces=minSwitches-count-1;
/////// ///////////////                count=1;
/////// ///////////////
/////// ///////////////            }
/////// ///////////////        }
/////// ///////////////        return minSwitches;
/////// /////////////       // System.out.println(longestKSubstr("aabacbebebe",3));
/////// /////////////
/////// ///////////////
/////// /////////////        PriorityQueue<Integer>q=new PriorityQueue<>();
/////// /////////////        q.add(1);
/////// /////////////        q.add(4);
/////// /////////////
/////// /////////////
/////// ///////////
/////// ///////////////   static int longestKSubstr(String s, int k) {
/////// ///////////////        HashMap<Character,Integer>map=new HashMap<>();
/////// ///////////////        int i=0;
/////// ///////////////        int ans=-1;
/////// ///////////////        for(int j=0;j<s.length();j++){
/////// ///////////////            char ch=s.charAt(j);
/////// ///////////////            if(map.containsKey(ch)){
/////// ///////////////                map.put(ch,map.get(ch)+1);
/////// ///////////////            }
/////// ///////////////            else{
/////// ///////////////                map.put(ch,1);
/////// ///////////////            }
/////// ///////////////            if(map.size()==k){
/////// ///////////////                ans=Math.max(ans,j-i+1);
/////// ///////////////            }
/////// ///////////////
/////// ///////////////            while(map.size()>k){
/////// ///////////////                if(map.get(s.charAt(i))==1){
/////// ///////////////                    map.remove(s.charAt(i));
/////// ///////////////                }
/////// ///////////////                else{
/////// ///////////////                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
/////// ///////////////                }
/////// ///////////////                i++;
/////// ///////////////            }
/////// ///////////////
/////// ///////////////
/////// ///////////////        }
/////// ///////////////        return ans;
/////// ///////////
/////// ///////////
/////// /////////
/////// /////////import java.util.ArrayList;
/////// /////////import java.util.Arrays;
/////// /////////import java.util.List;
/////// /////////
/////// /////////////}
/////// /////////////}
/////// ///////////
/////// ///////////public class Practice {
/////// ///////////
/////// ///////////
/////// ///////////    public static void main(String[] args) {
/////// ///////////        int arr[] = {0, 0, 1};
/////// ///////////        int target = 1;
/////// ///////////
/////// ///////////        System.out.println(perfectSum(arr, target));
/////// ///////////    }
/////// ///////////
/////// ///////////    public static int perfectSum(int[] nums, int target) {
/////// ///////////        return helper(nums, nums.length-1, target);
/////// ///////////    }
/////// ///////////
/////// ///////////    static int helper(int[] nums, int n, int target) {
/////// ///////////
/////// ///////////        if (n == 0) {
/////// ///////////            if (target == 0 && nums[0] == 0) return 2;
/////// ///////////            if (target == 0||target==nums[0]) return 1;
/////// ///////////
/////// ///////////            return 0;
/////// ///////////        }
/////// ///////////
/////// ///////////
/////// ///////////        if (nums[n] <= target) {
/////// ///////////
/////// ///////////            return helper(nums, n - 1, target) + helper(nums, n - 1, target - nums[n]);
/////// ///////////        } else {
/////// ///////////
/////// ///////////            return helper(nums, n - 1, target);
/////// ///////////        }
/////// ///////////    }
/////// ///////////}
/////// /////////
/////// /////////class Practice {
/////// /////////
/////// /////////    public static void main(String[] args) {
/////// /////////        int[] arr={4,6,2,8};
/////// /////////        int n=arr.length;
/////// /////////        int[][] dp=new int[n+1][n+1];
/////// /////////        System.out.println(lis(arr,dp));
/////// /////////        for(int i=0;i<dp.length;i++){
/////// /////////            for(int j=0;j<dp[0].length;j++){
/////// /////////                System.out.print(dp[i][j]+" ");
/////// /////////            }
/////// /////////            System.out.println();
/////// /////////        }
/////// /////////    }
/////// /////////    static int lis(int arr[],int[][]dp) {
/////// /////////        int n=arr.length;
/////// /////////
/////// /////////
/////// /////////        for(int i=n-1;i>=0;i--){
/////// /////////            for(int j=i-1;j>=-1;j--){
/////// /////////                int notPick=dp[i+1][j+1];
/////// /////////                int pick=0;
/////// /////////                if(j==-1||arr[i]>arr[j]){
/////// /////////                    pick=1+dp[i+1][i+1];
/////// /////////                }
/////// /////////                dp[i][j+1] = Math.max(pick,notPick);
/////// /////////            }
/////// /////////        }
/////// /////////
/////// /////////
/////// /////////
/////// /////////        return dp[0][0];
/////// /////////
/////// /////////
/////// /////////
/////// /////////    }
/////// /////////
/////// /////////
/////// /////////    public class Main {
/////// /////////        public static void main(String[] args) {
/////// /////////            int[] arr = {4, 6, 2, 8};
/////// /////////            int n = arr.length;
/////// /////////            int[][] dp = new int[n + 1][n+1];
/////// /////////
/////// /////////            lis(arr, dp);
/////// /////////
/////// /////////            System.out.println("Length of LIS: " + dp[0][0]);
/////// /////////            System.out.print("LIS sequence: ");
/////// /////////            printLIS(arr, dp);
/////// /////////        }
/////// /////////
/////// /////////        static int lis(int[] arr, int[][] dp) {
/////// /////////            int n = arr.length;
/////// /////////            for (int i = n - 1; i >= 0; i--) {
/////// /////////                for (int j = i - 1; j >= -1; j--) {
/////// /////////                    int notPick = dp[i + 1][j+1];
/////// /////////                    int pick = 0;
/////// /////////                    if (j == -1 || arr[i] > arr[j]) {
/////// /////////                        pick = 1 + dp[i + 1][i+1];
/////// /////////                    }
/////// /////////                    dp[i][j+1] = Math.max(pick, notPick);
/////// /////////                }
/////// /////////            }
/////// /////////            return dp[0][0];
/////// /////////        }
/////// /////////
/////// /////////        static void printLIS(int[] arr, int[][] dp) {
/////// /////////            int n = arr.length;
/////// /////////            int i = 0, j = -1;
/////// /////////            List<Integer> res = new ArrayList<>();
/////// /////////
/////// /////////            while (i < n) {
/////// /////////                int notPick = dp[i + 1][j+1];
/////// /////////                int pick = 0;
/////// /////////                if (j == -1 || arr[i] > arr[j]) {
/////// /////////                    pick = 1 + dp[i + 1][i+1];
/////// /////////                }
/////// /////////                if (pick >= notPick) {
/////// /////////                    res.add(arr[i]);
/////// /////////                    j = i;
/////// /////////                }
/////// /////////                i++;
/////// /////////                if (dp[i][j+1] == 0) break;
/////// /////////            }
/////// /////////
/////// /////////            System.out.println(res);
/////// /////////        }
/////// /////////    }
/////// /////////
/////// /////////
/////// /////////}
/////// ///////
/////// ///////import java.util.*;
/////// ///////
/////// ///////public class Practice{
/////// ///////    public static void main(String[] args) {
/////// ///////        int[] arr = {4, 6, 2, 8};
/////// ///////        int n = arr.length;
/////// ///////        int[][] dp = new int[n + 1][n+1];
/////// ///////
/////// ///////        lis(arr, dp);
/////// ///////
/////// ///////        System.out.println("Length of LIS: " + dp[0][0]);
/////// ///////        System.out.print("LIS sequence: ");
/////// ///////        printLIS(arr, dp);
/////// ///////    }
/////// ///////
/////// ///////    static int lis(int[] arr, int[][] dp) {
/////// ///////        int n = arr.length;
/////// ///////        for (int i = n - 1; i >= 0; i--) {
/////// ///////            for (int j = i - 1; j >= -1; j--) {
/////// ///////                int notPick = dp[i + 1][j+1];
/////// ///////                int pick = 0;
/////// ///////                if (j == -1 || arr[i] > arr[j]) {
/////// ///////                    pick = 1 + dp[i + 1][i+1];
/////// ///////                }
/////// ///////                dp[i][j+1] = Math.max(pick, notPick);
/////// ///////            }
/////// ///////        }
/////// ///////        return dp[0][0];
/////// ///////    }
/////// ///////
/////// ///////    static void printLIS(int[] arr, int[][] dp) {
/////// ///////        int n = arr.length;
/////// ///////        int i = 0, j = -1;
/////// ///////        List<Integer> res = new ArrayList<>();
/////// ///////
/////// ///////        while (i < n) {
/////// ///////            int notPick = dp[i + 1][j+1];
/////// ///////            int pick = 0;
/////// ///////            if (j == -1 || arr[i] > arr[j]) {
/////// ///////                pick = 1 + dp[i + 1][i+1];
/////// ///////            }
/////// ///////            if (pick >= notPick) {
/////// ///////                res.add(arr[i]);
/////// ///////                j = i;
/////// ///////            }
/////// ///////            i++;
/////// ///////            if (dp[i][j+1] == 0) break;
/////// ///////        }
/////// ///////
/////// ///////       System.out.println(res);
/////// ///////    }
/////// ///////}
/////// ///////
/////// /////class Practice {
/////// /////    public ArrayList<Integer> largestSubset(int[] arr) {
/////// /////        Arrays.sort(arr);
/////// /////        int n=arr.length;
/////// /////        ArrayList<Integer>list=new ArrayList<>();
/////// /////        int dp[][]=new int[n+1][n+1];
/////// /////        LDS(arr,dp);
/////// /////
/////// /////        int i=0;
/////// /////        int j=-1;
/////// /////
/////// /////        while(i<n){
/////// /////            int notPick=dp[i+1][j+1];
/////// /////            int pick=0;
/////// /////
/////// /////            if(j==-1||arr[i]%arr[j]==0){
/////// /////                pick=1+dp[i+1][i+1];
/////// /////            }
/////// /////
/////// /////            if(pick>notPick){
/////// /////                list.add(arr[i]);
/////// /////                j=i;
/////// /////            }
/////// /////            else if(pick==notPick){
/////// /////                // if(arr[i]>arr[j]) list.add(arr[i]);
/////// /////                if(arr[j+1]>arr[i]) list.add(arr[j+1]);
/////// /////            }
/////// /////            i++;
/////// /////
/////// /////            if(dp[i][j+1]==0) break;
/////// /////        }
/////// /////
/////// /////        return list;
/////// /////
/////// /////    }
/////// /////
/////// /////    static int LDS(int[] arr,int[][] dp){
/////// /////        int n=arr.length;
/////// /////
/////// /////
/////// /////        for(int i=n-1;i>=0;i--){
/////// /////            for(int j=i-1;j>=-1;j--){
/////// /////                int notPick=dp[i+1][j+1];
/////// /////                int pick=0;
/////// /////
/////// /////                if(j==-1||arr[i]%arr[j]==0){
/////// /////                    pick=1+dp[i+1][i+1];
/////// /////                }
/////// /////
/////// /////                dp[i][j+1]=Math.max(pick,notPick);
/////// /////            }
/////// /////        }
/////// /////        return dp[0][0];
/////// /////    }
/////// /////
/////// /////    public static void main(String[] args) {
/////// /////        int arr[]={1,2,3,6};
/////// /////        Arrays.sort(arr);
/////// /////        int n=arr.length;
/////// /////        int[][] dp=new int[n+1][n+1];
/////// /////        LDS(arr,dp);
/////// /////
/////// /////        for(int i=0;i<dp.length;i++){
/////// /////            for(int j=0;j<dp[0].length;j++){
/////// /////                System.out.print(dp[i][j]+" ");
/////// /////            }
/////// /////            System.out.println();
/////// /////        }
/////// /////    }
/////// /////}
/////// ///
/////// ///class Practice{
/////// ///    public static void main(String[] args) {
/////// ///        int[][] arr={
/////// ///                {5,6,31},
/////// ///                {5,8,81},
/////// ///                {6,13,11},
/////// ///                {0,5,75},
/////// ///                {9,12,19}
/////// ///        };
/////// ///        Arrays.sort(arr,(a,b)->a[0]-b[0]);
/////// ///        for(int i=0;i<arr.length;i++){
/////// ///            for(int j=0;j<arr[0].length;j++){
/////// ///                System.out.print(arr[i][j]+" ");
/////// ///            }
/////// ///            System.out.println();
/////// ///        }
/////// ///    }
/////// ///}
/////// /
/////// /
/////// /
/////// /    class Practice {
/////// /
/////// /    public static void main(String[] args) {
/////// /        int[] arr={3,-4,-2};
/////// /        System.out.println(longestSubarray(arr));
/////// /    }
/////// /      static  public int longestSubarray(int[] nums) {
/////// /            int n=nums.length;
/////// /            int max=0;
/////// /            boolean isReplaced=false;
/////// /            int count=1;
/////// /            for(int i=1;i<n;i++){
/////// /                if(nums[i]<nums[i-1]&&isReplaced==false){
/////// /                    isReplaced=true;
/////// /                    nums[i]=nums[i-1];
/////// /                    count++;
/////// /                }
/////// /                else if(nums[i]<nums[i-1]&&isReplaced==true){
/////// /                    max=Math.max(max,count);
/////// /                    count=1;
/////// /                    isReplaced=false;
/////// /                }
/////// /                else{
/////// /                    count++;
/////// /                }
/////// /            }
/////// /            max=Math.max(max,count);
/////// /            int increaseMax=max;
/////// /            max=0;
/////// /            isReplaced=false;
/////// /            count=1;
/////// /
/////// /            for(int i=n-2;i>=0;i--){
/////// /                if(nums[i]>nums[i+1]&&isReplaced==false){
/////// /                    isReplaced=true;
/////// /                    nums[i]=nums[i+1];
/////// /                    count++;
/////// /                }
/////// /                else if(nums[i]>nums[i+1]&&isReplaced==true){
/////// /                    max=Math.max(max,count);
/////// /                    count=1;
/////// /                    isReplaced=false;
/////// /                }
/////// /                else{
/////// /                    count++;
/////// /                }
/////// /            }
/////// /
/////// /            max=Math.max(max,count);
/////// /            int decreaseMax=Math.max(max,count);
/////// /
/////// /          System.out.println(max);
/////// /          System.out.println(decreaseMax);
/////// /
/////// /            max= Math.max(increaseMax,decreaseMax);
/////// /
/////// /            return max;
/////// /        }
/////// /    }
//////
//////class Practice{
//////    public static void main(String[] args) {
//////        Scanner sc=new Scanner(System.in);
//////        System.out.println("For player 1-");
//////        System.out.println("type 1 for rock\n type 2 for paper \n type 3 for scissor");
//////        int a=sc.nextInt();
//////        System.out.println("For player 2-");
//////        System.out.println("type 1 for rock\n type 2 for paper \n type 3 for scissor");
//////        int b=sc.nextInt();
//////
//////        // rock
//////        if(a==1){
//////            if(b==2){
//////                System.out.println("player 2 win");
//////            }
//////            else if(b==3){
//////                System.out.println("player 1 win");
//////            }
//////            else {
//////                System.out.println("Draw");
//////            }
//////        }
//////
//////        //paper
//////        else if(a==2){
//////            if(b==1){
//////                System.out.println("player 1 win");
//////            }
//////            else if(b==3){
//////                System.out.println("player 2 win");
//////            }
//////            else {
//////                System.out.println("Draw");
//////            }
//////        }
//////
//////        //scissor
//////        else{
//////            if(b==1){
//////                System.out.println("player 2 win");
//////            }
//////            else if(b==3){
//////                System.out.println("player draw win");
//////            }
//////            else {
//////                System.out.println("player 1 win");
//////            }
//////        }
//////
//////    }
//////}
////
//class Practice {
//
//    static List<Integer>parent;
//
//    public static void main(String[] args) {
////        String[] grid={"@.a..","###.#","b.A.B"};
////
////        System.out.println(shortestPathAllKeys(grid));
//

import java.util.ArrayList;
import java.util.PriorityQueue;

////        System.out.println((char)('M'+32));
//
//        parent=new ArrayList<>();
//        parent.add(1);
//        parent.add(1);
//        parent.add(2);
//        parent.add(3);
//        parent.add(4);
//        parent.add(5);
//        parent.add(6);
//
//       int val= findParent(6);
//        System.out.println(val+"////");
//        System.out.println(parent);
//
//
//
//    }
//
//
//
//    static public int findParent(int node){
//        if(node==parent.get(node)){
//            return node;
//        }
//        int ulp=findParent(parent.get(node));
//
//        parent.set(node,ulp);
//        return parent.get(node);
//    }
//
//    static private int shortestPathAllKeys(String[] grid) {
//
//        int m=grid.length;
//        int n=grid[0].length();
//
//        char[][] adj=new char[m][n];
//
//        for(int i=0;i<m;i++){
//            String s=grid[i];
//            for(int j=0;j<n;j++){
//                char ch=s.charAt(j);
//                adj[i][j]=ch;
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(adj[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        return 0;
//
//    }
//}

class Practice{
    public static void main(String[] args) {
        PriorityQueue<String>q=new PriorityQueue<>((a,b)->a.compareTo(b));

        q.add("bac");
        q.add("aac");
        q.add("bbc");

        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }
}
