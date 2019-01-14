package design.ch2;

//通过简单工厂获取对象
public class example1 {
    public static void main(String[] args) {
//        CashSuper csuper = CashFactory.createCashAccept("normal");
        CashSuper csuper = CashFactory.createCashAccept("return 100 per 300");
//        CashSuper csuper = CashFactory.createCashAccept("80% discount");
        double totalPrices = 0d;
        double total = 0d;

        double price = 100.0;
        double num = 3.0;

        totalPrices = csuper.acceptCash(price * num);
        total = total + totalPrices;

        System.out.println("price = " + price + " number = " + num + " totalprice = " + total);
    }
}
