package vku.makiet.recipeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vku.makiet.recipeapp.data.Categories
import vku.makiet.recipeapp.ui.CategoryClickListener
import vku.makiet.recipeapp.databinding.ItemCategoryBinding
import vku.makiet.recipeapp.viewHodel.CategoriesViewHodel

class CategoryAdapter(
    private val categoriesList: List<Categories>,
    private val clickListener: CategoryClickListener
    )
    : RecyclerView.Adapter<CategoriesViewHodel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHodel {
        val from = LayoutInflater.from(parent.context)
        val binding = ItemCategoryBinding.inflate(from, parent, false)
        return CategoriesViewHodel(binding, clickListener)

    }

    override fun onBindViewHolder(holder: CategoriesViewHodel, position: Int) {
        holder.bindCategories(categoriesList[position])
    }

    override fun getItemCount(): Int = categoriesList.size


}