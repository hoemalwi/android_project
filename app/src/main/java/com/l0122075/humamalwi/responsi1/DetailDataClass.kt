package com.l0122075.humamalwi.responsi1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailDataClass(
    val image: Int,
    val name: String?,
): Parcelable
