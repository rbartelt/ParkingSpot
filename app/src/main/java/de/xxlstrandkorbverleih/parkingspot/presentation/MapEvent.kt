package de.xxlstrandkorbverleih.parkingspot.presentation

import com.google.android.gms.maps.model.LatLng
import de.xxlstrandkorbverleih.parkingspot.domain.model.ParkingSpot

sealed class MapEvent {
    data class OnMapLongClick(val latlng: LatLng): MapEvent()
    data class OnInfoWindowClick(val spot: ParkingSpot): MapEvent()
    object ToggleFalloutMap: MapEvent()
}
