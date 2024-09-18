class EquilateralTriangle(_name: String ="EquilateralTriangle") : Triangle(_name) {

    fun setDimensions(side: Double){
        super.setDimensions(side, side, side)
    }

}