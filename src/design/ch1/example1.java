package design.ch1;

public class example1 {
    public static void main(String[] args) {

        //直接new 对象
//        Operation result = new OperationAdd();
//        Operation result = new OperationSub();
//        Operation result = new OperationMul();
//        Operation result = new OperationDiv();

        //通过简单工厂获取对象
        Operation oper1, oper2, oper3, oper4;
        oper1 = OperationFactory.createOperate("+");
        oper2 = OperationFactory.createOperate("-");
        oper3 = OperationFactory.createOperate("*");
        oper4 = OperationFactory.createOperate("/");

        oper1.set_numberA(2.0);
        oper1.set_numberB(3.0);
        System.out.println(oper1.GetResult());

        oper2.set_numberA(2.0);
        oper2.set_numberB(3.0);
        System.out.println(oper2.GetResult());

        oper3.set_numberA(2.0);
        oper3.set_numberB(3.0);
        System.out.println(oper3.GetResult());

        oper4.set_numberA(2.0);
        oper4.set_numberB(3.0);
        System.out.println(oper4.GetResult());


    }
}

class Operation
{
    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public double GetResult() {
        double result = 0;
        return result;
    }
}

class OperationAdd extends Operation
{
    @Override
    public double GetResult() {
        double result = 0;
        result = this.get_numberA() + this.get_numberB();
        return result;
    }
}

class OperationSub extends Operation
{
    @Override
    public double GetResult() {
        double result = 0;
        result = this.get_numberA() - this.get_numberB();
        return result;
    }
}

class OperationMul extends Operation
{
    @Override
    public double GetResult() {
        double result = 0;
        result = this.get_numberA() * this.get_numberB();
        return result;
    }
}

class OperationDiv extends Operation
{
    @Override
    public double GetResult() {
        double result = 0;
        result = this.get_numberA() / this.get_numberB();
        return result;
    }
}
