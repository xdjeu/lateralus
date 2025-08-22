package lateralus;

import lateralus.impl.managers.ModuleManager;
import meteordevelopment.orbit.EventBus;
import meteordevelopment.orbit.IEventBus;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lateralus implements ModInitializer {
	public static final String MOD_ID = "lateralus";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final IEventBus EVENT_BUS = new EventBus();
    public static final ModuleManager MODULE_MANAGER = new ModuleManager();

	@Override
	public void onInitialize() {
	}
}