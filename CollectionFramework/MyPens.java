package CollectionFramework;

public class MyPens {
    String pen;
    int price;
    String color;
    MyPens(String pen,String color,int price){
        this.pen=pen;
        this.price=price;
        this.color=color;
    }

    String getPen(){
        return pen;
    }
    String getColor(){
        return color;
    }
    int getPrice(){
        return price;
    }

  public String toString(){

        return "pen : "+pen+" color : "+color+" price : "+price +"\n";

    }

    public static void main(String[] args) {

    }
}
