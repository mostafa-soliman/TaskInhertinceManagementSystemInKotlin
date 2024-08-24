/**
 * "Developer".
 * - Add a new property programmingLanguage of
 * type String that represents the primary
 * programming language the developer is using.
 * - Override the work() method to specify that the
 * developer is coding in a particular
 * programming language.
 * - Override the report() method to indicate that
 * the developer reports to their manager.***/

class Developer(name: String, id: Int, var programmingLanguage: String) : Employee(name, id) {

    override var role: String ="Developer"

    override fun work(): String {
        return "${super.work()}  coding in a particular  $programmingLanguage."
    }

    override fun report(): String {
        return  "${super.report()} is reporting to their manager."
    }
}