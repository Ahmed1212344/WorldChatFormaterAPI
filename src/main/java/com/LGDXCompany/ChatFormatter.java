package com.LGDXCompany;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatFormatter {
    public static String formatChat(Player player, String message) {
        return ChatColor.GOLD + "[" + player.getName() + "]: " + ChatColor.WHITE + message;
    }
}
