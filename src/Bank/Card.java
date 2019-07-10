package Bank;

public class Card extends Account
{
    @Override
    public void takemoney(double money)
    {
        if(getMoney() >= (money + (money/100)))
        {
            addMoney(-(money + (money/100)));
            System.out.println("Комиссия 1% от снятой суммы и составляет " + (money/100) + " рублей");
        }
        else
        {
            System.out.println("Недостаточно средств на счете!");
        }
    }
}
