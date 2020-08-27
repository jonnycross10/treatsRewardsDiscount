import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {

  public static void Start(){
    List<Product> product = new ArrayList<Product>();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter in how many products you have: ");
    String newNum = in.nextLine();
    int pNum = Integer.parseInt(newNum);
    double totalPrice = 0;
    for(int i = 0; i<pNum;i++){
      System.out.println("Enter in the name of the Product: ");
      String pName = in.nextLine();
      System.out.println("Enter in the price: ");
      String pPrice = in.nextLine();
      double Price = Double.parseDouble(pPrice);
      Product p = new Product(pName,Price);
      product.add(p);
      totalPrice = totalPrice + Price;
    }
    for(int i = 0; i<pNum;i++){
      double price = product.get(i).getPrice();
      double perc = price/totalPrice;
      double sub = perc*2.5;
      double newPrice = price - sub;
      product.get(i).changePrice(newPrice);
    }
    for (int i =0; i<pNum;i++){
      System.out.println(product.get(i));
    }
    

    //what percentage of the whole is the product? subtract that percentage of 2.50 from the product
    
    //Price/ total= perc; perc*2.5= sub; Price= Price - sub
  }
 //product.get(i).changePrice(2.5);
  public static void main(String[] args) {
    Start();
  }
}