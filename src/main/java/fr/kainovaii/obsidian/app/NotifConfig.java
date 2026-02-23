package fr.kainovaii.obsidian.app;

import fr.kainovaii.obsidian.config.ConfigInterface;
import fr.kainovaii.obsidian.config.annotations.Config;
import fr.kainovaii.obsidian.flash.FlashConfig;

@Config
public class NotifConfig implements ConfigInterface
{
    @Override
    public void configure()
    {
        FlashConfig.setDuration(5000);

        FlashConfig.setPosition("top-right");

        FlashConfig.setCustomCSS("""
        .flash-notification {
            border-radius: 1rem;
            font-size: 0.875rem;
        }
        .flash-success {
            background: linear-gradient(to right, #10b981, #059669);
        }
        """);
    }
}