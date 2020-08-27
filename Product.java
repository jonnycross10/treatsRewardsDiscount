import java.text.DecimalFormat;
public class Product{
  String name;
  double price;

  private static DecimalFormat df = new DecimalFormat("0.00");

  public Product(String name, double price) {
  this.name = name;
  this.price = price;

}

public String getName(){
  return name;
}

public double getPrice(){
  return price;
}

public void changePrice(double newP){
  price = newP;
  
}

@Override
public String toString(){
  return("The price of " + this.getName() + " is " + this.getPrice());
}
}