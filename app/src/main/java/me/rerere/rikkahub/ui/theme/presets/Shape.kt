package me.rerere.rikkahub.ui.theme.presets

import com.kyant.capsule.continuities.G2Continuity
import com.kyant.capsule.continuities.G2ContinuityProfile

val g2 = G2Continuity(
    profile = G2ContinuityProfile.RoundedRectangle.copy(
        0.8,
        0.5,
        1.23,
        1.1
    ),
    capsuleProfile = G2ContinuityProfile.Capsule.copy(
        0.6,
        0.2
    )
)
