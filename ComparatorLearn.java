import java.util.ArrayList;
import java.util.Comparator;

class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String toString(){
       return name+" "+id;
    }
}

class MyComparator implements Comparator<Student> {
        public int compare(Student o1,Student o2){

            return o2.name.length()-o1.name.length();
        }

}
public class ComparatorLearn  {
    public static void main(String[] args){
        ArrayList<Student>list1=new ArrayList<>();
        list1.add(new Student("ankur",101));
        list1.add(new Student("chouhan",103));
        list1.add(new Student("ok",102));

        list1.sort(new MyComparator());
        for(Student x : list1){
            System.out.println(x);
        }
    }
}
