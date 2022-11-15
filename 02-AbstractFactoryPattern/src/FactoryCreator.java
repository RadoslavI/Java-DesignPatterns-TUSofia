public class FactoryCreator
{
    public static AbstractFactory getFactory(String choise)
    {
        if (choise.equalsIgnoreCase("Bank"))
        {
            return new BankFactory();
        }
        else if (choise.equalsIgnoreCase("Loan"))
        {
            return new LoanFactory();
        }
        return null;
    }
}
