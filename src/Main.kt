/****
 * Task: Inhertince Management System in Kotlin
 * 1. Create a Parent Class:
 * -> Define a class named Employee that represents a generic
 * employee with the following characteristics:
 *
 * - Properties:
 * - name: A String representing the employee's name.
 * - id: An Int representing the employee's ID.
 * - role: A String property, defined inside the class body, with the default value "Employee".
 *
 * - Methods:
 * - work(): A method that returns a String
 * indicating what work the employee is doing.
 * This method should use the role property in its  return value.
 * - report(): A method that returns a String
 * indicating to whom the employee is reporting.
 *
 * *************************************************************************** *
 *
 * 2. Create Child Classes to Extend Functionality:
 * -> Define two classes, Manager and Developer, that inherit from the Employee class:
 * - Manager Class:
 * - Override the role property with the value
 * "Manager".
 * - Add a new property department of type String
 * that represents the department the manager oversees.
 * - Override the work() method to specify that the
 * manager is managing a particular department.
 * - Override the report() method to indicate that
 * the manager reports to the company board.
 * - Developer Class:
 * - Override the role property with the value
 * "Developer".
 * - Add a new property programmingLanguage of
 * type String that represents the primary
 * programming language the developer is using.
 * - Override the work() method to specify that the
 * developer is coding in a particular
 * programming language.
 * - Override the report() method to indicate that
 * the developer reports to their manager.
 *
 *  * *************************************************************************** *
 *
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

}