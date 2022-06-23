package com.example.youngcarers

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
import com.example.youngcarers.core.*
import com.example.youngcarers.ui.theme.*

@Composable
fun About_Screen() {
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
        Text(
            aboutHeaderImpTxt,
            color = colorDarkRed,//colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutBodyImpTxt1,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutBodyImpTxt2 , modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(
            aboutBodyImpTxt3, modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(
            aboutBodyImpTxt4,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(
            aboutHeaderCopyTxt,
            color = colorDarkRed,//colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutBodyCopyTxt,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutHeaderBarrTxt,
            color = colorDarkRed,//colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutBodyBarrTxt,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutHeaderDatenTxt,
            color = colorDarkRed,//colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            aboutBodyDatenTxt,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    About_Screen()
}
