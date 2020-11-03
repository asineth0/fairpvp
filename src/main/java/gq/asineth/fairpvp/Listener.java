package gq.asineth.fairpvp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        if (e.getEntity().getName().equals("ComplianceDept")) {
            e.setDamage(e.getDamage() * .65);
        }

        if (e.getDamager().getName().equals("ComplianceDept")) {
            e.setDamage(e.getDamage() * 1.25);
        }
    }
}
