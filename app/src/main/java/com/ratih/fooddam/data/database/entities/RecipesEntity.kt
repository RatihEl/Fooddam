package com.ratih.fooddam.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ratih.fooddam.models.FoodRecipe
import com.ratih.fooddam.utils.Constants.Companion.RECIPES_TABLE


@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}