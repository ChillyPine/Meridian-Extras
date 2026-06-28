package io.github.meridian.extras

import io.github.meridian.features.types.SwitchFeature

object SeeThroughWalls : SwitchFeature(
    name = "ESP Toggle",
    description = "Render §lall §rboxes and tracers through walls.\n§cUse at your own risk.",
    category = "General",
    configKey = "seethrough_walls",
    subcategory = "Miscellaneous",
) {
    init { external = true }
}