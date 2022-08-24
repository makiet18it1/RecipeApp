package vku.makiet.recipeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vku.makiet.recipeapp.data.Recipes
import vku.makiet.recipeapp.ui.RecipesClickListener
import vku.makiet.recipeapp.databinding.ItemRecipesBinding
import vku.makiet.recipeapp.viewHodel.RecipesViewHodel

class RecipesAdapter(
    private val recipes: List<Recipes>,
    private val clickListener: RecipesClickListener
): RecyclerView.Adapter<RecipesViewHodel>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipesViewHodel {
        val from = LayoutInflater.from(parent.context)
        val binding = ItemRecipesBinding.inflate(from, parent, false)
        return RecipesViewHodel(binding, clickListener)
    }

    override fun onBindViewHolder(holder: RecipesViewHodel, position: Int) {
        holder.bindRecipes(recipes[position])
    }

    override fun getItemCount(): Int = recipes.size

}