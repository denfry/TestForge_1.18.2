package net.denfry.testmod.villager;

import net.denfry.testmod.TestMod;
import net.denfry.testmod.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {
    public static final DeferredRegister<PoiType> POI =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, TestMod.MOD_ID);

    public static final RegistryObject<PoiType> DENFRY_PORTAL =
            POI.register("denfry_portal", () -> new PoiType("denfry_portal",
                    PoiType.getBlockStates(ModBlocks.DENFRY_PORTAL.get()), 0, 1));

    public static void registerPOI(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
