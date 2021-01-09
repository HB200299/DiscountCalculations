package hwhotelbooking;

import java.util.Scanner;
public class HWHotelBooking {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which room type would you like?");
        System.out.println("1-Single");
        System.out.println("2-Double");
        System.out.println("3-Family");
        double room = input.nextInt();
        System.out.println("Which board would you like?");
        System.out.println("1-Self catering");
        System.out.println("2-Half board");
        System.out.println("3-Full board");
        double board = input.nextInt();
        System.out.println("How many days would you like to stay for?");
        int days = input.nextInt();
        double cost = 0;
        int total = 0;
        
        if (days>7) {
            double extra = (0.8)*(days-7);
            if (room==1) {
                cost = cost + (7*50);
                cost = cost + (50*extra);
                total = total + (50*(days));
            }
            if (room==2) {
                cost = cost + (7*75);
                cost = cost + (75*extra);
                total = total + (75*(days));
            }
            if (room==3) {
                cost = cost + (7*105);
                cost = cost + (105*extra);
                total = total + (105*(days));
            }
            if (board==2) {
                cost = cost + (7*10);
                cost = cost + (10*extra);
                total = total + (10*(days));
            }
            if (board==3) {
                cost = cost + (7*20);
                cost = cost + (20*extra);
                total = total + (20*(days));
            }
        }else{
            if (room==1) {
                cost = cost + (50*(days));
                total = total + (50*(days));
            }
            if (room==2) {
                cost = cost + (75*(days));
                total = total + (75*(days));
            }
            if (room==3) {
                cost = cost + (105*(days));
                total = total + (105*(days));
            }
            if (board==2) {
                cost = cost + (10*(days));
                total = total + (10*(days));
            }
            if (board==3) {
                cost = cost + (20*(days));
                total = total + (20*(days));
            } 
        }
        System.out.println("total: £"+total+".00");
        System.out.println("Discounted total: £"+cost+"0");
    }
    
}
