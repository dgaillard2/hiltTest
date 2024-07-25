package com.example.testhilt.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity(tableName = "tests")
@Parcelize
data class TestDB(@PrimaryKey val text: String) :
    Parcelable