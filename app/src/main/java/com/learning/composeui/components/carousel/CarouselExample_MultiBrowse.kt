//package com.learning.composeui.components.carousel
//
//import android.R
//import androidx.annotation.DrawableRes
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.wrapContentHeight
//import androidx.compose.material3.carousel.rememberCarouselState
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun CarouselExample_MultiBrowse() {
//    data class CarouselItem(
//        val id: Int,
//        @DrawableRes val imageResId: Int,
//        val contentDescription: String
//    )
//
//    val items = remember {
//        listOf(
//            CarouselItem(0, R.drawable.cupcake, "cupcake"),
//            CarouselItem(1, R.drawable.donut, "donut"),
//            CarouselItem(2, R.drawable.eclair, "eclair"),
//            CarouselItem(3, R.drawable.froyo, "froyo"),
//            CarouselItem(4, R.drawable.gingerbread, "gingerbread"),
//        )
//    }
//
//    HorizontalMultiBrowseCarousel(
//        state = rememberCarouselState { items.count() },
//        modifier = Modifier
//            .fillMaxWidth()
//            .wrapContentHeight()
//            .padding(top = 16.dp, bottom = 16.dp),
//        preferredItemWidth = 186.dp,
//        itemSpacing = 8.dp,
//        contentPadding = PaddingValues(horizontal = 16.dp)
//    ) { i ->
//        val item = items[i]
//        Image(
//            modifier = Modifier
//                .height(205.dp)
//                .maskClip(MaterialTheme.shapes.extraLarge),
//            painter = painterResource(id = item.imageResId),
//            contentDescription = item.contentDescription,
//            contentScale = ContentScale.Crop
//        )
//    }
//}
//
//@Composable
//fun HorizontalMultiBrowseCarousel(
//    state: rememberCarouselState,
//    modifier: padding,
//    preferredItemWidth: dp,
//    itemSpacing: dp,
//    contentPadding: PaddingValues,
//    content: @Composable (ERROR) -> Image
//) {
//    TODO("Not yet implemented")
//}