package io.github.meridian.extras

import io.github.meridian.features.FeatureManager
import io.github.meridian.utils.ESP
import net.fabricmc.api.ClientModInitializer

object MeridianExtras : ClientModInitializer {
    override fun onInitializeClient() {
        FeatureManager.register(SeeThroughWalls)

        // ESP.depth == false (see-through) exactly when the toggle is on.
        ESP.setSeeThroughProvider { SeeThroughWalls.enabled }

        // Rehydrate persisted "enabled": this addon may initialize after
        // Meridian's FeatureManager.load() already ran, so re-run load now that
        // our feature is registered. load() is an idempotent re-read of
        // config.json — at init nothing has changed yet, so this is safe.
        FeatureManager.load()
    }
}
