package jp.naori.naoMachiPlugin;

import jp.naori.naoMachiPlugin.commands.Fly;
import jp.naori.naoMachiPlugin.commands.Hello;
import jp.naori.naoMachiPlugin.commands.Speed;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    public void onEnable(){
        getCommand("hello").setExecutor(new Hello());
        getCommand("fly").setExecutor(new Fly());
        getCommand("speed").setExecutor(new Speed());
    }
}