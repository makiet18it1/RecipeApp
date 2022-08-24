package vku.makiet.recipeapp.viewHodel


import androidx.recyclerview.widget.RecyclerView
import vku.makiet.recipeapp.data.Recipes
import vku.makiet.recipeapp.ui.RecipesClickListener
import vku.makiet.recipeapp.databinding.ItemRecipesBinding

class RecipesViewHodel(
    private val itemRecipesBinding: ItemRecipesBinding,
    private val clickListener: RecipesClickListener
): RecyclerView.ViewHolder(itemRecipesBinding.root) {

    fun bindRecipes(recipes: Recipes){
        itemRecipesBinding.imgDish.setImageResource(recipes.image)
        itemRecipesBinding.tvDish.text = recipes.name

        itemRecipesBinding.cardCategory.setOnClickListener{
            clickListener.onClick(recipes)
        }
    }

}