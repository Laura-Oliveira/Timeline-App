package com.airtable.interview.airtableschedule.timeline.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = ColorPrimary,
    secondary = ColorPrimaryVariant,
    background = ColorMediumGray,
    onBackground = ColorDarkGray,
    surface = White
)

@Composable
fun AirtableScheduleTheme(content: @Composable () -> Unit)
{
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}