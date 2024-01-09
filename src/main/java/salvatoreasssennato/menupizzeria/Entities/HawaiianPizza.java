package salvatoreasssennato.menupizzeria.Entities;

public class HawaiianPizza extends PizzaMargherita{
   protected String ham;
   protected String pineapple;

    public HawaiianPizza(String str1, String str2, int calories, double price, String ham, String pineapple){
        super(str1, str2, calories, price);
        this.ham = ham;
        this.pineapple = pineapple;
    }

    public HawaiianPizza() {
    }

    public String getHam() {
        return ham;
    }

    public void setHam(String ham) {
        this.ham = ham;
    }

    public String getPineapple() {
        return pineapple;
    }

    public void setPineapple(String pineapple) {
        this.pineapple = pineapple;
    }

    @Override
    public String toString() {
        return "HawaiianPizza{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                "ham='" + ham + '\'' +
                ", pineapple='" + pineapple + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} " ;
    }
}
