package io.github.meridian.extras

import io.github.meridian.features.types.SwitchFeature

/**
 * Re-enables Meridian's see-through-walls ESP rendering. The base mod ships no
 * way to turn this on (legit-only); here the enabled state is wired into
 * [io.github.meridian.utils.ESP.setSeeThroughProvider] by [MeridianExtras].
 */
object SeeThroughWalls : SwitchFeature(
    name = "ESP See-Through Walls",
    description = "Render boxes and tracers through walls.",
    category = "General",        // must match an existing CategoryPanel id
    configKey = "seethrough_walls",
    subcategory = "ESP"
) {
    init { external = true }     // gold border in GUI + search
}
