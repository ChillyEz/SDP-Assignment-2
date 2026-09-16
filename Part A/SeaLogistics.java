public class SeaLogistics extends Logistics {
    
    @Override
    public Object createTransport() {
        return new Ship();
    }
}
