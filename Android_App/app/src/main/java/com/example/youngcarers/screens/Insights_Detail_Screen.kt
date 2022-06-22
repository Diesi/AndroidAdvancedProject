package com.example.youngcarers.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.youngcarers.NavRoutes
import com.example.youngcarers.core.*
import com.example.youngcarers.ui.theme.*


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Insights_Detail_Screen(navController: NavHostController, viewTitle: String?) {
    val text = remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                        //*Error without txt ?*//
                        ""
                },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigateUp()//navigate(NavigationItem.Help.route)
                }) {
                    Icon(Icons.Filled.ArrowBack, "backIcon")
                }
            },
            backgroundColor = colorDarkRed,
        contentColor = Color.White,
        elevation = 10.dp
        ) },
        backgroundColor = colorBackground,
        modifier = Modifier.padding(bottom = 55.dp)
    ) {
        LazyColumn(
            Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            //horizontalAlignment = Alignment.CenterHorizontally

        ) {
            item {


                    if (viewTitle != null) {
                        Text(
                            "$viewTitle+HeaderTxt",
                            color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
                            fontSize = 35.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                        )
                    }else{
                        Text(
                            helpHeaderTxt,
                            color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
                            fontSize = 35.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                        )
                    }

                Text(
                    helpBodyTxt,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 10.dp,
                        end = 20.dp,
                        bottom = 10.dp
                    )
                )



                InsightsDetailCard(detail.header, detail.description, detail.imageRes)

                Text(
                    helpBodyTxt,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 10.dp,
                        end = 20.dp,
                        bottom = 10.dp
                    )
                )

                Card(
                    //shape = RoundedCornerShape(4.dp),
                    backgroundColor = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        navController.navigate(NavRoutes.Detail.route + "/$viewTitle")

                    }
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                        //.padding(16.dp)

                    ) {
                        Text(
                            abcHeaderTxt, style = TextStyle(
                                color = Color.Black,
                                fontSize = 20.sp,
                                textAlign = TextAlign.Left
                            ), modifier = Modifier.padding(16.dp)
                        )
                        IconButton(

                            // When this button is clicked, we add the person to deletedPersonList.
                            onClick = {
                                navController.navigate(NavRoutes.Detail.route + "/$viewTitle")

                            }
                        ) {
                            // Simple composable that allows you to draw an icon on the screen. It
                            // accepts a vector asset as the icon.
                            Icon(

                                imageVector = Icons.Filled.KeyboardArrowRight,
                                contentDescription = "Forward",
                                modifier = Modifier.padding(end = 10.dp, top = 16.dp)

                            )
                        }
                    }
                }

                Text(
                    helpBodyTxt,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 10.dp,
                        end = 20.dp,
                        bottom = 10.dp
                    )
                )

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun InsightsDetailScreenPreview() {
    Insights_Detail_Screen(
        navController = NavHostController(context = LocalContext.current),
        viewTitle = "D"
    )

}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun InsightsDetailCard(header: String, description: String, image: Int) {
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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
            //verticalAlignment = Alignment.CenterVertically,
        ) {

            Row(
                Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                /*Image(
                    painter = painterResource(id = R.drawable.picture),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    contentScale = ContentScale.Fit,

                    )*/
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

