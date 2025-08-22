package lateralus.api.module;

import lateralus.Lateralus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Module {
    private String name, description;
    private Category category;
    private int key;
    private boolean enabled;

    public Module(String name, String description, Category category, int key) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.key = key;
    }

    public void toggle() {
        enabled = !enabled;
        if (enabled) enable(); else disable();
    }

    public void onEnable() {};

    public void onDisable() {};

    private void enable() {
        Lateralus.EVENT_BUS.subscribe(this);
        onEnable();
    }

    private void disable() {
        Lateralus.EVENT_BUS.unsubscribe(this);
        onDisable();
    }
}
