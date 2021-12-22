import kotlin.text.*;
fun main()
{
    println("Hello World!")
    var ch = 'Y'
    val a = Admin()
    val s = Student()
    do
    {
        println("The menu: ")
        println("1. Login as admin")
        println("2. Login as student")
        println("3. Exit")
        println("Enter your choice: ")
        when (Integer.valueOf(readLine())) {
            1 -> {print("x == 1")}
            2 -> {print("x == 2")}
            3 -> {print("x == 3")}
            else -> {
                print("Wrong choice entered!")
            }
        }
        println("Do you want to continue? Enter Y if yes else press any key: ")
        ch = (readLine()!![0])
    } while (ch=='Y')
}

/*Hello everyone!

Create a student management program with Kotlin, wherein a user can login as an admin(with appropriate credentials)
or as a student.

Let there be 3 subjects - (Math, English, Science).

The admin has the power to look at all the students' marks(Math,English,Science - Overall %)
and to modify those marks.

The students can just view their individual subject marks.
If admin modifies a particular subject marks for a given student, the overall percentage of the
student should change accordingly.

The deadline to submit this is 23rd December 2021, Thursday.

We will be rolling out a form where you can submit your assignment.*/