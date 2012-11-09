package fot.forgeores;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="ForgeOres", name="Forge Ores", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ForgeOres {

        // The instance of your mod that Forge uses.
	@Instance("Generic")
	public static ForgeOres instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="fot.forgeores.client.ClientProxy", serverSide="fot.forgeores.client.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}