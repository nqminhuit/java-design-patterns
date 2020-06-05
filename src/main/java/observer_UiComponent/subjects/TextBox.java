package observer_UiComponent.subjects;

public class TextBox extends UiComponent {

    private String text;

    @Override
    public void setText(String newText) {
        this.text = newText;
        getTextChangeEventHandler().handle();
    }

    @Override
    public void onClick() {
        getClickEventHandler().handle();
    }

}
