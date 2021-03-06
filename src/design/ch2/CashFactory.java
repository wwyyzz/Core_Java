package design.ch2;

public class CashFactory {
    public static CashSuper createCashAccept(String type)
    {
        CashSuper cs = null;

        switch (type)
        {
            case "normal":
                cs = new CashNormal();
                break;
            case "return 100 per 300":
                CashReturn cr1 = new CashReturn(300.0, 100.0);
                cs = cr1;
                break;
            case "80% discount":
                CashRebate cr2 = new CashRebate(0.8);
                cs = cr2;
                break;
        }

        return cs;
    }
}
