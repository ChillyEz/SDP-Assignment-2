public class OldFactory implements AbsFactory {
    @Override
    public AbsButton createButton() {
        return new OldButton();
    }

    @Override
    public AbsCheckBox createCheckBox() {
        return new OldCheckBox();
    }
}
