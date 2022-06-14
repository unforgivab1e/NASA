package exception

import kotlin.reflect.KClass

class FormException (override val message: String? ) : RuntimeException() {
    override fun toString(): String {
        return message.toString()
    }
}
