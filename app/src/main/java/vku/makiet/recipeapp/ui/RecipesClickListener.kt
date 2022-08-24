package vku.makiet.recipeapp.ui


import vku.makiet.recipeapp.data.Recipes


interface RecipesClickListener {
    fun onClick(recipe: Recipes)
}