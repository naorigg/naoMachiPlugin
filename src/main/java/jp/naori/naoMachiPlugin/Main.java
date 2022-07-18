package jp.naori.naoMachiPlugin;

import jp.naori.naoMachiPlugin.commands.*;
import jp.naori.naoMachiPlugin.commands.utils.TeleportUtils;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    public void onEnable(){
        getCommand("hello").setExecutor(new Hello());
        getCommand("fly").setExecutor(new Fly());
        getCommand("speed").setExecutor(new Speed());
        getCommand("feed").setExecutor(new Feed());
        getCommand("sethome").setExecutor(new SetHome());

        // Random TP
        TeleportUtils yeet = new TeleportUtils(this);

        getCommand("rtp").setExecutor(new RandomTP());

        // Setup Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }
}