public class Main {
    public static void main(String[] args) {

        // Create an instance of the OldFactory
        AbsFactory factory = new OldFactory();
        AbsButton button = factory.createButton();
        AbsCheckBox checkBox = factory.createCheckBox();
        button.paint();
        checkBox.paint();

        // Create an instance of the ModernFactory
        factory = new ModernFactory();
        button = factory.createButton();
        checkBox = factory.createCheckBox();
        button.paint();
        checkBox.paint();

    }
    
}
