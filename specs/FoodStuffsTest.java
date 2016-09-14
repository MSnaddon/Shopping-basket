import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import shoppingBasket.*;

public class FoodStuffsTest{

  FoodStuffs food;
  ExpensiveFoodStuffs ooFood;

  @Before
  public void before(){
    food = new FoodStuffs();
    ooFood = new ExpensiveFoodStuffs();
  }

  @Test
  public void foodHasPrice(){
    assertEquals(5, food.getPrice());
  }

  @Test
  public void foodIsBOGOF(){
    assertEquals(true,food.isBogof());
    assertEquals(false,ooFood.isBogof());
  }


// oddely written as I learn assertEquals is deprecated for double type.
//Epsilon version is used to avoid issues with mantissa???
  @Test
  public void foodHasBarcode(){
    double expected = 8000823131L;
    assertEquals(expected, food.getBarcode(), 0.01);
  }

  @Test
  public void foodHasBrand(){
    assertEquals("Terrys food, fae doon the road", food.getBrand());
  }
}