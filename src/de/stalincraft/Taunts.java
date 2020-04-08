package de.stalincraft;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author KastenKlicker
 */
public class Taunts implements CommandExecutor{

    /**
     *
     * @param sender
     * @param command
     * @param label
     * @param args
     * @return
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        //Commands
        
        if (label.equalsIgnoreCase("1")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Yes.");
	}	
        if (label.equalsIgnoreCase("2")) {
            Bukkit.broadcastMessage("<" + sender.getName() +"> " + "No.");
	}
        if (label.equalsIgnoreCase("3")) {
            Bukkit.broadcastMessage("<" + sender.getName() + "> " + "Food please.");
        }
         if (label.equalsIgnoreCase("4")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Wood please.");
	}	
         if (label.equalsIgnoreCase("5")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Gold please.");
	}
         if (label.equalsIgnoreCase("6")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Stone please.");
	}
         if (label.equalsIgnoreCase("7")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Ahhhh!");
	}
        if (label.equalsIgnoreCase("8")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "All hail, king of the losers!");
	}
        if (label.equalsIgnoreCase("9")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Ooooh!");
	}
        if (label.equalsIgnoreCase("10")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "I'll beat you back to Age of Empires.");
	}
        if (label.equalsIgnoreCase("11")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Hiahiahiahia!");
	}
        if (label.equalsIgnoreCase("12")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Ah! being rushed.");
	}
        if (label.equalsIgnoreCase("13")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Sure, blame it on your ISP.");
	}
        if (label.equalsIgnoreCase("14")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Start the game already!");
	}
        if (label.equalsIgnoreCase("15")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Don't point that thing on me!");
	}
        if (label.equalsIgnoreCase("16")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Enemy sighted!");
	}
        if (label.equalsIgnoreCase("17")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "It is good to be the king.");
	}
        if (label.equalsIgnoreCase("18")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Monk! I need a monk!");
	}
        if (label.equalsIgnoreCase("19")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Long tine, no siege.");
	}
        if (label.equalsIgnoreCase("20")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "My granny could better scrap than that.");
	}
        if (label.equalsIgnoreCase("21")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Nice town, I'll take it.");
	}
        if (label.equalsIgnoreCase("22")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Quit touching me!");
	}
        if (label.equalsIgnoreCase("23")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Raiding party!");
	}
        if (label.equalsIgnoreCase("24")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Dadgum.");
	}
        if (label.equalsIgnoreCase("25")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Eh, smite me.");
	}
        if (label.equalsIgnoreCase("26")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "The wonder, the wonder, the... no!");
	}
        if (label.equalsIgnoreCase("27")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "You played two hours to die like this?");
	}
        if (label.equalsIgnoreCase("28")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Yeah, well, you should see the other guy.");
	}
        if (label.equalsIgnoreCase("29")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Roggan.");
	}
        if (label.equalsIgnoreCase("30")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Wololo.");
	}
        if (label.equalsIgnoreCase("31")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack an enemy now.");
	}
        if (label.equalsIgnoreCase("32")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Cease creating extra villagers.");
	}
        if (label.equalsIgnoreCase("33")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Create extra villagers.");
	}
        if (label.equalsIgnoreCase("34")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a navy.");
	}
        if (label.equalsIgnoreCase("35")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Stop building a navy.");
	}
        if (label.equalsIgnoreCase("36")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Wait for my signal to attack.");
	}
        if (label.equalsIgnoreCase("37")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a wonder.");
	}
        if (label.equalsIgnoreCase("38")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Give me your extra resources.");
	}
        if (label.equalsIgnoreCase("39")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "*dingdingding*");
	}
        if (label.equalsIgnoreCase("40")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "*dong*");
	}
        if (label.equalsIgnoreCase("41")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "*phuuuuu*");
	}
        if (label.equalsIgnoreCase("42")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "What age are you in?");
	}
        return true;
        
    }
    
}
