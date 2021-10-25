import di.DaggerTeaComponent

fun main(args: Array<String>) {
    println("Hello World!")

    val component = DaggerTeaComponent.builder().build()

    component.teaMaker().makeTea()
}