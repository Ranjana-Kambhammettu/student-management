fun main()
{
    println("Hello World!")
    var ch = 'Y'
    val a = Admin()

    do
    {
        println("The menu: ")
        println("1. Login as admin")
        println("2. Login as student")
        println("3. Exit")
        println("Enter your choice: ")
        val i = Integer.valueOf(readLine())
        when (i) {
            1 -> { println("1. Enter password")
                val check = readLine()
                if (check?.let { a.passwordCheck(it) } ==true)
            {
                a.admin()
            }
            else{
                println("You entered the wrong password!")
            }}
            2 -> {
                println("Enter name: ")
                val names = readLine()
                if (names != null) {
                    println(a.searchStudentMark(names))
                }
            }
            3 -> {ch='N'}
            else -> {
                print("Wrong choice entered!")
            }
        }
        println("Do you want to continue? Enter Y if yes else press any key: ")
        ch = (readLine()!![0])
    } while (ch=='Y')
}

/*
Create a student management program with Kotlin, wherein a user can login as an admin(with appropriate credentials)
or as a student.

Let there be 3 subjects - (Math, English, Science).

The admin has the power to look at all the students' marks(Math,English,Science - Overall %)
and to modify those marks.

The students can just view their individual subject marks.
If admin modifies a particular subject marks for a given student, the overall percentage of the
student should change accordingly. */