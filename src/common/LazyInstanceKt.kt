package common

class LazyInstanceKt {
    var instance: LazyInstanceKt? = null

    companion object {
        val instance: LazyInstanceKt by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { LazyInstanceKt() }
        var instance2: LazyInstanceKt? = null
        fun getInstance3(): LazyInstanceKt = instance2 ?: synchronized(this) {
            instance2 ?: LazyInstanceKt().also {
                instance2 = it
            }
        }
    }
}