package observer_UiComponent.subjects;

public class Button extends UiComponent {

    private String text;

    @Override
    public void setText(String newText) {
        this.text = newText;
        getTextChangeEventHandler().handle();
    }

    public String getText() {
        return this.text;
    }

    public void onClick() {
        getClickEventHandler().handle();
    }

}
