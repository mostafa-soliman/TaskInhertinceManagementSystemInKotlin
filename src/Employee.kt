open class Employee(var name : String ,var id : Int) {
     open var role : String = "Employee"

     open fun work():String{
          return "$name (ID: $id), who is a $role, is working on their tasks."
     }
     open fun report():String{
          return "$name (ID: $id), who is a $role, is reporting to their supervisor."
     }



}