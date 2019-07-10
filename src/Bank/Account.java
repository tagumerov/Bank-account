package Bank;

public class Account
{
    private double money;

    public Account()
    {
        this.money = 0.0;
    }

    public double getMoney() {
        return money;
    }
    public void addMoney(double money) {
        this.money += money;
    }
    public void takemoney(double money){
            if(this.money >= money)
            {
                this.money -= money;
            }
            else
            {
                System.out.println("Недостаточно средств на счете!");
            }

    }
}
