import java.util.ArrayList;

public class Ficha {

    private int num1;
    private int num2;

    public Ficha(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public String toString()
    {
        return "[" + num1 + "|" + num2 + "]";
    }

    public Ficha ordenarFicha(Ficha ultFicha)
    {
        //System.out.println(ultFicha.getNum1());
        //System.out.println(ultFicha.getNum2());
        int ord = ultFicha.getNum1();
        ultFicha.setNum1(ultFicha.getNum2());
        ultFicha.setNum2(ord);
        return ultFicha;
    }


}



