
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}



//public class Main {
//    public static void main(String[] args) {
//        int ticketPrice = 13_676;
//        int oneMiles = 20;
//        int miles;
//        miles = ticketPrice / oneMiles;
//        System.out.println(miles);
//
//    }
//}
