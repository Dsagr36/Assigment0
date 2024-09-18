fun main() {

    val circle1 : Shape = Circle()
    val square : Shape = Square()
    val Triangle : Shape = Triangle()
    val equilateralTriangle : Shape = EquilateralTriangle()

//   equilateraltriangle Object
    println("Enter Equilateraltriangle side: ")
    (equilateralTriangle as EquilateralTriangle).setDimensions(readln().toDouble())
    println("Shape Name: ${equilateralTriangle.name}")
    println("Dimensions: ")
    equilateralTriangle.printDimensions()
    println("Area: ${equilateralTriangle.getArea()}")

//  Triangle Object
    println("Enter Triangle dimensions: ")
    (Triangle as Triangle).setDimensions(readln().toDouble(), readln().toDouble(), readln().toDouble() )
    println("Shape Name: ${Triangle.name}")
    println("Dimensions: ")
    Triangle.printDimensions()
    println("Area: ${Triangle.getArea()}")




//    Square Object
    println("Enter Square dimensions: ")
    (square as Square).setDimensions(readln().toDouble(), readln().toDouble() )
    println("Shape Name: ${square.name}")
    println("Dimensions: ")
    square.printDimensions()
    println("Area: ${square.getArea()}")

//    Circle Object
    println("Enter circle dimensions: ")
    (circle1 as Circle).setDimensions(readln().toDouble())
    println("Shape Name: ${circle1.name}")
    println("Dimensions: ")
    circle1.printDimensions()
    println("Area: ${circle1.getArea()}")

}