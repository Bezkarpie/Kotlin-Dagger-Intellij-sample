package di

import coffe.CoffeeMaker
import dagger.Component
import tea.TeaMaker
import tea.TeaPump
import javax.inject.Singleton

@Component(modules = [HeaterModule::class, CoffeeModule::class])
// Component must be scoped to contain scoped bindings
// otherwise:
// di.TeaComponent (unscoped) may not reference scoped bindings:
@Singleton
interface TeaComponent{
    fun teaMaker(): TeaMaker
    fun thermosiphon(): TeaPump

    fun coffeMaker(): CoffeeMaker
}