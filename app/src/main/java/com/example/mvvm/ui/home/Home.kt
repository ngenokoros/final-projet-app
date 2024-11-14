package com.example.mvvm.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage

import com.example.mvvm.navigation.ROUTE_AFRICLAN
import com.example.mvvm.navigation.ROUTE_HOME
import com.example.mvvm.navigation.ROUTE_INSERT
import com.example.mvvm.navigation.ROUTE_SHOP
import com.example.mvvm.navigation.ROUTE_VIEW_PRODUCTS


@Composable
fun Home(navController: NavController){
    Column(
        modifier = Modifier
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        Column {
            Text(text = "AFRICLAN CULTURE")

            Row {
                AsyncImage(
                    model = "https://i.etsystatic.com/22332655/r/il/628b76/2502125208/il_570xN.2502125208_qpyg.jpg",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://www.moderngentlemanmagazine.com/wp-content/uploads/2024/06/Green-Peak-Lapel-Suit-for-Summer.jpg",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://i.pinimg.com/originals/0c/f3/97/0cf39781decdec32bbcb4963250b68f9.png",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                AsyncImage(
                    model = "https://th.bing.com/th/id/OIP.Bd-Vsx6Fn0s0-6pOqFrV2gHaJQ?w=768&h=960&rs=1&pid=ImgDetMain",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://cdn.shopify.com/s/files/1/0576/1076/4347/products/sainly-men-s-three-piece-suit-32-26-men-s-black-3-piece-slim-fit-suit-with-pick-stitching-and-wedding-formal-fashion-suits-30218431168571_1024x1024.png?v=1663250417",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://i.pinimg.com/736x/a3/48/61/a3486108b0cd76ef96adc8315fd41672.jpg",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            Row {
                AsyncImage(
                    model = "https://th.bing.com/th/id/OIP.GHq6gQcI3wY2QP910VY9FAHaIQ?rs=1&pid=ImgDetMain",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model ="https://th.bing.com/th/id/OIP.EMNa1zT0gudTQeu_Z4c-4wHaLG?rs=1&pid=ImgDetMain",
                    contentDescription = null,
                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://th.bing.com/th/id/OIP.PJ06Nx_sMw9RqhSnmWSWowAAAA?rs=1&pid=ImgDetMain",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            Row {
                AsyncImage(
                    model = "https://i.etsystatic.com/22332655/r/il/628b76/2502125208/il_570xN.2502125208_qpyg.jpg",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )

                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://www.moderngentlemanmagazine.com/wp-content/uploads/2024/06/Green-Peak-Lapel-Suit-for-Summer.jpg",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )
                Spacer(modifier = Modifier.height(20.dp))
                AsyncImage(
                    model = "https://i.pinimg.com/originals/0c/f3/97/0cf39781decdec32bbcb4963250b68f9.png",
                    contentDescription = null,

                    modifier = Modifier.size(
                        100.dp
                    )

                )


            }

            Spacer(modifier = Modifier.height(20.dp))


//        Text(
//            "Go to about",
//            modifier = Modifier
//                .clickable { navController.navigate(ROUTE_ABOUT) }
//        )
            Row {

                Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "AFRICLAN",
                modifier = Modifier
                    .clickable { navController.navigate(ROUTE_AFRICLAN) }
                    .size(20.dp)

            )



//            Text(
//                text = "view shop",
//                modifier = Modifier
//                    .clickable { navController.navigate(ROUTE_SHOP) }
//
//            )



                Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "REGISTER",
                modifier = Modifier
                    .clickable { navController.navigate(ROUTE_INSERT) }
                    .size(20.dp)



            )
                Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "View Products",
                modifier = Modifier
                    .clickable { navController.navigate(ROUTE_VIEW_PRODUCTS) }
                    .size(20.dp)


            )


        }


    }

}
}