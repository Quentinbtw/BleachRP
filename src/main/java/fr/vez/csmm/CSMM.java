package fr.vez.csmm;

import fr.vez.csmm.init.Moditems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CSMM.MODID)
public class CSMM {

    public static final String MODID = "csmm";

    public CSMM(){


        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Moditems.ITEMS.register(bus);

    }


    private void setup(FMLCommonSetupEvent e){



    }

    public void clientSetup(FMLClientSetupEvent e){




    }

}
