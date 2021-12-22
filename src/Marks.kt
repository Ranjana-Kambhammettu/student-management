class Marks {

    public class Marks constructor(mathp: Double, englishp: Double, sciencep: Double)
    {
        private var math = mathp
        private var english = englishp
        private var science = sciencep
        private var average = ( math + english + science ) / 3
    }

}