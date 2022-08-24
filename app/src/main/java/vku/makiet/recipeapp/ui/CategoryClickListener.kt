package vku.makiet.recipeapp.ui

import vku.makiet.recipeapp.data.Categories

interface CategoryClickListener {
    fun onClickCategory(category: Categories)
}