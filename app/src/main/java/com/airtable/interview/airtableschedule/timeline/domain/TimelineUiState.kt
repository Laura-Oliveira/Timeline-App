package com.airtable.interview.airtableschedule.timeline.domain

import android.os.Build
import androidx.annotation.RequiresApi
import com.airtable.interview.airtableschedule.timeline.data.Event
import com.airtable.interview.airtableschedule.timeline.domain.Lanes

/**
 * UI state for the timeline screen.
 */
data class TimelineUiState(
    val events: List<Event> = emptyList(),
)