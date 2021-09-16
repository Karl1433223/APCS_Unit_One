public class TotalWithTax {

    public static void main(String[] args)
    {
        //Declare the variables and the constant.
        double price;
        double TaxRate;
        double Total;
        double SalesTax;
        //Make the calculations and assign
       TaxRate=0.0825;
       price=52.75;
       Total=TaxRate*price+price;
       SalesTax= price*TaxRate;
       System.out.println("Price: $"+price);
       System.out.println("Sales Tax"+":"+" $"+SalesTax);
       System.out.println("Total"+":" +" $"+Total);




        //the results to the appropriate variables.
        //Print the results.
    }
}
