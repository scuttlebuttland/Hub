package ultrify.core.common;

import ultrify.core.common.util.C;
import ultrify.core.common.util.UtilPlayer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


public enum Rank
{
  OWNER("Owner", ChatColor.DARK_RED), 
  DEVELOPER("Dev", ChatColor.DARK_AQUA), 
  ADMIN("Admin", ChatColor.PURPLE), 
  MODERATOR("Mod", ChatColor.GOLD), 
  HELPER("Helper", ChatColor.YELLOW), 
  BUILDER("Builder", ChatColor.BLUE), 
  YOUTUBE("Legend", ChatColor.DARK_GREEN), 
  ELITE("Elite", ChatColor.RED), 
  PRO("Pro", ChatColor.AQUA), 
  ALL("All", ChatColor.LIGHT_BLUE);
  
  private ChatColor Color;
  public String Name;
  
  private Rank(String name, ChatColor color)
  {
    this.Color = color;
    this.Name = name;
  }
  
  public boolean Has(Rank rank)
  {
    return Has(null, rank, false);
  }
  
  public boolean Has(Player player, Rank rank, boolean inform)
  {
    if (compareTo(rank) <= 0) {
      return true;
    }
    if (inform)
    {
      UtilPlayer.message(player, C.mHead + "Permissions> " + 
        C.mBody + "This requires Permission Rank [" + 
        C.mHead + rank + 
        C.mBody + "].");
    }
    
    return false;
  }
  
  public String GetTag(boolean bold, boolean uppercase)
  {
    String name = this.Name;
    if (uppercase) {
      name = this.Name.toUpperCase();
    }
    if (bold) return this.Color + C.Bold + name;
    return this.Color + name;
  }
}
