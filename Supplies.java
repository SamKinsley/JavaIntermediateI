//Child class of Acounts
//Calculates supplies left after sales.
class Supplies extends Account {
    double office;
    double books;
    double apperal;

    //constructor
    public Supplies(int accountId, double office, double books, double apperal) {
        super(accountId);
        this.office = office;
        this.books = books;
        this.apperal = apperal;
    }
    
    //getter
    public double getOffice(){
        return office;
    }
    
    //setter
    void setOffice(double office){
        this.office = office;
        
    }
    
    //getter for books
    public double getBooks () {
        return books;
    }
    
    //setter for books
    void setBooks (double books){
        this.books = books;
    }
    
    //getter for apperal
    public double getApperal (){
        return apperal;
    }
    
    //setter for apperal
    void setApperal (double apperal){
        this.apperal = apperal;
    }
    //toString() orerride
    @Override
    public String toString(){
        String y = new String ("Account: " + accountId + " has sold a total of: $" + office+ " in Office supplies"
                + " and a total of: $" + books + " in books, and a total of: $" + apperal + 
                " in apperal.");
        return y;
    }
    
    //override calculate total method
    
    @Override
    public double computeSales(){
        return office + books + apperal;
        }
        
    
}
