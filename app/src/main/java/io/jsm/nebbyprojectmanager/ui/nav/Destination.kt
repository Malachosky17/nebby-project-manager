package io.jsm.nebbyprojectmanager.ui.nav

import kotlinx.serialization.Serializable

sealed interface Destination {

    @Serializable
    data object Home : Destination

    @Serializable
    data object Agenda : Destination

    @Serializable
    data object Profile : Destination

}