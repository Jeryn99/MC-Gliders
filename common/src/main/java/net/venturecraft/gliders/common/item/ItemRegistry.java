package net.venturecraft.gliders.common.item;

import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.threetag.palladiumcore.registry.CreativeModeTabRegistry;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;
import net.venturecraft.gliders.VCGliders;

import static net.venturecraft.gliders.VCGliders.MOD_ID;

public class ItemRegistry {

    public static CreativeModeTab MAIN = CreativeModeTabRegistry.create(VCGliders.id("main"), () -> new ItemStack(ItemRegistry.PARAGLIDER_DIAMOND.get()));

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);

    // Gliders
    public static final RegistrySupplier<GliderItem> PARAGLIDER_WOOD = ITEMS.register("paraglider_wood", () -> new GliderItem((new Item.Properties()).durability(500).tab(MAIN).rarity(Rarity.COMMON)));
    public static final RegistrySupplier<GliderItem> PARAGLIDER_IRON = ITEMS.register("paraglider_iron", () -> new GliderItem((new Item.Properties()).durability(80).tab(MAIN).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<GliderItem> PARAGLIDER_GOLD = ITEMS.register("paraglider_gold", () -> new GliderItem((new Item.Properties()).durability(200).tab(MAIN).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<GliderItem> PARAGLIDER_DIAMOND = ITEMS.register("paraglider_diamond", () -> new GliderItem((new Item.Properties()).durability(100).tab(MAIN).rarity(Rarity.RARE)));
    public static final RegistrySupplier<GliderItem> PARAGLIDER_NETHERITE = ITEMS.register("paraglider_netherite", () -> new GliderItem((new Item.Properties()).durability(500).tab(MAIN).rarity(Rarity.EPIC)));
    public static final RegistrySupplier<Item> COPPER_UPGRADE = ITEMS.register("copper_upgrade", () -> new Item((new Item.Properties()).tab(MAIN)));
    public static final RegistrySupplier<Item> NETHER_UPGRADE = ITEMS.register("nether_upgrade", () -> new Item((new Item.Properties()).tab(MAIN)));

    public static final RegistrySupplier<Item> REINFORCED_PAPER = ITEMS.register("reinforced_paper", () -> new Item(new Item.Properties().tab(MAIN).rarity(Rarity.COMMON)));
    public static final RegistrySupplier<Item> REINFORCED_PAPER_IRON = ITEMS.register("reinforced_paper_iron", () -> new Item(new Item.Properties().tab(MAIN).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> REINFORCED_PAPER_GOLD = ITEMS.register("reinforced_paper_gold", () -> new Item(new Item.Properties().tab(MAIN).rarity(Rarity.UNCOMMON)));
    public static final RegistrySupplier<Item> REINFORCED_PAPER_DIAMOND = ITEMS.register("reinforced_paper_diamond", () -> new Item(new Item.Properties().tab(MAIN).rarity(Rarity.RARE)));
    public static final RegistrySupplier<Item> REINFORCED_PAPER_NETHERITE = ITEMS.register("reinforced_paper_netherite", () -> new Item(new Item.Properties().tab(MAIN).rarity(Rarity.EPIC)));


}