package salvatoreasssennato.menupizzeria.Entities;

public class PizzaMargherita {
  protected String str1;
  protected String str2;
  protected int  calories;
  protected double price;

  public PizzaMargherita() {
  }

  public PizzaMargherita(String str1, String str2, int calories, double price) {
    this.str1 = str1;
    this.str2 = str2;
    this.calories = calories;
    this.price = price;
  }

  public String getStr1() {
    return str1;
  }

  public void setStr1(String str1) {
    this.str1 = str1;
  }

  public String getStr2() {
    return str2;
  }

  public void setStr2(String str2) {
    this.str2 = str2;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Pizza{" +
            "str1='" + str1 + '\'' +
            ", str2='" + str2 + '\'' +
            ", calories=" + calories +
            ", price=" + price +
            '}';
  }
}
