package designpatters1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill
{
    public static void main(String[] args) throws IOException
    {
        var planFactory = new GetPlanFactory();

        System.out.println("Enter the name of the plan of which bill you want generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        System.out.print("Enter the number of units for bill that will be calculated: ");

        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.print("Bill ammount for " + planName + " of " + units + "units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
