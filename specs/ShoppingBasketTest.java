import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import shoppingBasket.*;
import shoppingBasket.behaviours.Shoppable;

public class ShoppingBasketTest{

  ShoppingBasket bucket;
  FoodStuffs food;
  ExpensiveFoodStuffs food2;

  @Before
  public void before(){
    bucket = new ShoppingBasket();
    food = new FoodStuffs();
    food2 = new ExpensiveFoodStuffs();
  }

  @Test
  public void canAddItem(){
    bucket.addToBasket(food);
    assertEquals(1, bucket.getBasketSize());
  }

  @Test
  public void canRemoveItem(){
    bucket.addToBasket(food);
    assertEquals(8000823131L, bucket.removeFromBasket(0).getBarcode(), 0.01);
  }
  
  @Test
  public void canEmptyBasket(){
    bucket.addToBasket(food);
    bucket.addToBasket(food2);
    ArrayList<Shoppable> trolleyDump = bucket.emptyBasket();
    assertEquals(trolleyDump.get(1), food2);
  }

}