/* How can we access private data from one class to other class? Explain and
write down the code for it?

Ans: We can access private data from one class to other class by using setter and getter methods.
        In the below program we declared private variables in the MyCustomerInfo class and to
        initialize it we defined setter method. we also defined getter method to return the value.

        Now from another calass "LoanAccount" we are setting the values and getting the values easily.
 */
package Problem10;
public class MyCustomerInfo
{
    private String accountHolderName;
    private String dateOfBirth;
    private long customerId;

    public void setAccountHolderName(String name)
    {
        this.accountHolderName = name;
    }
    public void setDateOfBirth(String dob)
    {
       this.dateOfBirth = dob;
    }
    public void setCustomerId(long custId)
    {
       customerId = custId;
    }

    public long getCustomerId() {
        return this.customerId;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
}

