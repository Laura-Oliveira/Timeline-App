package com.airtable.interview.airtableschedule.timeline.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = ColorPrimary,
    onPrimary = ColorOnPrimary,
    primaryContainer = ColorPrimaryVariant,
    secondary = ColorSecondary,
    onSecondary = ColorAccent,
    secondaryContainer = ColorSecondaryVariant,
    background = ColorBackground,
    onBackground = ColorOnBackground,
    surface = ColorSurface,
    onSurface = ColorOnSurface
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