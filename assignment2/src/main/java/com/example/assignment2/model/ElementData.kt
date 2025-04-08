package com.example.assignment2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ElementData(
    val elementType: ElementType,
    val imgLocation: Int,
    var visible: Boolean = false

) : Parcelable
