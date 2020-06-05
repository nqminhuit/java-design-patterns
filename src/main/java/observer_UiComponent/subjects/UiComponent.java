package observer_UiComponent.subjects;

import java.util.ArrayList;
import java.util.List;
import observer_UiComponent.observers.ClickEventHandler;
import observer_UiComponent.observers.EventHandler;
import observer_UiComponent.observers.TextChangeEventHandler;

public abstract class UiComponent {

    private EventHandler textChangeEventHandler;

    private EventHandler clickEventHandler;

    private List<EventHandler> eventHandlers = new ArrayList<>();

    abstract void setText(String newText);

    abstract void onClick();

    EventHandler getTextChangeEventHandler() {
        if (textChangeEventHandler == null) {
            this.textChangeEventHandler = this.eventHandlers.stream()
                .filter(eventHandler -> eventHandler.getClass().equals(TextChangeEventHandler.class))
                .findFirst().get();
        }
        return this.textChangeEventHandler;
    }

    EventHandler getClickEventHandler() {
        if (clickEventHandler == null) {
            this.clickEventHandler = this.eventHandlers.stream()
                .filter(eventHandler -> eventHandler.getClass().equals(ClickEventHandler.class))
                .findFirst().get();
        }
        return this.clickEventHandler;
    }

    public void addEventHandler(EventHandler eventHandler) {
        this.eventHandlers.add(eventHandler);
    }

    public void removeEventHandler(EventHandler eventHandler) {
        this.eventHandlers.remove(this.eventHandlers.indexOf(eventHandler));
    }

}
