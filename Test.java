
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
   public void test1()
    {
        Auction auction = new Auction();
        Person person1 = new Person("Bea");
        Person person2 = new Person("Ruben");
        
        auction.enterLot("perro");
        auction.enterLot("gato");
        auction.enterLot("vaca");
        
        auction.makeABid(1,person1,100);
        auction.makeABid(2,person2,200);
        auction.makeABid(3,person2,300);
        
        auction.close();
        auction.getUnsold();
    } 
}
