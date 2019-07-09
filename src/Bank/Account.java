package Bank;

public class Account
{
    public double money;

        public Account()
    {
        this.money = 0.0;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money += money;
    }
    public void takemoney(double money){
            this.money -= money;
    }
}
