package com.example.youngcarers.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youngcarers.About_Screen
import com.example.youngcarers.core.*
import com.example.youngcarers.ui.theme.*


@Composable
fun Detail_Screen(){

    Column(
        modifier = Modifier
        //.size(100.dp)
        .fillMaxSize()
        .background(colorBackground)
        .verticalScroll(rememberScrollState())
        .padding(bottom = 80.dp)

    ) {

            Text(
                aboutHeaderTxt,
                color = colorDarkRed,//colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp, top = 60.dp)
            )
            Text(
                aboutBodyTxt,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)
            )

    }
}


@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    Detail_Screen()
}
