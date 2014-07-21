package ultrify.core.join;

import ultrify.core.common.util.F;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuit
{
  @EventHandler
  public void Join(PlayerJoinEvent event)
  {
    event.setJoinMessage(F.sys("Join", event.getPlayer().getName()));
  }
  
  @EventHandler
  public void Quit(PlayerQuitEvent event)
  {
    event.setQuitMessage(F.sys("Quit", event.getPlayer().getName()));
  }
}
