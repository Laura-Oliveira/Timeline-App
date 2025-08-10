package com.airtable.interview.airtableschedule.timeline.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.ZoneId
import java.util.Date

object SampleTimelineItems {
    private const val year = 2020

    @RequiresApi(Build.VERSION_CODES.O)
    private fun dateOf(year: Int, month: Int, day: Int): Date {
        return LocalDate.of(year, month, day)
            .atStartOfDay(ZoneId.systemDefault())
            .toInstant()
            .let { Date.from(it) }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    var timelineItems: List<Event> = listOf(
        Event(
            1,
            dateOf(year, 2, 1),
            dateOf(year, 2, 5),
            "First item"
        ),
        Event(
            2,
            dateOf(year, 2, 2),
            dateOf(year, 2, 8),
            "Second item"
        ),
        Event(
            3,
            dateOf(year, 2, 6),
            dateOf(year, 2, 13),
            "Another item"
        ),
        Event(
            4,
            dateOf(year, 2, 14),
            dateOf(year, 2, 14),
            "Another item"
        ),
        Event(
            5,
            dateOf(year, 3, 1),
            dateOf(year, 3, 15),
            "Third item"
        ),
        Event(
            6,
            dateOf(year, 2, 12),
            dateOf(year, 3, 16),
            "Fourth item with a super long name"
        ),
        Event(
            7,
            dateOf(year, 3, 1),
            dateOf(year, 3, 2),
            "Fifth item with a super long name"
        ),
        Event(
            8,
            dateOf(year, 2, 3),
            dateOf(year, 2, 5),
            "First item"
        ),
        Event(
            9,
            dateOf(year, 2, 4),
            dateOf(year, 2, 8),
            "Second item"
        ),
        Event(
            10,
            dateOf(year, 2, 6),
            dateOf(year, 2, 13),
            "Another item"
        ),
        Event(
            11,
            dateOf(year, 2, 9),
            dateOf(year, 2, 9),
            "Another item"
        ),
        Event(
            12,
            dateOf(year, 3, 1),
            dateOf(year, 3, 15),
            "Third item"
        ),
        Event(
            13,
            dateOf(year, 2, 12),
            dateOf(year, 3, 16),
            "Fourth item with a super long name"
        ),
        Event(
            14,
            dateOf(year, 3, 1),
            dateOf(year, 3, 1),
            "Fifth item with a super long name"
        )
    )
}