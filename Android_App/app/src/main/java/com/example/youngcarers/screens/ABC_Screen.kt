package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.youngcarers.core.*
import com.example.youngcarers.ui.theme.*


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ABC_Screen(abcList: List<ABC>, navController: NavHostController) {
    val text = remember { mutableStateOf("") }
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            //.size(100.dp)
            .fillMaxSize()
            .background(colorBackground)
            .verticalScroll(rememberScrollState())
            .padding(bottom = 80.dp)

    ) {
        Text(
            abcHeaderTxt,
            color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
        )
        Text(
            abcBodyTxt,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 40.dp, bottom = 20.dp)
        )

        for ((index, abc) in abcList.withIndex()) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)

            ) {
                Card(
                    //shape = RoundedCornerShape(4.dp),
                    backgroundColor = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        navController.navigate(NavRoutes.Detail.route)
                    }
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                        //.padding(16.dp)

                    ) {
                        Text(
                            abc.path, style = TextStyle(
                                color = Color.Black,
                                fontSize = 20.sp,
                                textAlign = TextAlign.Left
                            ), modifier = Modifier.padding(16.dp)
                        )
                        IconButton(

                            // When this button is clicked, we add the person to deletedPersonList.
                            onClick = {
                                navController.navigate(NavRoutes.Detail.route)
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
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ABCScreenPreview() {
    ABC_Screen(
        getABCList(),
        navController = NavHostController(context = LocalContext.current)
    )
}
