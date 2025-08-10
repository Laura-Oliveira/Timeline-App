package com.airtable.interview.airtableschedule.timeline.domain

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel responsible for managing the state of the timeline screen.
 */
class TimelineViewModel: ViewModel() {
    private val eventDataRepository: EventDataRepository = EventDataRepositoryImpl()

    val uiState: StateFlow<TimelineUiState> = eventDataRepository
        .getTimelineItems()
        .map(::TimelineUiState)
        .stateIn(
            viewModelScope,
            initialValue = TimelineUiState(),
            started = SharingStarted.Companion.WhileSubscribed()
        )
}