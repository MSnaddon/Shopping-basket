package shoppingBasket;
import shoppingBasket.behaviours.*;

public class ExpensiveFoodStuffs extends Consumable implements Shoppable{
  
  double barcode;
  int price;
  boolean bogof;

  public ExpensiveFoodStuffs(){
    super("FoodStuffs","Murpheys wine-fed quail-eggs");
    price = 10;
    bogof = false;
    barcode = 9998182771L;
  }

  public int getPrice(){
    return this.price;
  }

  public boolean isBogof(){
    return bogof;
  }

  public double getBarcode(){
    return this.barcode;
  }




}