package gunsowar;

import com.mojang.logging.LogUtils;
import gunsowar.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod(GunsOWar.MOD_ID)
public class GunsOWar {
    public static final String MOD_ID = "gunsowar";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.NAME_TAG);
        }
    };

    public GunsOWar() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);

        ItemInit.ITEMS.register(bus);

        bus.addListener(this::onClientSetup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // If you want to do some pre-init stuff
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        // e.g.: ModelOverrides.register(ItemInit.PPSH.get(), new PPSH41Model());
    }
}
