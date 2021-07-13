package com.jetbrains.core

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

actual class AppCoroutineScope : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = TODO("Not yet implemented")
}