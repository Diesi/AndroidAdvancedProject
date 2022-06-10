package com.example.youngcarers

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.youngcarers.core.*
import com.example.youngcarers.screens.Detail_Screen
import com.example.youngcarers.ui.theme.*
import java.util.*

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Emergency_Screen(emgList: List<Emergency>, telList: List<Tel>, navController: NavHostController) {

    Scaffold(
        backgroundColor = colorBackground,
        modifier = Modifier.padding(bottom = 55.dp)
    ) {
        LazyColumn(
            Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            //horizontalAlignment = Alignment.CenterHorizontally

        ) {
            item {

                Text(
                    emgHeaderTxt,
                    color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                )
                Text(
                    emgbodyTxt,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 10.dp,
                        end = 20.dp,
                        bottom = 10.dp
                    )
                )
                Text(
                    emgNotfallTxt,
                    modifier = Modifier
                        .padding(
                            top = 40.dp,
                            start = 40.dp,
                            end = 40.dp
                        )
                )
           
            
            Row(modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()) {
                for (numbers in getTelList()){
                    TellCard(header = numbers.header)
                }
                    /*items(telList) { tel ->
                        TellCard(tel.header)
                    }*/
            }
            }

            item {
                Text(
                    emgVorb,
                    modifier = Modifier
                        .padding(
                            top = 20.dp,
                            start = 20.dp,
                            end = 40.dp
                        )
                )
            }
            items(emgList) { emg ->
                EmergencyCard(emg.header, emg.description, emg.imageRes, navController)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun EmergencyScreenPreview() {
    Emergency_Screen(
        getEmergencyList(),
        getTelList(),
        navController = NavHostController(context = LocalContext.current)
    )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EmergencyCard(header: String, description: String, image: Int, navController: NavHostController) {
    val viewTitle = "EMG"
    val text = remember { mutableStateOf("") }
    val mContext = LocalContext.current
    Card(
        modifier = Modifier
            // The space between each card and the other
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(15.dp)),
        onClick = {
            navController.navigate(NavRoutes.Detail.route + "/$viewTitle")
        },
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
            //verticalAlignment = Alignment.CenterVertically,
        ) {

            Row(
                Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.picture),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    contentScale = ContentScale.Fit,

                    )
                Text(

                    text = header,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),

                    )

            }
            Text(
                text = description,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(start = 30.dp, bottom = 15.dp, end = 30.dp)
            )
        }

    }

}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TellCard(header: String) {

    val text = remember { mutableStateOf("") }
    val mContext = LocalContext.current
    Card(
        modifier = Modifier
            // The space between each card and the other
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(15.dp)),
        onClick = {

        },
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface

    ) {


        Row(
            modifier = Modifier
                .padding(8.dp),

            verticalAlignment = Alignment.CenterVertically,

            ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_phone_red),
                contentDescription = null,
                tint = colorDarkRed,
                modifier = Modifier
                    .size(width = 40.dp, height = 40.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(15.dp)),


                )
            Text(

                text = header,
                color = colorDarkRed,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),

                )

        }


    }

}


