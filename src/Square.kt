class Square(_name: String = "Square" ) : Shape(_name) {

    var length = 0.0
    var height = 0.0

    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
       println("Length: $length\nHeight: $height")
    }

    override fun getArea(): Double {
        return length * height
    }

}