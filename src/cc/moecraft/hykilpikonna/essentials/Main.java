package cc.moecraft.hykilpikonna.essentials;

import cc.moecraft.hykilpikonna.essentials.logger.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hykilpikonna的基础前置!
 */
public class Main extends JavaPlugin
{
    //Logger
    public static Logger loglogger = new Logger("HyEssentials", true);

    //实例接口
    private static Main instance = null;

    //配置文件
    public static Config config = new Config();

    /**
     * 加载插件
     */
    public void onEnable()
    {
        //注册实例接口
        instance = this;

        //设置复制默认配置 = 真
        config.getConfig().options().copyDefaults(true);
        config.checkConfig();
        config.saveConfig();
        loglogger.log("已加载此前置插件!");
    }

    /**
     * 获取实例
     * @return 实例
     */
    public static Main getMain()
    {
        return instance;
    }

    /**
     * 卸载插件
     */
    public void onDisable()
    {
        loglogger.log("已卸载此前置插件!");
    }
}
