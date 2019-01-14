package design.ch2;

//工厂模式 + 策略模式
public class example3 {
    public static void main(String[] args) {

//        CashContext2 csuper = new CashContext2("normal");
//        CashContext2 csuper = new CashContext2("return 100 per 300");
        CashContext2 csuper = new CashContext2("80% discount");

        double totalPrices = 0d;
        double total = 0d;

        double price = 100.0;
        double num = 3.0;

        totalPrices =csuper.GetResult(price * num);
        total = total + totalPrices;

        System.out.println("price = " + price + " number = " + num + " totalprice = " + total);
    }
}
