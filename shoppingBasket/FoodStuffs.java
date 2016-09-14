package shoppingBasket;
import shoppingBasket.behaviours.*;

public class FoodStuffs extends Consumable implements Shoppable{
  
  double barcode;
  int price;
  boolean bogof;

  public FoodStuffs(){
    super("FoodStuffs", "Terrys food, fae doon the road");
    price = 5;
    bogof = true;
    barcode = 8000823131L;
  }

  public int getPrice(){
    return this.price;
  }
  public boolean isBogof(){
    return bogof;
  }

  public double getBarcode(){
    return barcode;
  }
}