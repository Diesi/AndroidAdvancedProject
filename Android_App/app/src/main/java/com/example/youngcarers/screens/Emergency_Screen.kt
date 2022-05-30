package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.youngcarers.ui.theme.*

@Composable
fun Emergency_Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorBackground)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Emergency View",
            fontWeight = FontWeight.Bold,
            color = colorDarkRed,//Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun EmergencyScreenPreview() {
    Emergency_Screen()
}

