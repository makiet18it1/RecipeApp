package vku.makiet.recipeapp.ui


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import vku.makiet.recipeapp.AllCategoryActivity
import vku.makiet.recipeapp.DetailActivity
import vku.makiet.recipeapp.R
import vku.makiet.recipeapp.adapter.CategoryAdapter
import vku.makiet.recipeapp.adapter.RecipesAdapter
import vku.makiet.recipeapp.data.Categories
import vku.makiet.recipeapp.data.categoryList
import vku.makiet.recipeapp.data.RECIPE_ID_EXTRA
import vku.makiet.recipeapp.data.Recipes
import vku.makiet.recipeapp.data.recipeList
import vku.makiet.recipeapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment(), RecipesClickListener, CategoryClickListener {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        trendRecipesList()
        categoriesD()

        val homeFragment = this
        binding.rvRecipe.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = RecipesAdapter(recipeList, homeFragment)
        }

        binding.rvRecommend.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = RecipesAdapter(recipeList, homeFragment)
        }


        binding.rvCategory.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CategoryAdapter(categoryList, homeFragment)
        }

    }


    override fun onClickCategory(category: Categories){
        val intent = Intent(context, AllCategoryActivity::class.java)
        startActivity(intent)
    }

    override fun onClick(recipe: Recipes) {
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(RECIPE_ID_EXTRA, recipe.id)
        startActivity(intent)
    }


    private fun trendRecipesList() {

            val r1 = Recipes(1, "Recipe 1", R.drawable.img, "This is Recipe 1")
            recipeList.add(r1)
            val r2 = Recipes(2, "Recipe 2", R.drawable.img, "This is Recipe 2")
            recipeList.add(r2)
            val r3 = Recipes(3, "Recipe 3", R.drawable.img, "This is Recipe 3")
            recipeList.add(r3)
            val r4 = Recipes(4, "Recipe 4", R.drawable.img, "This is Recipe 4")
            recipeList.add(r4)
            val r5 = Recipes(5, "Recipe 5", R.drawable.img, "This is Recipe 5")
            recipeList.add(r5)
            val r6 = Recipes(6, "Recipe 6", R.drawable.img, "This is Recipe 6")
            recipeList.add(r6)
        }

    private fun categoriesD() {
            val c1 = Categories(1, "Categories 1")
            categoryList.add(c1)
            val c2 = Categories(2, "Categories 2")
            categoryList.add(c2)
            val c3 = Categories(3, "Categories 3")
            categoryList.add(c3)
            val c4 = Categories(4, "Categories 4")
            categoryList.add(c4)
            val c5 = Categories(5, "Categories 5")
            categoryList.add(c5)
            val c6 = Categories(6, "Categories 6")
            categoryList.add(c6)
            val c7 = Categories(7, "Categories 7")
            categoryList.add(c7)
            val c8 = Categories(8, "Categories 8")
            categoryList.add(c8)
            val c9 = Categories(9, "Categories 9")
            categoryList.add(c9)
            val c10 = Categories(10, "Categories 10")
            categoryList.add(c10)

}

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}