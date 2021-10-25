package di

import dagger.Binds
import dagger.Module
import dagger.Provides
import heater.Heater
import heater.LargeHeater
import tea.TeaMaker
import tea.TeaPump

// Non-static classes od modules that can have an instance have to be created
// when creating the component - DaggerXXXComponent.builder().secondModule().build() etc
@Module
class SecondModule(private val _heater: Heater) {

    @Provides
    fun provideHeater(): Heater{
        return _heater
    }

    @Provides
    fun bindTeaMaker(heater: Heater): TeaMaker{
        return TeaMaker().apply {
            this.heater = heater
        }
    }

}