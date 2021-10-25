package di

import dagger.Component

@Component(modules = [HeaterModule::class])
interface TeaComponent{
    // Commented out to keep breaking stuff to minimum
//    fun teaMaker(): TeaMaker
}