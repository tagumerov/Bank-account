package Bank;

public class Card extends Account
{

    @Override
    public void takemoney(double money)
    {
        if(this.money >= (money + (money/100)))
        {
            this.money -= money;
            this.money -= (money/100);
            System.out.println("Комиссия 1% от снятой суммы и составляет " + (money/100) + " рублей");
        }
        else
        {
            System.out.println("Недостаточно средств на счете!");
        }
    }
}
