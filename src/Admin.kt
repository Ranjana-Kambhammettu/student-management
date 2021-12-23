import java.util.Scanner
class Admin {
    private val password: String = "123456"
    private var markList: HashMap<String, Marks> = HashMap()

    fun passwordCheck(check: String): Boolean{
        if (check==password)
            return true
        return false
    }
    private fun addStudentMark() {
        println("Enter student name:")
        val name= readLine().toString()
        val read = Scanner(System.`in`)
        println("Enter the Math mark")
        val mathMark =  read.nextDouble()
        println("Enter the English mark")
        val englishMark =  read.nextDouble()
        println("Enter the Science mark")
        val scienceMark =  read.nextDouble()
        markList[name] = Marks(mathMark, englishMark, scienceMark)
    }

    private fun modifyStudentMark() {
        val read = Scanner(System.`in`)
        println("Enter student name:")
        val nTemp= readLine().toString()
        println("The menu: ")
        println("1. Math mark")
        println("2. English mark")
        println("3. Science mark")
        when(Integer.valueOf(readLine())){
            1 -> { println("Enter the new mark")
                val mathMark =  read.nextDouble()
                val mTemp = markList[nTemp]?.let {  it1 ->
                        Marks(mathMark,
                            it1.english, it1.science ) }
                if (mTemp != null) {
                    markList[nTemp] = mTemp
                }
            }
            2 -> {println("Enter the new mark")
                val englishMark =  read.nextDouble()
                val mTemp = markList[nTemp]?.let {  it1 ->
                    Marks(it1.math,
                        englishMark , it1.science ) }
                if (mTemp != null) {
                    markList[nTemp] = mTemp
                }}
            3 -> {println("Enter the new mark")
                val scienceMark =  read.nextDouble()
                val mTemp = markList[nTemp]?.let {  it1 ->
                    Marks(it1.math,
                        it1.english, scienceMark ) }
                if (mTemp != null) {
                    markList[nTemp] = mTemp
                }}
            else -> {
                print("Wrong choice entered!")
            }
        }
    }

    fun searchStudentMark(nTemp: String): Marks {
        return markList[nTemp]!!
    }

    fun admin() {
        var ch='Y'
        do
        {
            println("The menu: ")
            println("1. Add a student and their marks")
            println("2. Modify student's marks")
            println("3. Search student's marks")
            println("Enter your choice: ")
            val i = Integer.valueOf(readLine())
            when (i) {
                1 -> {
                        addStudentMark()
                    }
                2 -> {
                    modifyStudentMark()
                }
                3 -> {println("Enter student name:")
                    val nTemp= readLine().toString()
                    println(searchStudentMark(nTemp).toString())}
                else -> {
                    print("Wrong choice entered!")
                }
            }
            println("Do you want to continue? Enter Y if yes else press any key: ")
            ch = (readLine()!![0])
        } while (ch=='Y')
    }
}