package di

import heater.Heater
import heater.SmallHeater
import dagger.Module
import dagger.Provides

@Module
interface HeaterModule {

    //Tried both
//    @Binds
//    fun bindHeater(heater: heater.SmallHeater): heater.Heater

    @Provides
    fun provideHeater(): Heater {
        return SmallHeater()
    }
}