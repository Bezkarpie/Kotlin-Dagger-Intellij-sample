package di

import dagger.Binds
import heater.Heater
import heater.SmallHeater
import dagger.Module
import dagger.Provides
import tea.TeaPump
import tea.Thermosiphon
import javax.inject.Singleton

@Module
interface HeaterModule {

//   If You want to annotate it with @Singleton, the component injecting it must also be a scoped one
    // A scoped component is not enough to use same instances through the app
    // the bindings themselves must use @Singleton annotation too
//    @Singleton
    @Binds
    fun bindHeater(heater: SmallHeater): Heater

    @Binds
    fun bindTeaPump(pump: Thermosiphon): TeaPump


//    companion object {
//        @Provides
//        fun provideHeater(): Heater {
//            return SmallHeater()
//        }
//    }
}