//child class, of accounts
//calculates price for services rendered.
class Service extends Account {
    int hours;
    double rate ;

    //constructor
    public Service(int accountId, int hours, double rate) {
        super(accountId);
        this.hours = hours;
        this.rate = rate;
       
    }
    
     //getter
    public int gethours(){
        return hours;
    }
    
    //setter
    
    void setHours(int hours){
        this.hours = hours;
    }
    
    //getter for rate
    public double getRate(){
        return rate;
    }
    
    //setter for rate
    void setRate(double rate) {
        this.rate = rate;
    }
    
    
    //Override toString()
    @Override
    public String toString(){
        String x = "Account: " + accountId + "has put in a total of " + hours + " hours at" + rate;
        return x;
    }
    
    //ovverride calculate total
    @Override
    public double computeSales(){
        return hours * rate;
        }
}
