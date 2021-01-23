package com.ratih.fooddam.bindingadapters

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ratih.fooddam.R
import java.io.Serializable
import java.lang.UnsupportedOperationException

class RecipesFragmentDirections private constructor() {
    private data class ActionRecipesFragmentToDetailsActivity(
        val result: com.ratih.fooddam.models.Result
    ) : NavDirections {
        override fun getActionId(): Int = R.id.action_recipesFragment_to_detailsActivity

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
        fun actionRecipesFragmentToRecipesBottomSheet(): NavDirections =
            ActionOnlyNavDirections(R.id.action_recipesFragment_to_recipesBottomSheet)

        fun actionRecipesFragmentToDetailsActivity(result: com.ratih.fooddam.models.Result): NavDirections =
            ActionRecipesFragmentToDetailsActivity(result)
    }
}
