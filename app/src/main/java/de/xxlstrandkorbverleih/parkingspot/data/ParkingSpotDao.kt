package de.xxlstrandkorbverleih.parkingspot.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ParkingSpotDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertParkingSpot(parkingSpotEntity: ParkingSpotEntity)

    @Delete
    suspend fun deleteParkingSpot(parkingSpotEntity: ParkingSpotEntity)

    @Query("SELECT * FROM parkingspotentity")
    fun getParkingSpots(): Flow<List<ParkingSpotEntity>>
}