package heater

import javax.inject.Inject

class SmallHeater: Heater {
    override fun heatUp() {
        println("I'm heating the water up very slowly... \nJust a small heater")
    }
}