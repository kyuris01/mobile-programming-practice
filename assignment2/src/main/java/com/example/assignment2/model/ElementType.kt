package com.example.assignment2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class ElementType : Parcelable {
    BODY, ARMS, EARS, EYEBROWS, EYES, GLASSES, HAT, MOUTH, MUSTACHE, NOSE, SHOES
}