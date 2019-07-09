package Bank;

import java.util.Date;

public class Deposit extends Account
{

    private Date depositDate = null;
    private Date currentDate = null;

    public void setMoney(double money)
    {
        this.money += money;
        depositDate = new Date();
    }

    public void takemoney(double money)
    {
        currentDate = new Date();
        long difference = currentDate.getTime() - depositDate.getTime();
        int days = (int)(difference / (24 * 60 * 60 * 1000));
        if(days >= 30)
        {
            this.money -= money;
            System.out.println("С депозита снято " + money + " рублей");
        }
        else {
            System.out.println("Прошло менее 30 дней" + "(" + days + " дней)" + "с даты последнего начисления на счет");
        }
    }
}
