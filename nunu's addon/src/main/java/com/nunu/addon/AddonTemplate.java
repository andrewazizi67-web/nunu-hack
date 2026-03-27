package com.nunu.addon;

import com.nunu.addon.modules.ClickAura;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = LoggerFactory.getLogger(AddonTemplate.class);
    public static final Category CATEGORY = new Category("Nunu Hacks");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Nunu's Addon!");

        // Modules
        Modules.get().add(new ClickAura());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.nunu.addon";
    }
}
