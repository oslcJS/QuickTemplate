package com.quicktemplate;

import com.quicktemplate.quicklink.QuickLink;
import com.quicktemplate.util.Msg;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuickTemplate extends JavaPlugin {

    private static QuickTemplate instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Msg.init(this);

        QuickLink.register(this);

        registerCommand("quicktemplate", (sender, command, label, args) -> {
            if (!sender.hasPermission("quicktemplate.admin")) {
                Msg.send(sender, "no-permission");
                return true;
            }
            if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
                reloadConfig();
                Msg.send(sender, "reloaded");
                return true;
            }
            Msg.send(sender, "&7Usage: /qt reload");
            return true;
        }, (sender, command, label, args) -> {
            if (args.length == 1) return java.util.List.of("reload");
            return java.util.List.of();
        });

        getLogger().info("QuickTemplate enabled. Server: " + Bukkit.getBukkitVersion());
    }

    @Override
    public void onDisable() {
        QuickLink.unregister();
    }

    private void registerCommand(String name, org.bukkit.command.CommandExecutor executor, org.bukkit.command.TabCompleter tabCompleter) {
        PluginCommand cmd = getCommand(name);
        if (cmd != null) {
            cmd.setExecutor(executor);
            if (tabCompleter != null) cmd.setTabCompleter(tabCompleter);
        }
    }

    public static QuickTemplate get() { return instance; }
}
