package com.ratih.fooddam.adapters

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.ratih.fooddam.R
import java.io.Serializable
import java.lang.UnsupportedOperationException

class FavoriteRecipesFragmentDirections private constructor() {
    private data class ActionFavoriteRecipesFragmentToDetailsActivity(
        val result: com.ratih.fooddam.models.Result
    ) : NavDirections {
        override fun getActionId(): Int = R.id.action_favoriteRecipesFragment_to_detailsActivity

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(Result::class.java)) {
                result.putParcelable("result", this.result as Parcelable)
            } else if (Serializable::class.java.isAssignableFrom(Result::class.java)) {
                result.putSerializable("result", this.result as Serializable)
            } else {
                throw UnsupportedOperationException(Result::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionFavoriteRecipesFragmentToDetailsActivity(result: com.ratih.fooddam.models.Result): NavDirections =
            ActionFavoriteRecipesFragmentToDetailsActivity(result)
    }
}
