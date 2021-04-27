package lesson7

class Student {
    var name: String? = null
    get() {
        return if (field == null){
            " "
        } else {
            field
        }
    }

    var surname: String? = null
        get() {
            return if (field == null){
                " "
            } else {
                field
            }
        }

    var mark: Double = 0.0
}