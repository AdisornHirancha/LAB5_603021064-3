package com.example.lab5intent_sec1_603021064_3

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Student (val id:String, val name:String ,val age:Int): Parcelable {
}