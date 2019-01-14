package design.ch2;

public class CashContext2 {
    CashSuper cs = null;

    public CashContext2(String type) {
        switch (type)
        {
            case "normal":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
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

    }

    public double GetResult(double money)
    {
        return cs.acceptCash(money);
    }
}
