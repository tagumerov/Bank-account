import Bank.Card;
import Bank.Deposit;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Список поддерживаемых команд:");
        System.out.println("DEPNEW                      - создать депозит;");
        System.out.println("DEPADD                      - положить на депозит;");
        System.out.println("DEPTAKE                     - снять с депозита;");
        System.out.println("DEPLIST                     - посмотреть счет депозита;");
        System.out.println("");
        System.out.println("CARDNEW                      - создать счет на карте;");
        System.out.println("CARDADD                      - положить на депозит;");
        System.out.println("CARDTAKE                     - снять с депозита;");
        System.out.println("CARDLIST                     - посмотреть счет депозита;");

        Deposit deposit = null;
        Card card = null;
        Scanner in = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Введите команду!");
            String input = in.nextLine();

            if (input.equals("DEPNEW"))
            {
                deposit = new Deposit();
            }
            if (input.equals("DEPLIST"))
            {
                System.out.println("На счету " + deposit.getMoney() + " руб");
            }
            if (input.equals("DEPADD"))
            {
                System.out.println("сколько денег положить на депозит?");
                double money = Double.parseDouble(in.nextLine());
                deposit.addMoney(money);
                System.out.println("денеги успешно переведены на депозит!");
                System.out.println("На счету " + deposit.getMoney() + " руб");
            }
            if (input.equals("DEPTAKE"))
            {
                System.out.println("сколько денег снять с депозита?");
                double money = Double.parseDouble(in.nextLine());
                deposit.takemoney(money);
                //System.out.println("денеги успешно переведены на депозит!");
                System.out.println("На счету " + deposit.getMoney() + " руб");
            }

            if (input.equals("CARDADD"))
            {
                System.out.println("сколько денег положить на карту?");
                double money = Double.parseDouble(in.nextLine());
                card.addMoney(money);
                System.out.println("денеги успешно переведены на карту!");
                System.out.println("На счету " + card.getMoney() + " руб");
            }

            if (input.equals("CARDTAKE"))
            {
                System.out.println("сколько денег снять с карты?");
                double money = Double.parseDouble(in.nextLine());
                card.takemoney(money);
                System.out.println("На счету " + card.getMoney() + " руб");
            }
            if (input.equals("CARDNEW"))
            {
                card = new Card();
            }
            if (input.equals("CARDLIST"))
            {
                System.out.println("На счету " + card.getMoney()+ "руб");
            }
        }
    }
}
