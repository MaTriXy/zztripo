package com.tikalk.zztripo.zztripo

/**
 * A thread unsafe lazy function.
 * This function 'must' be called only on single thread.
 */
fun <T> unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)
