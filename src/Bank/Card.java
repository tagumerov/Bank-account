package Bank;

public class Card extends Account
{

    public void takemoney(double money){
        this.money -= money;
        this.money -= (money/100);
        System.out.println("Комиссия 1% от снятой суммы и составляет " + (money/100) + " рублей");
    }
}
