package com.airtable.interview.airtableschedule.timeline.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.airtable.interview.airtableschedule.timeline.data.Event
import com.airtable.interview.airtableschedule.timeline.domain.TimelineViewModel
import com.airtable.interview.airtableschedule.timeline.ui.theme.AirtableScheduleTheme

/**
 * A screen that displays a timeline of events.
 */
@Composable
fun TimelineScreen(
    viewModel: TimelineViewModel = viewModel()
)
{
    AirtableScheduleTheme {
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()
        TimelineView(uiState.events)
        TimelineView(uiState.events)
    }
}

/**
 * A view that displays a list of events in swimlanes format.
 * TODO: Replace the exiting list with Swimlanes
 *
 * @param events The list of events to display.
 */
@Composable
private fun TimelineView(
    events: List<Event>,
)
{
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    )
    {
        events.forEach {
            EventView(event = it)
        }
    }
}

/**
 * Single event view.
 * TODO: This needs to be updated as needed
 */
@Composable
private fun EventView(event: Event)
{
    Surface(
        color = MaterialTheme.colorScheme.surface,
        shape = RoundedCornerShape(12.dp),
        tonalElevation = 2.dp,
        shadowElevation = 1.dp,
        modifier = Modifier.fillMaxWidth()
    )
    {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
        )
        {
            Text(
                text = event.name,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Row (modifier = Modifier.fillMaxWidth())
            {
                Text(
                    text = "(${event.getFormattedStartDate()} - ",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primaryContainer

                )
                if (event.startDate != event.endDate)
                {
                    Text(
                        text = "${event.getFormattedEndDate()})",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.primaryContainer
                    )
                }
            }

            HorizontalDivider(
                color = MaterialTheme.colorScheme.secondary,
                thickness = 1.dp
            )
        }
    }
}