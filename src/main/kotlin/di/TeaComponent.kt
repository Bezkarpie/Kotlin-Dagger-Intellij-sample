package di

import dagger.Component
import tea.TeaMaker

@Component(modules = [HeaterModule::class, SecondModule::class])
interface TeaComponent{
    fun teaMaker(): TeaMaker
}