class WInvoke {
    operator fun <caret>invoke(body: () -> Unit) { }
}

class Second {
    val testInvoke = WInvoke()
}

fun boo(s: Second?, body: () -> Unit) { }

fun foo(s: Second?) {
    boo(s) {
        s?.testInvoke {
            "Hello"
        }
    }
}

// NAME: get