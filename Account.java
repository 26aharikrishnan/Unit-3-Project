import java.lang.Math.*;
//Class Declaration
public class Account{
    

    private String accountHolder;
    private double moneyValue;
    

  private String encode (String userName) {
    return userName.subString(userName.length()/2) + userName.subString(0, userName.length()/2);
    
  }

  public Boolean aunthenticate (String name) {
      return accountHolder.equals(encode(name));
  }
  //Constructor
    public Account(double money, String account){
        accountHolder = encode(account);
        moneyValue = money;
    }

    public Account(String account){
        moneyValue = randomMoney();
        accountHolder = encode(account);
    }
//random money value
    private double randomMoney()
    {
        moneyValue = (Math.random() *10000);
        return moneyValue;
    }
    //adds money to balance (method)
    public double addMoney(double addedMoney)
    {
        if(addedMoney<0){
          System.out.println("You cannot add a negative amount.");
          return moneyValue;
        }
        moneyValue += addedMoney;
        return moneyValue;
    }
//subtract money to balance (method)
    public double subtractMoney(double subtractedMoney)
    {
      if(subtractedMoney<0) {
        System.out.println("Error. You cannot withdraw a negative amount.");
        return moneyValue;
      }
      if(subtractedMoney>moneyValue){
        System.out.println("Error. You cannot withdraw a value greater than your account balance.");
        return moneyValue;
      }
       moneyValue -= subtractedMoney;
      return moneyValue;

    }

    public double checkBalance(){
      return moneyValue;
    }

    public String toString()
    {
        return "Money: $" +(Math.round(moneyValue*100.0)/100.0)+ " Account Holder: " +accountHolder;
    }

    
    

}