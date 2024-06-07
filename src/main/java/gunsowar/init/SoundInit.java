package gunsowar.init;

import gunsowar.GunsOWar;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, GunsOWar.MOD_ID);

    // Gun sounds
    public static final RegistryObject<SoundEvent> KAR98K_FIRE = register("item.kar98k.fire");

    public static final RegistryObject<SoundEvent> MOSIN_FIRE = register("item.mosin.fire");

    public static final RegistryObject<SoundEvent> MOSIN_RELOAD = register("item.mosin.reload");

    private static RegistryObject<SoundEvent> register(String key) {
        return SOUNDS.register(key, () -> new SoundEvent(new ResourceLocation(GunsOWar.MOD_ID, key)));
    }
}
