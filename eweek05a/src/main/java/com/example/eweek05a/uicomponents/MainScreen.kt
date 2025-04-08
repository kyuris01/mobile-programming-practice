package com.example.eweek05a.uicomponents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.eweek05a.R
import com.example.eweek05a.model.ButtonType
import com.example.eweek05a.model.ImageData
import com.example.eweek05a.model.ImageUri

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    var img1State by rememberSaveable(stateSaver = ImageData.ImageSaver) {
        mutableStateOf(
            ImageData(
                image = ImageUri.ResImage(R.drawable.img1),
                buttonType = ButtonType.BADGE,
                likes = 50
            )
        )
    }

    var img2State by rememberSaveable(stateSaver = ImageData.ImageSaver) {
        mutableStateOf(
            ImageData(
                image = ImageUri.ResImage(R.drawable.img2),
                buttonType = ButtonType.EMOJI,
                likes = 50,
                dislikes = 10
            )
        )
    }

}