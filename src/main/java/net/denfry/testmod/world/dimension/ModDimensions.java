package net.denfry.testmod.world.dimension;

import net.denfry.testmod.TestMod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.core.Registry;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> DFDIM_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(TestMod.MOD_ID, "dfdim"));

    public static final ResourceKey<DimensionType> DFDIM_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,
            DFDIM_KEY.getRegistryName());
    public static void registerDimension() {
        System.out.println("Registering DFDIM");
    }
}
