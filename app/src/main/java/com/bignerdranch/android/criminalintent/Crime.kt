package com.bignerdranch.android.criminalintent

import java.util.Date
import java.util.UUID

data class Crime( val id: UUID = UUID.randomUUID())  {

    var name: String=""
    var date: Date=Date()
    var status: Boolean = false

    constructor(id: UUID, name : String, date: Date, status: Boolean ):this(id)
    {
        this.name = name
        this.date = date
        this.status = status
    }
}