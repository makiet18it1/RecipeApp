package vku.makiet.recipeapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import vku.makiet.recipeapp.AllCategoryActivity
import vku.makiet.recipeapp.data.Categories
import vku.makiet.recipeapp.adapter.CategoryAdapter
import vku.makiet.recipeapp.data.categoryList
import vku.makiet.recipeapp.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment(), CategoryClickListener {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoriesD()

        val categoryFragment = this
        binding.rvCateFragment.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = CategoryAdapter(categoryList, categoryFragment)
        }


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

    override fun onClickCategory(category: Categories) {
       val intent = Intent(context, AllCategoryActivity::class.java)
        startActivity(intent)
    }

}