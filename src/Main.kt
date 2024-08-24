/****
 * 3. Demonstrate Polymorphism:
 * -> In your main function, create an instance of either
 * Manager or Developer, but store it in a variable of type
 * Employee.
 * -> Call the work() and report() methods on this polymorphic
 * ->bject and observe how the overridden methods in the
 * respective child class are executed.
 * -> For example, create a Manager object and store it as an
 * Employee, then call the work() and report() methods to
 * see the Manager-specific behavior
 * ****/
fun main() {

    val manager:Employee = Manager("mostafa Soliman" ,546,"Android")
    val developer = Employee("said Hanfi" ,56)
    println(manager.work())
    println(manager.report())
    println(developer.work())
    println(developer.report())

    val developerJava:Employee = Developer("Ali", 255, "Java")
    println(developerJava.work())
    println(developerJava.report())
    val polymorphic = Manager("mostafa", 25, "Front End")

    println(polymorphic.work())
    println(polymorphic.report())

}


