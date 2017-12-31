//parent class accounts
//gives subclasses account ID
public abstract class Account {
    int accountId;
    
//constructor
    Account(int accountId){
        this.accountId = accountId;
    }
    
    //getter
    int getAccountId(){
        return accountId;
    }
    
    //setter
    void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    //computeSalesMethod
    public abstract double computeSales();
    
    //toString
    @Override
    public String toString(){
        String a = ("Total sales by " + accountId + "is : $" +computeSales());
        return a;
        }
}
