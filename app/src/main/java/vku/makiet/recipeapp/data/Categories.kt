package vku.makiet.recipeapp.data

var categoryList = mutableListOf<Categories>()

val CATEGORY_ID_EXTRA = "categoryExtra"

data class Categories(
    val id: Int? = categoryList.size,
    var nameCategory: String){

}



