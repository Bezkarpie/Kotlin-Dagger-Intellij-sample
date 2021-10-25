package tea

import heater.Heater
import javax.inject.Inject

//
class Thermosiphon @Inject constructor(private val heater: Heater): TeaPump {
//
//    private val heater: heater.Heater
//
//    //TODO not a primary constructor just for the sake of exploration
////    @Inject
////    constructor(heater: heater.Heater){
////        this.heater = heater
////    }
//
    override fun makeTea(){
        println("Thermosiphon is working")
        heater.heatUp()
    }
}

//@Provides
//fun provideHeater(): heater.Heater = heater.SmallHeater()

//TODO as secondary example
//@Provides fun provideHeater(heater: heater.SmallHeater) = heater

