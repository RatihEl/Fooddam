package com.ratih.fooddam.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ratih.fooddam.models.Result
import com.ratih.fooddam.utils.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    //primary key dapat diartikan sebagai kolom yang berisi nilai unik,
    //berfungsi sebagai identitas untuk membedakan setiap record yang ada pada tabel.
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)