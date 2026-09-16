public class main {

    public static void main(String[] args) {
        
        //for example client choosed the road logistics
        Logistics logistics1 = new RoadLogistics();
        Transport transport1 = logistics1.createTransport();
        System.out.println(transport1);


        //for example client choosed the sea logistics
        Logistics logistics2 = new SeaLogistics();
        Transport transport2 = logistics2.createTransport();
        System.out.println(transport2);
    }
}