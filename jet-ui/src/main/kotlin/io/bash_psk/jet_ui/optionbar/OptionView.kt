package io.bash_psk.jet_ui.optionbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
internal fun OptionView(
    optionData: () -> OptionBarData,
    onOptionClick: (option: OptionBarData) -> Unit = {}
) {

    Column(
        modifier = Modifier
            .clip(shape = MaterialTheme.shapes.extraSmall)
            .clickable(
                onClick = {

                    onOptionClick(optionData())
                }
            )
            .padding(vertical = 12.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            modifier = Modifier.size(size = 20.dp),
            imageVector = optionData().icon,
            contentDescription = optionData().label
        )

        Spacer(modifier = Modifier.height(height = 8.dp))

        Text(
            text = optionData().label,
            textAlign = TextAlign.Center,
            maxLines = 1,
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis
        )
    }
}