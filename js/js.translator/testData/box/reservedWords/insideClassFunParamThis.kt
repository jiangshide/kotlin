package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    fun foo(`this`: String) {
    assertEquals("123", `this`)
    testRenamed("this", { `this` })
}

    fun test() {
        foo("123")
    }
}

fun box(): String {
    TestClass().test()

    return "OK"
}