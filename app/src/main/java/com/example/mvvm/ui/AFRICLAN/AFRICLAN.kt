@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mvvm.ui.AFRICLAN

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.Typography
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.mvvm.navigation.ROUTE_AFRICLAN



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AFRICLAN(navController: NavController) {


    LazyColumn {

        item {
            Spacer(modifier = Modifier.width(10.dp))
            Spacer(modifier = Modifier.height(30.dp))
            Column {

//
//
                Row {
                    Spacer(modifier = Modifier.width(10.dp))
                    Spacer(modifier = Modifier.height(40.dp))


                    Card {
                        Row {

//                            Card(
//                                colors = CardDefaults.cardColors(
//                                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
//                                ),
//                                modifier = Modifier
//                                    .size(width = 240.dp, height = 100.dp)
//                            ) {
//                                Text(
//                                    text = "Filled",
//                                    modifier = Modifier
//                                        .padding(16.dp),
//
//                                )
//                            }


                            AsyncImage(
                                model = "https://i.pinimg.com/originals/6c/5e/02/6c5e0221a4ecb07d699128c4743bbe42.jpg",
                                contentDescription = null,


                                modifier = Modifier
                                    .size(50.dp)


                            )
                            TextField(
                                value = "",
                                onValueChange = {},
                                placeholder = { Text("SELECT YOUR CATEGORY") },
                                leadingIcon = {
                                    Icon(
                                        Icons.Default.Search,
                                        contentDescription = null
                                    )
                                },
                                shape = RoundedCornerShape(20.dp),
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(bottom = 5.dp)
                            )


                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                LazyRow {
                    item {
                        Spacer(modifier = Modifier.width(10.dp))
                        Row(

                            modifier = Modifier

                                .padding(1.dp)
                                .background(Color.Black)
                                .fillMaxWidth()
                                .fillMaxHeight(),


                            )

                        {

                            Spacer(modifier = Modifier.height(40.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/6c/5e/02/6c5e0221a4ecb07d699128c4743bbe42.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(20f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://images.halloweencostumes.com.au/products/91462/2-2-268690/opposuits-shiny-snake-mens-suit-alt-2.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.height(20.dp))
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://i2.wp.com/mybiohub.com/wp-content/uploads/2016/06/Uche-Nnaji.jpg?resize=410%2C640",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/c5/24/ba/c524ba1521d62beaecfe1d5433d9355a.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://www.couturecrib.com/wp-content/uploads/2019/07/Combining-Colors-of-Different-Senator-Wears-For-Males.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://ankarafashion.com.ng/wp-content/uploads/2019/04/IMG_20190409_182816_463.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://1.bp.blogspot.com/-bGajWcrvXs4/YPzV9WCvp_I/AAAAAAABXt8/KbAhcpvYP7osiKXkoztgv42bOxUsWefQACLcBGAsYHQ/s1080/whitescollections_20210724_129.png",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.umXd6ntctR9RY4Ec-u-h2wHaML?rs=1&pid=ImgDetMain",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.1whIIuOlTwzS0W6X67rxwQHaHa?rs=1&pid=ImgDetMain",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/9d/f0/1c/9df01c9176efc28029191f199f11776e.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://www-konga-com-res.cloudinary.com/w_auto,f_auto,fl_lossy,dpr_auto,q_auto/media/catalog/product/U/Z/140925_1666347295.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(30f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://i.pinimg.com/236x/df/83/d8/df83d89040fe091b9a24020e8b883a5a.jpg?nii=t",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }
                            }

                            Spacer(modifier = Modifier.width(20.dp))
                            Card(
                                modifier = Modifier
                                    .width(100.dp)
                            ) {

                                Row {


                                    Box(
                                        Modifier
                                            .rotate(20f)
                                            .size(100.dp)
                                            .background(Color.Black)


                                    ) {


                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/16/81/17/168117cb69ad43b0350377d868b48dd5--punk-mens-fashion.jpg",
                                            contentDescription = null,


                                            modifier = Modifier
                                                .size(300.dp)


                                        )


                                    }

                                }

                            }


                        }

                    }
                }


//


                Spacer(modifier = Modifier.height(20.dp))
//            Card() {
//
//
//            }

                Spacer(modifier = Modifier.height(20.dp))


                LazyRow {
                    item {
                        Spacer(modifier = Modifier.width(10.dp))

                        Card {
                            Text(
                                "MEN",
                                modifier = Modifier
                                    .clickable { navController.navigate(ROUTE_AFRICLAN) }
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))
                        Card {
                            Text(
                                "MEN'S SENATOR WEAR",
                                modifier = Modifier
                                    .clickable { navController.navigate(ROUTE_AFRICLAN) }
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))
                        Card {
                            Text(
                                "MEN'S CASUAL WEAR",
                                modifier = Modifier
                                    .clickable { navController.navigate(ROUTE_AFRICLAN) }
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Card {
                            Text(
                                "MEN'S OFFICE WEAR ",
                                modifier = Modifier
                                    .clickable { navController.navigate(ROUTE_AFRICLAN) }
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))
//                    Card {
//                        Text(
//                            "about",
//                            modifier = Modifier
//                                .clickable { navController.navigate(ROUTE_Cappuccino) }
//                        )
//
//                    }

//
//                        Button(onClick = {
//                            //your onclick code here
//                        }) {
//                            Text(text = "Click ", color = Color.Magenta)
//                            Text(text = "Here", color = Color.Green)
//                        }


                        Spacer(modifier = Modifier.width(20.dp))
                        Card {
                            Text(
                                "BOY'S  WEAR",
                                modifier = Modifier
                                    .clickable { navController.navigate(ROUTE_AFRICLAN) }
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            LazyRow {
                item {

//


                    Spacer(modifier = Modifier.width(10.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.etsystatic.com/26526080/r/il/99e1e2/5273797671/il_794xN.5273797671_kqc5.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Madhu Couture White Coat")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text(
                                        "Price:USD 127.20"
                                    )

//                                        FloatingActionButton(
//                                            onClick = { onClick() },
//                                        ) {
//                                            Icon(Icons.Filled.Add, "Floating action button.")
//                                        }


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/dc/4c/81/dc4c81e46a2a32b8ed857f7bae91ae2e.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("SUIT")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("Price:USD 127.20")
                            }


                        }




                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th?id=OIF.W1r%2bWMSb2da%2fWdkLVO2FNg&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("SUIT")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("Price:USD 127.20")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/5b/c4/6f/5bc46fe2acb7cd9eb145f6f72dc3d517.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,


                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


//                    checked suites


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/e3/1e/36/e31e36afc7c38e2ba8259ae08deea1da.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.DH0cIzHzDr6F6yFUBkNlygHaHa?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.40WZvyOlfzaUdtz4pgNvLgHaJj?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.10d31d8be16a6fbf0dc8d869deac092b?rik=%2f8sokUbVzSjTTw&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.q4UP6P4JmPjpjaptcjIKugHaJI?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.owuCNzhsiFJB27EErxQZ_QHaM6?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/45/bb/39/45bb390591ad9559564ffa974313b759.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/45/bb/39/45bb390591ad9559564ffa974313b759.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.WRddm7AaPdYzaQ5mJQNcawHaKt?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://pbs.twimg.com/media/DcHI-b2VwAUq5_N.jpg:large",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/27/17/01/2717019449b02ca5395c54c24d237f15.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Denim Suits For Guys")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                        }


                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))


//            mens senetor


            LazyRow {
                item {

//


                    Spacer(modifier = Modifier.width(10.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.H1BvDyMF24nTmngThzJPvAHaJq?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Senetor wear clasic  ")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.nairaland.com/attachments/12034499_10_jpeg549cfc258b5b09317e51edf0d640cf8d",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }




                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/3f/41/5f/3f415f3aed472fd3e5bf495836b9c177.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text(" wedding suit/dashiki")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/7b/3b/ae/7b3bae2ecdf30c436d77b495219f4105.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text(" Agbada suit ")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.Mc8VrLLKoQtWhtxBk-wi6wHaJI?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Oba  Men clothing")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.jSqlelLc3NwFqcf4f7qFZAHaJO?w=822&h=1024&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Senator Styles  Men")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.GZZ0iMV0jb6RQyb8ryA9pQHaJH?w=720&h=886&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.10z4u9uXTyJuD0fT8hAh6wHaIl?w=600&h=695&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Stylish Senator men")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 123.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/38/d7/e5/38d7e55be3a1c91942d91414f66a6c28.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Senator Classic men")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 130.67")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.6xoBPXTO33GjxRX8FSMUZAAAAA?w=324&h=400&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Senator Styles  Men")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.etsystatic.com/22246692/r/il/c62b35/2219724479/il_1588xN.2219724479_5qeo.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("kaftang kitenge sleave")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.SaI5gVRNkqqkP2DBUbGLOAHaLc?w=1588&h=2454&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Senator wear")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.29f7ceeefd891c2df2fb63b4a5c057a4?rik=adu9JBnC%2f9Wo9A&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("senator African men")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Senator Styles  Men")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.dZ-eyF1NGtQm9Olep_XFhgHaJP?w=680&h=849&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Senator Styles  Men")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.3d9fb28f6436e6927fd01172015693a7?rik=48d6ModDCA2fjA&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("ATHUKU STYLE SENATOR")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                        }


                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))


//casual wear


            LazyRow {
                item {

//


                    Spacer(modifier = Modifier.width(10.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.VeOhIjQU9CPkdTeSRBkxQAHaNK?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("RAGED OUTFIT")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.CprHq5PM82kf-EGkGfzH_QHaLF?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("SPRINGED OUTFIT")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }




                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th?id=OIF.aIt51VbOUT%2bcM3UQtyLv8A&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("KYLE ESTLY STYLE")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/25/81/1d/25811df4af03cb4239bbe9fcf5e36474.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("STREET WEAR")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIF.gXZ94V30T8GRHOrQJ4HaeQ?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("CAGO PANTS")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.6de66abe141f44714f7f325d248f3a4b?rik=rQvt%2bZsTVSGmiA&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("COOLEST STREEET WEAR")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://litb-cgis.rightinthebox.com/images/640x640/202411/bps/product/inc/geelyr1730970005282.jpg?fmt=webp&v=1",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("MENS WAFFLE T-SHIRT")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.DydqKJ-cJMslz-RQs0c_ZAAAAA?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("BULLABO SHORT ")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIF.wV4Jh37p0SeNXeHPjEzzNg?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("STREET WEAR  ")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/fb/b3/f3/fbb3f39caaf1957b122cadea4805a42f.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("DENIM JACKET ")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.7d643d8f62615c1a8e8895c745d8bb1d?rik=%2bSJnsw0tP1URvg&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("CLASIC STREET WEAR")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.10f59a7f7a10133cde0a298d1227aa4d?rik=8mQvc9Bta5bvsw&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("WEAR ME AFRICA")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.17480512f98771b8605d87fcdce5699d?rik=TCegcQ3SCuxvng&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("SWASHAND MEN ")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://footwearnews.com/wp-content/uploads/2015/07/mr-hare.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("ALTIMATE CASUAL")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.dB_7r82KilgDYwqlWbFJEQAAAA?w=474&h=782&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("ANKARA CASUAL")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.bYNEIBPr4sdX_97-bLJXYAHaLH?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("UBAN CASUAL")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                        }


                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))

//EMBROIDER CLOTHS


            LazyRow {
                item {

//


                    Spacer(modifier = Modifier.width(10.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.RX26tWcj7q6A5IZSaF0azwHaLH?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("WESTWEN EMBROIDER")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.VgOGPHoM6bl79WmKF9784QHaH7?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("AFRICAN EMBROIDER")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }




                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.ocacia.com/pub/media/blog/cache/1100x/magefan_blog/embroidery.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("AFRICAN EMBROIDER")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.jD92bBy8_zFrRUACESd9fQHaHa?w=500&h=500&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("EMBROIDER HOOD")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th?id=OIF.QuTTjbtu%2f0E7O27ncD40Iw&rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("EMBROIDER CADCAN")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIF.SRJ5XHe6jtppFEmebzNGUw?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("african embroidary")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.mynativefashion.com/wp-content/uploads/2020/07/Embroidery-designs-for-men-1-696x925.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("EMBROYDER SHIRT")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.CV3RKr8cu5Ada18KoQ-3rQAAAA?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("EMBROIDER PANTS")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/736x/dd/ac/98/ddac98d6fa5f02782f033d8fe4241bf9.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("RAGAL SHIRT MEN")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://i.pinimg.com/originals/03/88/bb/0388bb5c4538f5956fedf9abd86f3b18.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("SAMAKKY DESIGNER")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://shameelkhan.com/wp-content/uploads/2022/12/3-20-450x630.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("SHAMEELKAN DESIGN")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.rajwadi.com/image/cache/data/VAGAD'S%2019-11-20193475-b-800x1100.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("VELVET SHAMALPURY")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://medias.utsavfashion.com/media/catalog/product/cache/1/image/500x/040ec09b1e35df139433887a97daa66f/e/m/embroidered-art-silk-sherwani-in-off-white-v2-mlc2220_2.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("SILK SHARWANI")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/R.22ce5bfd0818815653f20721fee28be7?rik=1R9mWLDCWYo81w&pid=ImgRaw&r=0",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("EMBROIDERY SUIT")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.serlFF-HiKH_K9aZW-E6NwHaJ4?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("EMBROIDERY SUIT")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.xuj9FIBE5zkb5ZFNUHoWJQHaHa?rs=1&pid=ImgDetMain",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("EMBROIDERY SUIT")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                        }


                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))









            LazyRow {
                item {

//


                    Spacer(modifier = Modifier.width(10.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }




                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                        }


                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))




            LazyRow {
                item {

//


                    Spacer(modifier = Modifier.width(10.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }




                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {
                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }


                        }


                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)

                        )

                        {


                            Card {
                                Column {


                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://www.bellanaija.com/wp-content/uploads/2020/10/Prince-Nelson-Enwerem-480x600.jpg",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.Black)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }


                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text("Cappuccino")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("* * * * *")

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text("$ 4.25")


                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))

                            Card {
                                Column {
                                    OutlinedCard {
                                        AsyncImage(
                                            model = "https://th.bing.com/th/id/OIP.iztlpqBdMWRs23FizYdZmAHaE7?w=262&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7.",
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,

                                            modifier = Modifier
                                                .size(150.dp)
                                                .border(5.dp, Color.White)
                                                .fillMaxSize()
                                                .padding(0.dp)
                                        )

                                    }
                                }

                                Spacer(modifier = Modifier.width(30.dp))
                                Text("Cappuccino")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("* * * * *")

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("$ 4.25")
                            }

                        }

                    }


                    Spacer(modifier = Modifier.width(30.dp))
                    Column(

                        modifier = Modifier

                            .padding(1.dp)
                            .background(Color.Black)
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly,

                        ) {

                        Row(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        ) {


                        }


                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))
//            Row {
//                var sliderPosition by remember { mutableStateOf(0f..100f) }
//                Column {
//                    RangeSlider(
//                        value = sliderPosition,
//                        steps = 5,
//                        onValueChange = { range -> sliderPosition = range },
//                        valueRange = 0f..100f,
//                        onValueChangeFinished = {
//                            // launch some business logic update with the state you hold
//                            // viewModel.updateSelectedSliderValue(sliderPosition)
//                        },
//                    )
//                    Text(text = sliderPosition.toString())
//                }
//
//            }
        }
    }
}
@Composable
fun ScrollContent(innerPadding: PaddingValues) {
    TODO("Not yet implemented")
}

