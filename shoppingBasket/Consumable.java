package shoppingBasket;

public abstract class Consumable {

  protected String name;
  protected String brand;

  public Consumable(String name, String brand){
    this.name = name;
    this.brand = brand;
  }

  public String getName(){
    return this.name;
  }

  //Brands could be abstracted to be seperate class with details
  public String getBrand(){
    return this.brand;
  }
}