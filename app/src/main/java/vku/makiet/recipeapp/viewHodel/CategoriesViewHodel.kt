package vku.makiet.recipeapp.viewHodel

import androidx.recyclerview.widget.RecyclerView
import vku.makiet.recipeapp.data.Categories
import vku.makiet.recipeapp.ui.CategoryClickListener
import vku.makiet.recipeapp.databinding.ItemCategoryBinding


class CategoriesViewHodel(
    private var itemCategoryBinding: ItemCategoryBinding,
    private val clickCategory: CategoryClickListener
) : RecyclerView.ViewHolder(itemCategoryBinding.root) {

    fun bindCategories(category: Categories){
        itemCategoryBinding.tvCategory.text = category.nameCategory

        itemCategoryBinding.cardCategory.setOnClickListener{
            clickCategory.onClickCategory(category)
        }
    }



}