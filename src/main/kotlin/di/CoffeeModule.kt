package di

import coffe.CoffeeGrinder
import coffe.CoffeeMaker
import coffe.Grinder
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface CoffeeModule {

    companion object{

        @Provides
        fun provideGrinder(): Grinder {
            return CoffeeGrinder()
        }
    }
}