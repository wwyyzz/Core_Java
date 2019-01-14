package design.ch2;

//策略模式
public class example2 {
    public static void main(String[] args) {
        CashContext cc = null;

//        String type = "normal";
        String type = "return 100 per 300";
//        String type = "80% discount";

        switch (type)
        {
            case "normal":
                cc = new CashContext(new CashNormal());
                break;
            case "return 100 per 300":
                cc = new CashContext(new CashReturn(300.0, 100.0));
                break;
            case "80% discount":
                cc = new CashContext(new CashRebate(0.8));
                break;
        }


        double totalPrices = 0d;
        double total = 0d;

        double price = 100.0;
        double num = 3.0;

        totalPrices = cc.GetResult(price * num);
        total = total + totalPrices;

        System.out.println("price = " + price + " number = " + num + " totalprice = " + total);
    }
}
