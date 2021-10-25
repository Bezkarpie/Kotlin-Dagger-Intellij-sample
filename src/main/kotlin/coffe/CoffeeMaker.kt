package coffe

import javax.inject.Inject

class CoffeeMaker @Inject constructor() {

    // In kotlin it's important to use dagger.Lazy instead of Kotlin's one
    @Inject
    lateinit var coffeeGrinder: dagger.Lazy<Grinder>

    fun brew(){
        println("Brewing coffee with $this using $coffeeGrinder")
        coffeeGrinder.get().grindCoffee()
    }
}