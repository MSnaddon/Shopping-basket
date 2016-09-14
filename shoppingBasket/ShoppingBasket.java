package shoppingBasket;

import java.util.*;
import shoppingBasket.behaviours.*;

public class ShoppingBasket{

  ArrayList<Shoppable> contents;

  public ShoppingBasket(){
    contents = new ArrayList<Shoppable>();
  }

  public void addToBasket(Shoppable item){
    contents.add(item);
  }

  public int getBasketSize(){
    return contents.size();
  }

  public Shoppable removeFromBasket(int id){
    return contents.remove(id);
  }

  public ArrayList<Shoppable> emptyBasket(){
    return new ArrayList<Shoppable>(this.contents);
  }
}