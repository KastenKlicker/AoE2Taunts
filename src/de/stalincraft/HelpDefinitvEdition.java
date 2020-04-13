/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stalincraft;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author KastenKlicker
 */
public class HelpDefinitvEdition implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (label.equalsIgnoreCase("tauntsdef")) {
            sender.sendMessage(ChatColor.GREEN + "/43 What is your strategy?");
            sender.sendMessage(ChatColor.GREEN + "/44 How many resources do you have?");
            sender.sendMessage(ChatColor.GREEN + "/45 Retreat now!");
            sender.sendMessage(ChatColor.GREEN + "/46 Flare the location of your army.");
            sender.sendMessage(ChatColor.GREEN + "/47 Attack in direction of the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/48 I'm being attacked, please help!");
            sender.sendMessage(ChatColor.GREEN + "/49 Build a forward base at the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/50 Build a fortification at the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/51 Keep your army close to mine and fight with me.");
            sender.sendMessage(ChatColor.GREEN + "/52 Build a market at the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/53 Rebuild your base at the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/54 Build a wall between the two flared locations.");
            sender.sendMessage(ChatColor.GREEN + "/55 Build a wall around your town.");
            sender.sendMessage(ChatColor.GREEN + "/56 Train units which counter the enemy's army.");
            sender.sendMessage(ChatColor.GREEN + "/57 Stop training counter units.");
            sender.sendMessage(ChatColor.GREEN + "/58 Prepare to send me all your resources so I can vanquish our foes!");
            sender.sendMessage(ChatColor.GREEN + "/59 Stop sending me extra resources.");
            sender.sendMessage(ChatColor.GREEN + "/60 Prepare to train a large army, I will send you as many resources as I can spare.");
            sender.sendMessage(ChatColor.GREEN + "/61 Attack player 1!");
            sender.sendMessage(ChatColor.GREEN + "/62 Attack player 2!");
            sender.sendMessage(ChatColor.GREEN + "/63 Attack player 3!");
            sender.sendMessage(ChatColor.GREEN + "/64 Attack player 4!");
            sender.sendMessage(ChatColor.GREEN + "/65 Attack player 5!");
            sender.sendMessage(ChatColor.GREEN + "/66 Attack player 6!");
            sender.sendMessage(ChatColor.GREEN + "/67 Attack player 7!");
            sender.sendMessage(ChatColor.GREEN + "/68 Attack player 8!");
            sender.sendMessage(ChatColor.GREEN + "/69 Delete the object on the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/70 Delete your excess villagers.");
            sender.sendMessage(ChatColor.GREEN + "/71 Delete excess warships.");
            sender.sendMessage(ChatColor.GREEN + "/72 Focus on training infantry units.");
            sender.sendMessage(ChatColor.GREEN + "/73 Focus on training cavalry units.");
            sender.sendMessage(ChatColor.GREEN + "/74 Focus on training ranged units.");
            sender.sendMessage(ChatColor.GREEN + "/75 Focus on training warships.");
            sender.sendMessage(ChatColor.GREEN + "/76 Attack the enemy with Militia.");
            sender.sendMessage(ChatColor.GREEN + "/77 Attack the enemy with Archers.");
            sender.sendMessage(ChatColor.GREEN + "/78 Attack the enemy with Skirmishers.");
            sender.sendMessage(ChatColor.GREEN + "/79 Attack the enemy with a mix of Archers and Skirmishers.");
            sender.sendMessage(ChatColor.GREEN + "/80 Attack the enemy with Scout Cavalry.");
            sender.sendMessage(ChatColor.GREEN + "/81 Attack the enemy with Men-at-Arms.");
            sender.sendMessage(ChatColor.GREEN + "/82 Attack the enemy with Eagle Scouts.");
            sender.sendMessage(ChatColor.GREEN + "/83 Attack the enemy with Towers.");
            sender.sendMessage(ChatColor.GREEN + "/84 Attack the enemy with Crossbowmen.");
            sender.sendMessage(ChatColor.GREEN + "/85 Attack the enemy with Cavalry Archers.");
            sender.sendMessage(ChatColor.GREEN + "/86 Attack the enemy with Unique Units.");
            sender.sendMessage(ChatColor.GREEN + "/87 Attack the enemy with Knights.");
            sender.sendMessage(ChatColor.GREEN + "/88 Attack the enemy with Battle Elephants.");
            sender.sendMessage(ChatColor.GREEN + "/89 Attack the enemy with Scorpions.");
            sender.sendMessage(ChatColor.GREEN + "/90 Attack the enemy with Monks.");
            sender.sendMessage(ChatColor.GREEN + "/91 Attack the enemy with Monks and Mangonels.");
            sender.sendMessage(ChatColor.GREEN + "/92 Attack the enemy with Eagle Warriors.");
            sender.sendMessage(ChatColor.GREEN + "/93 Attack the enemy with Halberdiers and Rams.");
            sender.sendMessage(ChatColor.GREEN + "/94 Attack the enemy with Elite Eagle Warriors.");
            sender.sendMessage(ChatColor.GREEN + "/95 Attack the enemy with Arbalests.");
            sender.sendMessage(ChatColor.GREEN + "/96 Attack the enemy with Champions.");
            sender.sendMessage(ChatColor.GREEN + "/97 Attack the enemy with Galleys.");
            sender.sendMessage(ChatColor.GREEN + "/98 Attack the enemy with Fire Galleys.");
            sender.sendMessage(ChatColor.GREEN + "/99 Attack the enemy with Demolition Rafts.");
            sender.sendMessage(ChatColor.GREEN + "/100 Attack the enemy with War Galleys.");
            sender.sendMessage(ChatColor.GREEN + "/101 Attack the enemy with Fire Ships.");
            sender.sendMessage(ChatColor.GREEN + "/102 Attack the enemy with Unique Warships.");
            sender.sendMessage(ChatColor.GREEN + "/103 Use an Onager to cut down trees at the flared location.");
            sender.sendMessage(ChatColor.GREEN + "/104 Don't resign!");
            sender.sendMessage(ChatColor.GREEN + "/105 You can resign again.");
            
            sender.sendMessage(ChatColor.GREEN +"/taunts Lists all taunts from the original.");
            
            TextComponent message = new TextComponent( "Go to the Tauntslist!" );
            message.setColor( net.md_5.bungee.api.ChatColor.GOLD );
            message.setBold( true );
            message.setClickEvent( new ClickEvent( ClickEvent.Action.OPEN_URL, "https://raw.githubusercontent.com/KastenKlicker/AoE2Taunts/master/Taunts.txt" ) );
            message.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder( "Click here!" ).create() ) );
            
            sender.spigot().sendMessage(message);
            
        }
        
        return true;
    }
}
