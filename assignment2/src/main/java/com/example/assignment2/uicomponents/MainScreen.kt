package com.example.assignment2.uicomponents

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment2.model.ElementDataFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val elementDataList = ElementDataFactory.makeElementData()
    val orientation = LocalConfiguration.current.orientation

    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp) // 적절한 높이 지정
            ) {
                elementDataList
                    .filter { it.visible }
                    .forEach { item ->
                        Image(
                            painter = painterResource(id = item.imgLocation),
                            contentDescription = item.elementType.toString(),
                            modifier = Modifier.fillMaxSize()
                        )
                    }
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.weight(1f)) {
                    elementDataList.forEachIndexed { index, item ->
                        if (index % 2 == 0) {
                            key(item.elementType) { // 고유 키 제공
                                CheckSection(modifier = Modifier, elementData = item) { isChecked ->
                                    elementDataList[index] = item.copy(visible = isChecked)
                                }
                            }
                        }
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    elementDataList.forEachIndexed { index, item ->
                        if (index % 2 != 0) {
                            key(item.elementType) { // 고유 키 제공
                                CheckSection(modifier = Modifier, elementData = item) { isChecked ->
                                    elementDataList[index] = item.copy(visible = isChecked)
                                }
                            }
                        }
                    }
                }
            }
            Text("202214209 안태규")

        }
    } else {
        Row (
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(300.dp) // 적절한 높이 지정
            ) {
                elementDataList
                    .filter { it.visible }
                    .forEach { item ->
                        Image(
                            painter = painterResource(id = item.imgLocation),
                            contentDescription = item.elementType.toString(),
                            modifier = Modifier.fillMaxSize()
                        )
                    }
            }
            Row(modifier = Modifier.weight(2f)) {
                Column(modifier = Modifier.weight(1f)) {
                    elementDataList.forEachIndexed { index, item ->
                        if (index % 2 == 0) {
                            key(item.elementType) { // 고유 키 제공
                                CheckSection(modifier = Modifier, elementData = item) { isChecked ->
                                    elementDataList[index] = item.copy(visible = isChecked)
                                }
                            }
                        }
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    elementDataList.forEachIndexed { index, item ->
                        if (index % 2 != 0) {
                            key(item.elementType) { // 고유 키 제공
                                CheckSection(modifier = Modifier, elementData = item) { isChecked ->
                                    elementDataList[index] = item.copy(visible = isChecked)
                                }
                            }
                        }
                    }
                }
            }
            Text("202214209 안태규")



        }
    }



}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}