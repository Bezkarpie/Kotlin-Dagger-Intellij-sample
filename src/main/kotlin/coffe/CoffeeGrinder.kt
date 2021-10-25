package coffe

import javax.inject.Inject

class CoffeeGrinder @Inject constructor(): Grinder {

    init {
        println("Initializing $this")
    }
    override fun grindCoffee() {
        println("$this grrrrr")
    }
}