package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youngcarers.core.*
import com.example.youngcarers.data.api.models.Abc
import com.example.youngcarers.ui.theme.*
import com.example.youngcarers.data.api.models.Metadata
import com.example.youngcarers.screens.abc.AbcViewModel
import com.example.youngcarers.screens.about.AboutViewModel
import org.koin.androidx.compose.getViewModel


@Composable
fun AboutScreen() {

    val viewModel = getViewModel<AboutViewModel>()
    val metadata: List<Metadata> by viewModel.metadata.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorBackground)
            .verticalScroll(rememberScrollState())
            .padding(bottom = 80.dp)

    ) {

        Text(
            abc_title,
            color = colorDarkRed, //colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
        ) //TODO: backend api

        Text(
            about_body,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)
        ) //TODO: backend api

        metadata.forEach { part ->
            when (part.key) {
                "imprint" -> txt(part.title, part.content)
                "copyright" -> txt(part.title, part.content)
                "accessibility" -> txt(part.title, part.content)
                "gdpr" -> txt(part.title, part.content)
            }
            
        }
    }
}

@Composable
fun txt(title: String, content: String){
    Text(
        text = title,
        color = colorDarkRed,//colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
        fontSize = 26.sp,
        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
    )
    Text(
        text = content,
        modifier = Modifier.padding(start = 20.dp, end = 20.dp)
    )
}
/*
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    About_Screen()
}
*/