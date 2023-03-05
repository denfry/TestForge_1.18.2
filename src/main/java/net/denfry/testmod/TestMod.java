package net.denfry.testmod;

import com.mojang.logging.LogUtils;
import net.denfry.testmod.block.ModBlocks;
import net.denfry.testmod.item.ModItems;
import net.denfry.testmod.villager.ModPOIs;
import net.denfry.testmod.world.dimension.ModDimensions;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TestMod.MOD_ID)
public class TestMod {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "testmod";

    public TestMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.registerItem(eventBus);
        ModBlocks.registerBlock(eventBus);

        ModDimensions.registerDimension();
        ModPOIs.registerPOI(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DENFRY_PORTAL.get(), RenderType.translucent());
    }
    private void setup(final FMLCommonSetupEvent event) {

    }
}
