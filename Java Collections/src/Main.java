import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater theater = new Theater("AMC",8,12);
//        theater.getSeats();
//        if(theater.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Seat is taken");
//        }
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theater.seat");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is: " + minSeat.getSeatNumber());
        System.out.println("Nax seat number is: " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
    }

    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================================");
    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for(int i = 0; i < list.size() - 1;i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i , j);
                }
            }
        }
    }
}
