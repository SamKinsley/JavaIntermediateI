
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//testing the classes.
public class Main {
    public static void main(String[] ags){
       //scanner to get user input
        Scanner reader = new Scanner(System.in);
        //create supplies object
        Supplies t = new Supplies (1, 0.0, 0.0, 0.0); 
         //create service object
        Service s = new Service (1, 0, 0.0);
        //create object
        Paper p = new Paper(1,0,0.0);


    //Creat array for account objects.
        Account [] accounts = new Account [3];
        
        //initialize array with account objects.
        accounts[0] = t;
        accounts[1] = s;
        accounts[2] = p;
               
        
                
    
     //Assumes there is only three employees
     
    //Start of user input and system output
    //Set account ID to increas with every employee
        t.getAccountId();
        t.setAccountId(1);
        s.getAccountId();
        s.setAccountId(1);
        p.getAccountId();
        p.setAccountId(1);
    
    /*F1  Accept a sales person’s entry for the dollar amount of office supplies 
    sold, books sold, and apparel sold. The sum of these three categories will be 
    the total of their supplies sold.*/
    
    /*F1 adjusted to include for loop so that it will accept three employees entries IP4*/
    
    //Teacher gave me adivice to change this to one for loop, so this is the only for loop.
    
    for (t.accountId = 1; t.accountId < 4; t.accountId ++) {
            System.out.println ("Hello Employee Id: " + t.accountId);
            System.out.println("Enter dollar ammount of Office Supplies sold: ");
    
            //get and set
            t.getOffice();
            t.setOffice(reader.nextDouble());
    
            //Continue to get book amount
            System.out.println("Enter dollar ammount of Books sold: ");
            t.getBooks();
            t.setBooks(reader.nextDouble());
    
            //Continue to get apperal ammount
            System.out.println("Enter dollar ammount of Apperal sold: ");
            t.getApperal();
            t.setApperal(reader.nextDouble());
    
            //testing toString
             //Acount ID was not printed. ??
            System.out.println(t.toString());
    
            //testing calculate method
            System.out.println("The total of sales in Supplies is: " + t.computeSales());
    

    //F2: Accept a sales person’s entry for the number of service hours sold and rate per hour.
    //f2 adjusted to loop for every employee for three eployees. IP4
    //creats account ID for each employees input
   
     
            System.out.println ("Hello Employee Id: " + s.accountId);
            //ask user for input
            System.out.println("Enter hours of service sold: ");
    
            //get and set
            s.gethours();
            s.setHours(reader.nextInt());

            //Ask for user input
            System.out.println("Enter Rate per hours sold: ");
    
            //get and set
            s.getRate();
            s.setRate(reader.nextDouble());
    
            //Test toString
             System.out.println(s.toString());
            //test calculate method
            System.out.println("The total of Sales in Services: " + s.computeSales());
     
    //F3: Accept a sales person’s entry for the number of pounds of paper sold and the price per pound.

    
     
            System.out.println ("Hello Employee Id: " + p.accountId);
            //Ask for user input
            System.out.println("Enter pounds of paper sold: ");
    
            //get and set
            p.getPounds();
            p.setPounds(reader.nextInt());
    
            //Ask for userinput
            System.out.println("Enter Price per pound sold: ");
    
            //get and set
            p.getPricePounds();
            p.setPricePounds(reader.nextDouble());
    
            //test toString
            System.out.println(p.toString());
    
            //test compute
            System.out.println("The total of sales in Paper: " + p.computeSales());
   }  
    //Displays the total current sales to date in all 3 categories for the sales person: supplies, services, and paper. 
    //create frame for shapes2D
        JFrame frame = new JFrame("Star Logo");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        Shapes2D shapes2D = new Shapes2D();
        
       
        
                frame.add( shapes2D ); //add shape and name to frame
                
                frame.setBackground(Color.WHITE);
                frame.setSize(400,400);
                frame.setVisible(true);
                //trying to get the yearly total
                //the Code says it will work but it still does not show up in the pop up message.
                JLabel calculate = new JLabel("Yearly Calculate");
                frame.add(calculate);
                //trying to add pring yearly total
                //JOptionPane did not work
                //JOptionPane.showMessageDialog("The complete total is: $" + p.computeSales() + s.computeSales() + t.computeSales());
  
System.out.println("The complete total is: $" + p.computeSales() + s.computeSales() + t.computeSales());
    
       
       
    }
    
}
