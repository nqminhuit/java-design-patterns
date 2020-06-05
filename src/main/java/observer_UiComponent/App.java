package observer_UiComponent;

import observer_UiComponent.observers.ClickEventHandler;
import observer_UiComponent.observers.TextChangeEventHandler;
import observer_UiComponent.subject.Button;
import observer_UiComponent.subject.TextBox;

public class App {

    public static void main(String[] args) {
        Button button = new Button();
        button.addEventHandler(new ClickEventHandler());
        button.addEventHandler(new TextChangeEventHandler());
        button.onClick();
        button.setText("newText");

        TextBox textBox = new TextBox();
        textBox.addEventHandler(new ClickEventHandler());
        textBox.addEventHandler(new TextChangeEventHandler());
        textBox.onClick();
        textBox.setText("newText");
    }

}
