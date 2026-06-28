package io.github.meridian.extras

import io.github.meridian.features.FeatureManager
import io.github.meridian.utils.ESP
import net.fabricmc.api.ClientModInitializer

object MeridianExtras : ClientModInitializer {
    override fun onInitializeClient() {
        FeatureManager.register(SeeThroughWalls)

        ESP.setSeeThroughProvider { SeeThroughWalls.enabled }

        FeatureManager.load()
    }
}
