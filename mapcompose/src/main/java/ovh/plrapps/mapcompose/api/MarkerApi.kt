package ovh.plrapps.mapcompose.api

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import ovh.plrapps.mapcompose.ui.state.MapState

fun MapState.addMarker(
    id: String,
    x: Double,
    y: Double,
    relativeOffset: Offset = Offset(-0.5f, -1f),
    absoluteOffset: Offset = Offset.Zero,
    c: @Composable () -> Unit
) {
    markerState.addMarker(id, x, y, relativeOffset, absoluteOffset, c)
}

fun MapState.removeMarker(id: String): Boolean {
    return markerState.removeMarker(id)
}

fun MapState.moveMarker(id: String, x: Double, y: Double) {
    markerState.moveMarker(id, x, y)
}