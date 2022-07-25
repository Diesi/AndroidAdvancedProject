package com.example.youngcarers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youngcarers.cards.EmergencyNumberCard
import com.example.youngcarers.cards.InsightsDetailCard
import com.example.youngcarers.core.*
import com.example.youngcarers.screens.emergency.EmergencyViewModel
import com.example.youngcarers.ui.theme.colorBackground
import com.example.youngcarers.ui.theme.colorDarkRed
import org.koin.androidx.compose.getViewModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EmergencyScreen(
    onClick: (Int) -> Unit
) {

    val viewModel = getViewModel<EmergencyViewModel>()

    Scaffold(
        backgroundColor = colorBackground,
        modifier = Modifier.padding(bottom = 55.dp)
    ) {
        LazyColumn(
            Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)

        ) {
            item {

                Text(
                    emergency_title,
                    color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                )
                Text(
                    emergency_quick_help,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 10.dp,
                        end = 20.dp,
                        bottom = 10.dp
                    )
                )
                Text(
                    emergency_intro_calls,
                    modifier = Modifier
                        .padding(
                            top = 40.dp,
                            start = 40.dp,
                            end = 40.dp
                        )
                )



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    for (number in getPhoneList()) {
                        EmergencyNumberCard(title = number.header)
                    }
                }
            }

            item {
                Text(
                    emergency_title_preparation,
                    modifier = Modifier
                        .padding(
                            top = 20.dp,
                            start = 20.dp,
                            end = 40.dp
                        )
                )
            }
            items(getEmergencyList()) { emergency ->
                InsightsDetailCard(
                    emergency.header,
                    emergency.description,
                    emergency.imageRes,
                    onClick = onClick,
                    emergency_url
                )
                //TODO: add url from api
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun EmergencyScreenPreview() {
    EmergencyScreen(
        onClick = {}
    )
}




