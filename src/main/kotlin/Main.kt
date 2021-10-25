import di.DaggerTeaComponent
import di.SecondModule
import heater.LargeHeater
import heater.SmallHeater

fun main(args: Array<String>) {
    println("Hello World!")

    val secondModule = SecondModule(SmallHeater())
//    val secondModule = SecondModule(LargeHeater())

    val component = DaggerTeaComponent.builder()
        .secondModule(secondModule)
        .build()


    component.teaMaker().makeTea()
}