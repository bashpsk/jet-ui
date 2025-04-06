package io.bash_psk.jet_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import io.bash_psk.jet_ui.ui.screen.ExampleScreen
import io.bash_psk.jet_ui.ui.theme.JetUITheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            JetUITheme {

                ExampleScreen()
            }
        }
    }
}