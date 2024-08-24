class Manager( name : String , id : Int ,var department :String):Employee(name  , id ) {
    override var role: String = "Manager"


    override fun work(): String {
        return "${super.work()} managing a particular $department."
    }

    override fun report(): String {
        return  "${super.report()} is reporting to their the company board."
    }
}