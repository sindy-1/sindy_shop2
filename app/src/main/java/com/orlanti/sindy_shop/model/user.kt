package com.orlanti.sindy_shop.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class user (
    val nama:String,
    val email:String,
    val umur :String
 ): Parcelable
