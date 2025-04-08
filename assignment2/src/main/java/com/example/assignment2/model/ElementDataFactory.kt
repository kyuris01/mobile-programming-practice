package com.example.assignment2.model
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import com.example.assignment2.R


object ElementDataFactory {

    private val elementDataListSaver = listSaver<SnapshotStateList<ElementData>, ElementData>(
        save = { it.toList() },
        restore = { it.toMutableStateList() }
    )

    @Composable
    fun makeElementData() = rememberSaveable(saver = elementDataListSaver) {
        mutableStateListOf(
            ElementData(ElementType.BODY, imgLocation = R.drawable.body, true),
            ElementData(ElementType.ARMS, imgLocation = R.drawable.arms, false),
            ElementData(ElementType.EARS, imgLocation = R.drawable.ears, false),
            ElementData(ElementType.EYEBROWS, imgLocation = R.drawable.eyebrows, false),
            ElementData(ElementType.EYES,imgLocation = R.drawable.eyes, false),
            ElementData(ElementType.GLASSES, imgLocation = R.drawable.glasses, false),
            ElementData(ElementType.HAT, imgLocation = R.drawable.hat, false),
            ElementData(ElementType.MOUTH, imgLocation = R.drawable.mouth, false),
            ElementData(ElementType.MUSTACHE, imgLocation = R.drawable.mustache, false),
            ElementData(ElementType.NOSE, imgLocation = R.drawable.nose, false),
            ElementData(ElementType.SHOES, imgLocation = R.drawable.shoes, false),
        )
    }
}