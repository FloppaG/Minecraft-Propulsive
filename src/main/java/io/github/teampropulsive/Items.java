package io.github.teampropulsive;


import io.github.teampropulsive.armor.SpaceArmorMaterial;
import io.github.teampropulsive.types.GasCanister;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {
    public static final Item OXYGEN_CANISTER = new GasCanister(new FabricItemSettings(), new Identifier("propulsive:gas/oxygen"), 1000);
    public static final Item METHANE_CANISTER = new GasCanister(new FabricItemSettings(), new Identifier("propulsive:gas/methane"), 1000);
    public static final Item HYDROGEN_CANISTER = new GasCanister(new FabricItemSettings(), new Identifier("propulsive:gas/hydrogen"), 1000);
    public static final ArmorItem SPACE_HELMET = new ArmorItem(SpaceArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final ArmorItem SPACE_CHESTPLATE = new ArmorItem(SpaceArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final ArmorItem SPACE_LEGGINGS = new ArmorItem(SpaceArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final ArmorItem SPACE_BOOTS = new ArmorItem(SpaceArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());
    public static void register() {
        registerItem("oxygen_canister", OXYGEN_CANISTER);
        registerItem("methane_canister", METHANE_CANISTER);
        registerItem("hydrogen_canister", HYDROGEN_CANISTER);

        registerItem("space_helmet", SPACE_HELMET);
        registerItem("space_chestplate", SPACE_CHESTPLATE);
        registerItem("space_leggings", SPACE_LEGGINGS);
        registerItem("space_boots", SPACE_BOOTS);

        Registry.register(Registries.ITEM, new Identifier("propulsive", "lunar_regolith"), new BlockItem(Blocks.MOON_REGOLITH, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("propulsive", "volcanic_lunar_regolith"), new BlockItem(Blocks.VOLCANIC_MOON_REGOLITH, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier("propulsive", "anorthosite"), new BlockItem(Blocks.ANORTHOSITE, new FabricItemSettings()));
    }
    private static void registerItem(String path, Item item) {
        Registry.register(Registries.ITEM, Propulsive.id(path), item);
    }
}
