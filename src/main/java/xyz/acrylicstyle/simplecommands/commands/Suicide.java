package xyz.acrylicstyle.simplecommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Suicide implements CommandExecutor {
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String cmd, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "This command cannot be invoked from console.");
            return true;
        }
        Player player = (Player) sender;
        player.setHealth(0.0D);
        player.sendMessage(ChatColor.GOLD + "You took your own life.");
        return true;
    }
}
