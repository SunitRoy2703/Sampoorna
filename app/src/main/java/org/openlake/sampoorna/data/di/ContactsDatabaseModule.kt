package org.openlake.sampoorna.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import org.openlake.sampoorna.data.sources.AppDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ContactsDatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "contacts_database"
        ).build()
    }
}