package de.xxlstrandkorbverleih.parkingspot.presentation

import com.google.maps.android.compose.MapProperties
import de.xxlstrandkorbverleih.parkingspot.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false,
)
