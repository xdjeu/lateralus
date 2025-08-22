package lateralus.impl.managers;

import lateralus.api.module.Module;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ModuleManager {
    private List<Module> modules = new ArrayList<>();

    public ModuleManager() {
        /*
        * This is where you would idealy add modules.
        * ie.
        * addModule(new Sprint);
        */
    }

    private void addModule(Module module) {
        modules.add(module);
    }

    public List<Module> getEnabledModules() {
        List<Module> enabledModules = new ArrayList<>();
        for (Module m : modules) if (m.isEnabled()) enabledModules.add(m);
        return enabledModules;
    }
}
