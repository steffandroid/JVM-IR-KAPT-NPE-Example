package com.example.jvmirkaptnpe

import kotlinx.serialization.Serializable

@Serializable
data class Foo(
    val value: String = "Example"
)
