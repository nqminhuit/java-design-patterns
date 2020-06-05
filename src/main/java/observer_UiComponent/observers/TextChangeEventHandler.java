package observer_UiComponent.observers;

public class TextChangeEventHandler implements EventHandler {

    @Override
    public void handle() {
        System.out.println("handle text change");
    }

}
