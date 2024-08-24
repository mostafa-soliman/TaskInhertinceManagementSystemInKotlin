class Developer(name: String, id: Int, var programmingLanguage: String) : Employee(name, id) {

    override var role: String ="Developer"

    override fun work(): String {
        return "${super.work()}  coding in a particular  $programmingLanguage."
    }

    override fun report(): String {
        return  "${super.report()} is reporting to their manager."
    }
}