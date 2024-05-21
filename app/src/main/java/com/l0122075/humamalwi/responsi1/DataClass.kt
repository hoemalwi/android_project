package com.l0122075.humamalwi.responsi1

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


data class DataClass(
    val Image: Int,
    val Title: String?,
    val Des: String?,
    val Detail: ArrayList<DetailDataClass>
)
