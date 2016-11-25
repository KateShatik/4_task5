/**
 * Created by Катя on 25.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(11,"US",Currency.USD,1000000,7000,10,100000000);
        Bank euBank = new EUBank(11,"Swiss",Currency.EUR,1000000,17000,5,100000000);
        Bank chinaBank = new ChinaBank(11,"China",Currency.USD,10000,700,20,10000);
        User user1= new User(11,"Olga",1000,10,10000,"Apple",usBank);
        User user2= new User(101,"Mark",179000,10,1003200,"Apple",usBank);
        User user3= new User (102,"Masha",1200,10,10030,"Sony",euBank);
        User user4= new User(102,"Sasha",1200,10,10030,"Sony",euBank);
        User user5= new User(11,"Ohha",1000,10,10000,"Apple",chinaBank);
        User user6= new User(11,"Ollla",1000,10,10000,"Apple",chinaBank);
    }
}
