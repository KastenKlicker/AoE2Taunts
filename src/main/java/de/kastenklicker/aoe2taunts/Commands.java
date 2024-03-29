package de.kastenklicker.aoe2taunts;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author KastenKlicker
 *
 * Commands of the Plugin
 *
 */

public class Commands implements CommandExecutor {

        private final Taunts TauntsClass = new Taunts();
        private final String[] tauntsArray = this.TauntsClass.getTauntsArray();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        //Help command for the taunts of the original edition
        if (s.equalsIgnoreCase("tauntsorg")) {
            commandSender.sendMessage(ChatColor.GREEN + "The following taunts from the original game are available:");
            for (int i = 1; i <= 42 && i < this.tauntsArray.length; i++) {
                commandSender.sendMessage(ChatColor.GREEN + "/" + i + " " + this.tauntsArray[i]);
            }
            commandSender.sendMessage(ChatColor.GREEN +"/tauntsdef lists all taunts of the Definitive Edition.");

            //URL to visit the plugin at SpigotMC.
            TextComponent Url = new TextComponent("Visit this Plugin!");
            Url.setColor(net.md_5.bungee.api.ChatColor.GOLD);
            Url.setBold(true);
            Url.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/resources/age-of-empires-2-taunts.76955/"));
            Url.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click here!")));
            commandSender.spigot().sendMessage(Url);

            return true;
        }

        //Help command for the taunts of the Definitive Edition
        if (s.equalsIgnoreCase("tauntsdef")) {
            commandSender.sendMessage(ChatColor.GREEN + "The following taunts from the Definitive Edition are available:");
            for (int i = 43; i < this.tauntsArray.length; i++) {
                commandSender.sendMessage(ChatColor.GREEN + "/" + i + " " + this.tauntsArray[i]);
            }
            commandSender.sendMessage(ChatColor.GREEN + "/taunts lists all taunts of the original game.");

            //URL to visit the plugin at GitHub.
            TextComponent Url = new TextComponent("Visit the Plugin on GitHub.");
            Url.setColor(net.md_5.bungee.api.ChatColor.GOLD);
            Url.setBold(true);
            Url.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/KastenKlicker/AoE2Taunts"));
            Url.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click here!")));
            commandSender.spigot().sendMessage(Url);

            return true;
        }

        //Taunt command
        if (s.equalsIgnoreCase("taunt")) {
            try {

                int id = Integer.parseInt(args[0]);

                if (args.length == 1 && id > 0 && id < tauntsArray.length) {

                    Player sender = Bukkit.getPlayer(commandSender.getName());
                    assert sender != null;

                    String message = this.tauntsArray[id];
                    sender.chat(message);

                    return true;
                }
            }
            catch (Exception e) {

                return false;
            }
        }



        return false;
    }
}
