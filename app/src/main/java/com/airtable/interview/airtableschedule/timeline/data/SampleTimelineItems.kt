package com.airtable.interview.airtableschedule.timeline.data

import java.time.LocalDate

object SampleTimelineItems
{
    private const val year = 2020 - 1900

    var timelineItems: List<Event> = listOf(
        Event(
            1,
            LocalDate.of(year, 2, 1),
            LocalDate.of(year, 2, 5),
            "First item"
        ),
        Event(
            2,
            LocalDate.of(year, 2, 2),
            LocalDate.of(year, 2, 8),
            "Second item"
        ),
        Event(
            3,
            LocalDate.of(year, 2, 6),
            LocalDate.of(year, 2, 13),
            "Another item"
        ),
        Event(
            4,
            LocalDate.of(year, 2, 14),
            LocalDate.of(year, 2, 14),
            "Another item"
        ),
        Event(
            5,
            LocalDate.of(year, 3, 1),
            LocalDate.of(year, 3, 15),
            "Third item"
        ),
        Event(
            6,
            LocalDate.of(year, 2, 12),
            LocalDate.of(year, 3, 16),
            "Fourth item with a super long name"
        ),
        Event(
            7,
            LocalDate.of(year, 3, 1),
            LocalDate.of(year, 3, 2),
            "Fifth item with a super long name"
        ),
        Event(
            8,
            LocalDate.of(year, 2, 3),
            LocalDate.of(year, 2, 5),
            "First item"
        ),
        Event(
            9,
            LocalDate.of(year, 2, 4),
            LocalDate.of(year, 2, 8),
            "Second item"
        ),
        Event(
            10,
            LocalDate.of(year, 2, 6),
            LocalDate.of(year, 2, 13),
            "Another item"
        ),
        Event(
            11,
            LocalDate.of(year, 2, 9),
            LocalDate.of(year, 2, 9),
            "Another item"
        ),
        Event(
            12,
            LocalDate.of(year, 3, 1),
            LocalDate.of(year, 3, 15),
            "Third item"
        ),
        Event(
            13,
            LocalDate.of(year, 2, 12),
            LocalDate.of(year, 3, 16),
            "Fourth item with a super long name"
        ),
        Event(
            14,
            LocalDate.of(year, 3, 1),
            LocalDate.of(year, 3, 1),
            "Fifth item with a super long name"
        )
    )
}