package com.njxne.liquidglass.demo.catalog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.njxne.liquidglass.demo.catalog.destinations.AdaptiveLuminanceGlassContent
import com.njxne.liquidglass.demo.catalog.destinations.BottomTabsContent
import com.njxne.liquidglass.demo.catalog.destinations.ButtonsContent
import com.njxne.liquidglass.demo.catalog.destinations.ControlCenterContent
import com.njxne.liquidglass.demo.catalog.destinations.DialogContent
import com.njxne.liquidglass.demo.catalog.destinations.GlassPlaygroundContent
import com.njxne.liquidglass.demo.catalog.destinations.HomeContent
import com.njxne.liquidglass.demo.catalog.destinations.LazyScrollContainerContent
import com.njxne.liquidglass.demo.catalog.destinations.LockScreenContent
import com.njxne.liquidglass.demo.catalog.destinations.MagnifierContent
import com.njxne.liquidglass.demo.catalog.destinations.ProgressiveBlurContent
import com.njxne.liquidglass.demo.catalog.destinations.ScrollContainerContent
import com.njxne.liquidglass.demo.catalog.destinations.SliderContent
import com.njxne.liquidglass.demo.catalog.destinations.ToggleContent
import com.njxne.liquidglass.demo.catalog.utils.BackHandler

@Composable
fun MainContent() {
    var destination by rememberSaveable { mutableStateOf(CatalogDestination.Home) }

    when (destination) {
        CatalogDestination.Home -> HomeContent(onNavigate = { destination = it })

        CatalogDestination.Buttons -> ButtonsContent()
        CatalogDestination.Toggle -> ToggleContent()
        CatalogDestination.Slider -> SliderContent()
        CatalogDestination.BottomTabs -> BottomTabsContent()
        CatalogDestination.Dialog -> DialogContent()

        CatalogDestination.LockScreen -> LockScreenContent()
        CatalogDestination.ControlCenter -> ControlCenterContent()
        CatalogDestination.Magnifier -> MagnifierContent()

        CatalogDestination.GlassPlayground -> GlassPlaygroundContent()
        CatalogDestination.AdaptiveLuminanceGlass -> AdaptiveLuminanceGlassContent()
        CatalogDestination.ProgressiveBlur -> ProgressiveBlurContent()
        CatalogDestination.ScrollContainer -> ScrollContainerContent()
        CatalogDestination.LazyScrollContainer -> LazyScrollContainerContent()
    }

    BackHandler(destination != CatalogDestination.Home) {
        destination = CatalogDestination.Home
    }
}
