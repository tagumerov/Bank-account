package Bank;

import java.util.Date;

public class Deposit extends Account
{

    private Date depositDate = null;
    private Date currentDate = null;

    @Override
    public void addMoney(double money)
    {
        super.addMoney(money);
        depositDate = new Date();
    }

    @Override
    public void takemoney(double money)
    {
        currentDate = new Date();
        long difference = currentDate.getTime() - depositDate.getTime();
        int days = (int)(difference / (24 * 60 * 60 * 1000));
        if(days >= 30)
        {
            if(this.money >= money)
            {
                this.money -= money;
                System.out.println("С депозита снято " + money + " рублей");
            }
            else
            {
                System.out.println("Недостаточно средств на счете!");
            }
        }
        else {
            System.out.println("Прошло менее 30 дней" + "(" + days + " дней)" + "с даты последнего начисления на счет");
        }
    }
}
