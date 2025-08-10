package com.airtable.interview.airtableschedule

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.airtable.interview.airtableschedule.timeline.ui.TimelineScreen
import com.airtable.interview.airtableschedule.timeline.ui.theme.AirtableScheduleTheme

class MainView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AirtableScheduleTheme {
                TimelineScreen()
            }
        }
    }
}
