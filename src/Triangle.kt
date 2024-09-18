import kotlin.math.sqrt

open class Triangle(_name: String = "Triangle") : Shape(_name) {

    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0

    fun setDimensions(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions(){
        println("Side 1: $side1\nSide 2: $side2\nSide3: $side3")
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        return sqrt(s  * (s - side1) * (s- side2) * (s - side3))
    }
}
