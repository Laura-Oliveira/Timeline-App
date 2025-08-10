package com.airtable.interview.airtableschedule.timeline.ui

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.airtable.interview.airtableschedule.timeline.data.Event
import com.airtable.interview.airtableschedule.timeline.domain.TimelineViewModel
import com.airtable.interview.airtableschedule.timeline.ui.theme.AirtableScheduleTheme
import androidx.compose.ui.res.painterResource

/**
 * A screen that displays a timeline of events.
 */
@Composable
fun TimelineScreen(
    viewModel: TimelineViewModel = viewModel()
) {
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
fun TimelineView(events: List<Event>)
{
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    )
    {
        Column(
            modifier = Modifier.fillMaxSize().padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            // Screen title
            Text(
                text = "Airtable Events",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colorScheme.surface,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            HorizontalDivider(
                modifier = Modifier
                    .width(200.dp)
                    .height(2.dp),
                color = MaterialTheme.colorScheme.surface
            )
        }

        events.forEach { event ->
            EventView(event = event)
        }
    }
}

/**
 * Single event view.
 * TODO: This needs to be updated as needed
 */
@Composable
fun EventView(event: Event)
{
    val barColor = MaterialTheme.colorScheme.primary

    Surface(
        shape = RoundedCornerShape(12.dp),
        tonalElevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
    )
    {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onBackground)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            // Image
            Image(
                painter = painterResource(id = R.drawable.ic_menu_my_calendar),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(8.dp))
            )

            Spacer(modifier = Modifier.width(12.dp))

            // Vertical colored bar
            Box(
                modifier = Modifier
                    .width(6.dp)
                    .fillMaxHeight()
                    .background(barColor, RoundedCornerShape(3.dp))
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f))
            {
                // Dates row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    //Start Date
                    Text(
                        text = event.getFormattedStartDate(),
                        style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold),
                        color = barColor
                    )
                    //End Date
                    Text(
                        text = event.getFormattedEndDate(),
                        style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold),
                        color = barColor
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                // Event title
                Text(
                    text = event.name,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colorScheme.surface
                )
            }
        }
    }
}