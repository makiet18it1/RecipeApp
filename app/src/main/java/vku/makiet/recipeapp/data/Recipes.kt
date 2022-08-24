package vku.makiet.recipeapp.data

var recipeList = mutableListOf<Recipes>()

val RECIPE_ID_EXTRA = "recipeExtra"

class Recipes(
    val id: Int? = recipeList.size,
    var name: String,
    var image: Int,
    var description: String){


}