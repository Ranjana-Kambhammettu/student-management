data class Marks(var math: Double,  var english: Double, var science: Double) {
    private var percentage: Double = ( math + english + science ) / 3
    public override fun toString(): String {
        return ("Math mark: "+math+" \nEnglish mark: "+english+" " +
                "\nScience mark: "+science+" \nPercentage: "+percentage)
    }
}
