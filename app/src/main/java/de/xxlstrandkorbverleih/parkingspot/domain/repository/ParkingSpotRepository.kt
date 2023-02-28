package de.xxlstrandkorbverleih.parkingspot.domain.repository

import de.xxlstrandkorbverleih.parkingspot.domain.model.ParkingSpot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository {
    suspend fun insertParkingSpot(spot: ParkingSpot)
    suspend fun deleteParkingSpot(spot: ParkingSpot)
    fun getParkingSpots(): Flow<List<ParkingSpot>>
}