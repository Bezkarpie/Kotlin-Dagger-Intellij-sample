package heater

import dagger.Reusable
import javax.inject.Inject
import javax.inject.Singleton

@Reusable
class SmallHeater
    @Inject constructor()
    : Heater {
    override fun heatUp() {
        println("I'm heating the water up very slowly... $this \nJust a small heater")
    }
}