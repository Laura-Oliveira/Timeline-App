package com.airtable.interview.airtableschedule.timeline.domain

import com.airtable.interview.airtableschedule.timeline.data.Event

/**
 * UI state for the timeline screen.
 */
data class TimelineUiState(val events: List<Event> = emptyList())