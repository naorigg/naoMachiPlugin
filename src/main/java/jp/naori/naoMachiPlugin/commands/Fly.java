package jp.naori.naoMachiPlugin.commands;
import jp.naori.naoMachiPlugin.commands.utils.Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    public Fly() {

    }

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Player only command!");
            return false;
        }
        Player p = (Player) commandSender;
        if (!p.hasPermission("flyspeed.fly")) {
            p.sendMessage(Util.Color("&cYou don't have enough permissions!"));
            return false;
        }
        if (!p.getAllowFlight()) {
            p.setAllowFlight(true);
            p.sendMessage(Util.Color("&aFlight mode set to &btrue"));
        } else {
            p.setAllowFlight(false);
            p.sendMessage(Util.Color("&aFlight mode set to &cfalse"));
        }
        return true;

    }

}