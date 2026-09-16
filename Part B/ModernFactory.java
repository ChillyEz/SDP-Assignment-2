public class ModernFactory implements AbsFactory {
    @Override
    public AbsButton createButton() {
        return new ModernButton();
    }

    @Override
    public AbsCheckBox createCheckBox() {
        return new ModernCheckBox();
    }
    
}
