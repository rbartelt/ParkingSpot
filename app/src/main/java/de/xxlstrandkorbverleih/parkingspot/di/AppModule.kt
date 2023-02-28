package de.xxlstrandkorbverleih.parkingspot.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.xxlstrandkorbverleih.parkingspot.data.ParkingSpotDatabase
import de.xxlstrandkorbverleih.parkingspot.data.ParkingSpotRepositoryImpl
import de.xxlstrandkorbverleih.parkingspot.domain.repository.ParkingSpotRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): ParkingSpotDatabase {
        return Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "parking_spot_database"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingSpotDatabase): ParkingSpotRepository {
        return ParkingSpotRepositoryImpl(db.dao)
    }
}