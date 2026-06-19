package com.langlong.serveradmin.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.Surface
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(onAdd: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Text(text = "LangLong - Servers")
            Button(onClick = onAdd) {
                Text("Add Server")
            }
        }
    }
}
