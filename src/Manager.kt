/**2. Create Child Classes to Extend Functionality:
o Define two classes, Manager and Developer, that inherit
from the Employee class:
- Manager Class:
- Override the role property with the value "Manager".
- Add a new property department of type String that represents the department the manager
oversees.
- Override the work() method to specify that the manager is managing a particular department.
- Override the report() method to indicate that
the manager reports to the company board.
- Developer Class:
- Override the role property with the value**/

class Manager( name : String , id : Int ,var department :String):Employee(name  , id ) {
    override var role: String = "Manager"


    override fun work(): String {
        return "${super.work()} managing a particular $department."
    }

    override fun report(): String {
        return  "${super.report()} is reporting to their the company board."
    }
}