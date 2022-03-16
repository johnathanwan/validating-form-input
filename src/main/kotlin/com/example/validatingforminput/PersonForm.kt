package com.example.validatingforminput

import javax.validation.constraints.*

class PersonForm {
    @NotNull
    @Size(min = 2, max = 30)
    var name: String? = null

    @NotNull
    @Min(18)
    var age: Int? = null
    override fun toString(): String {
        return "Person(Name: $name, Age: $age)"
    }
}