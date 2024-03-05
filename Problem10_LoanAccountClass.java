// How can we access private data from one class to other class? Explain and write down the code for it?
package Problem10;

public class LoanAccount
{
    static float loneBalance = 78403.20f;
    public static void main(String[] args)
    {
        MyCustomerInfo MyCustomerInfo = new MyCustomerInfo();
        MyCustomerInfo.setCustomerId(1010006534);
        MyCustomerInfo.setAccountHolderName("Sunil Kumar");
        MyCustomerInfo.setDateOfBirth("06-12-1994");

        System.out.println("The customer details are as below:");
        System.out.println("CustomerID - "+MyCustomerInfo.getCustomerId());
        System.out.println("Name - "+MyCustomerInfo.getAccountHolderName());
        System.out.println("DOB - "+MyCustomerInfo.getDateOfBirth());
        System.out.println("Loan Balance: "+loneBalance);

    }
}
