package com.airtable.interview.airtableschedule.timeline.data

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

data class Event(val id: Int, val startDate: LocalDate, val endDate: LocalDate, val name: String)
{
    private val formatter = DateTimeFormatter.ofPattern("MMM dd", Locale.ENGLISH)

    fun getFormattedStartDate(): String = startDate.format(formatter)
    fun getFormattedEndDate(): String = endDate.format(formatter)
}