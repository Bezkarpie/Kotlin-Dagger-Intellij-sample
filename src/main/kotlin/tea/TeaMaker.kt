package tea

import heater.Heater
import javax.inject.Inject

/**
 * Not having an @Inject constructor will prevent Dagger from creating requested instances (?)
 * or just an instance of the tea.TeaMaker?
 */
class TeaMaker @Inject constructor(){
//    @Inject
//    lateinit var teaPump: TeaPump
    @Inject
    lateinit var heater: Heater


    fun makeTea(){
        heater.heatUp()
        println("Im making tea")
    }
}