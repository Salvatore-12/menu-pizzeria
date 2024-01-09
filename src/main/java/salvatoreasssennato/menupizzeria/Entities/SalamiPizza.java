package salvatoreasssennato.menupizzeria.Entities;

public class SalamiPizza extends PizzaMargherita{
    protected String salami;

    public SalamiPizza() {
    }

    public SalamiPizza(String str1, String str2, int calories, double price, String salami) {
        super(str1, str2, calories, price);
        this.salami = salami;
    }

    public String getSalami() {
        return salami;
    }

    public void setSalami(String salami) {
        this.salami = salami;
    }

    @Override
    public String toString() {
        return "SalamiPizza{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                "salami='" + salami + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} ";
    }
}
