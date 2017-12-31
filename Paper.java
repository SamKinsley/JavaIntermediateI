//child class of accounts
//gices price for paper per total pound
class Paper extends Account {
  int pounds;

 double pricePounds;
   
//constructor
    public Paper(int accountId, int pounds, double pricePounds) {
        super(accountId);
        this.pounds = pounds;
        this.pricePounds = pricePounds;
    }
   
   //getter
    public int getPounds(){
        return pounds;
    }
    
    //setter
    void setPounds(int Pounds){
        this.pounds = pounds;
    }
    //getter
    public double getPricePounds(){
        return pricePounds;
    }
    
    //setter
    void setPricePounds(double pricePounds) {
        this.pricePounds = pricePounds;
    }
    
    //override tostirng,
    
    @Override
    public String toString(){
        
        String t = "Account" + accountId + "has sold a total of: " + pounds + "of paper, at: " + pricePounds + "per Pound";
        return t;
    }
    
    //Ovverride method to compute total sales of lbs and pricepounds
    @Override
    public double computeSales(){
        return pounds*pricePounds;
        }
}
