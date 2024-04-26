package gunsowar.init;

import com.mrcrayfish.guns.item.GunItem;
import gunsowar.GunsOWar;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GunsOWar.MOD_ID);

    // Gun items
    public static final RegistryObject<GunItem> TEST_GUN = ITEMS.register("test_gun",
            () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunsOWar.GROUP)));

    public static final RegistryObject<GunItem> TOKAREV = ITEMS.register("tokarev",
            () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunsOWar.GROUP)));

    public static final RegistryObject<GunItem> DP27 = ITEMS.register("dp27",
            () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunsOWar.GROUP)));

    public static final RegistryObject<GunItem> KAR98K = ITEMS.register("kar98k",
            () -> new GunItem(new Item.Properties().stacksTo(1).tab(GunsOWar.GROUP)));
}
