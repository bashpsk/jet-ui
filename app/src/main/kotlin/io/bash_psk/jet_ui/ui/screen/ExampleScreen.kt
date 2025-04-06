package io.bash_psk.jet_ui.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ContentPaste
import androidx.compose.material.icons.filled.DeleteForever
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoveUp
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.SaveAs
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.bash_psk.jet_ui.optionbar.BottomOptionBar
import io.bash_psk.jet_ui.optionbar.OptionBarData

@Composable
fun ExampleScreen() {

    val sampleOptionList = remember {
        mutableStateListOf(
            OptionBarData(label = "Move", icon = Icons.Filled.MoveUp),
            OptionBarData(label = "Copy", icon = Icons.Filled.ContentCopy),
            OptionBarData(label = "Paste", icon = Icons.Filled.ContentPaste),
            OptionBarData(label = "Rename", icon = Icons.Filled.Edit),
            OptionBarData(label = "Delete", icon = Icons.Filled.DeleteForever),
            OptionBarData(label = "Info", icon = Icons.Filled.Info),
            OptionBarData(label = "Share", icon = Icons.Filled.Share),
            OptionBarData(label = "Like", icon = Icons.Filled.Favorite),
            OptionBarData(label = "Search", icon = Icons.Filled.Search),
            OptionBarData(label = "Refresh", icon = Icons.Filled.Refresh),
            OptionBarData(label = "Save", icon = Icons.Filled.SaveAs),
            OptionBarData(label = "Open With", icon = Icons.AutoMirrored.Filled.OpenInNew)
        )
    }

    Scaffold(
        bottomBar = {

            BottomOptionBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(insets = BottomAppBarDefaults.windowInsets),
                optionList = sampleOptionList,
                onOptionClick = { option ->

                    println("OPTION PERFORM : $option")
                }
            )
        }
    ) { paddingValue ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue)
                .background(MaterialTheme.colorScheme.background)
        )
    }
}