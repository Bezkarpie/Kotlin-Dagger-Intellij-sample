package di

import dagger.Binds
import heater.Heater
import heater.SmallHeater
import dagger.Module
import dagger.Provides

@Module
class HeaterModule {

//    Tried both
//    @Binds
//    fun bindHeater(heater: SmallHeater): Heater

    @Provides
    fun provideHeater(): Heater {
        return SmallHeater()
    }
}