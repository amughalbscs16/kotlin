package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

interface Trait {
    var `continue`: Int
}

class TraitImpl : Trait {
    override var `continue`: Int = 0
}

class TestDelegate : Trait by TraitImpl() {
    fun test() {
        testNotRenamed("continue", { `continue` })
    }
}

fun box(): String {
    TestDelegate().test()

    return "OK"
}