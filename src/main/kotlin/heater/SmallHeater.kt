package heater

import javax.inject.Inject

class SmallHeater
    @Inject constructor()
    : Heater {
    override fun heatUp() {
        println("I'm heating the water up very slowly... \nJust a small heater")
    }
}