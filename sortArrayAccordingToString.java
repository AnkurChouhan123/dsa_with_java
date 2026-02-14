//public class sortArrayAccordingToString {

//    static void sort(String [] arr){
//        for(int i=0;i<arr.length;i++){
//            int min=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j].length()<arr[min].length()){
//                    min=j;
//                }
//            }
//            swap(arr,i,min);
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        String arr[]={"abc","ab","a","avbf","ab"};
//        sort(arr);
//    }
//   static void swap(String arr[],int i,int j){
//        String temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//}

public static void main(String[] args) {
    String arr[] = {"abc", "ab", "a", "avbf", "ab"};
    mergeSort(arr);
    for(String s:arr){
        System.out.println(s);
    }

}

static void mergeSort(String arr[]) {
    if(arr.length<=1){
            return;
    }
    int mid = arr.length / 2;

    String left[] = Arrays.copyOfRange(arr,0,mid);
    String right[] = Arrays.copyOfRange(arr,mid,arr.length);
    mergeSort(left);
    mergeSort(right);
    merge(left,right,arr);


}

static void merge(String[] a1, String a2[],String res[]) {
   // String res[] = new String[a1.length + a2.length];
    int k = 0;
    int i = 0;
    int j = 0;
    while (i < a1.length && j < a2.length) {
        if (a1[i].length() <= a2[j].length()) {
            res[k++] = a1[i];
            i++;
        } else {
            res[k++] = a2[j];
            j++;
        }
    }
    while (i < a1.length) {
        res[k++] = a1[i];
        i++;
    }
    while (j < a2.length) {
        res[k++] = a2[j];
        j++;
    }
}

static void swap(String arr[], int i, int j) {
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
