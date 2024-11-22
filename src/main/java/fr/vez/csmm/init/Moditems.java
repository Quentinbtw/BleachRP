package fr.vez.csmm.init;

import fr.vez.csmm.CSMM;
import fr.vez.csmm.utils.CustomitemTiers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSMM.MODID);

    public static final RegistryObject<Item> ZANGETSU_BANKAI = ITEMS.register("zangetsu_bankai", () -> new SwordItem(CustomitemTiers.ZANG, 0, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> ZANGETSU = ITEMS.register("zangetsu", () -> new SwordItem(CustomitemTiers.ZANG, -4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NOZARASHI_SHEATH = ITEMS.register("nozarashi_sheath", () -> new SwordItem(CustomitemTiers.ZANG, -4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NOZARASHI_SHIKAI = ITEMS.register("nozarashi_shikai", () -> new SwordItem(CustomitemTiers.ZANG, -4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NOZARASHI_ZANPAKUTO = ITEMS.register("nozarashi_zanpakuto", () -> new SwordItem(CustomitemTiers.ZANG, -4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));

}
