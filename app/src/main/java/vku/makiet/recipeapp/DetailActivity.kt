package vku.makiet.recipeapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vku.makiet.recipeapp.data.RECIPE_ID_EXTRA
import vku.makiet.recipeapp.data.Recipes
import vku.makiet.recipeapp.data.recipeList
import vku.makiet.recipeapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val recipeID = intent.getIntExtra(RECIPE_ID_EXTRA, -1)
        val recipe = recipeFromID(recipeID)
        if(recipe != null){
            binding.imgRecipe.setImageResource(recipe.image)
            binding.tvName.text = recipe.name
            binding.tvDescription.text = recipe.description
        }
    }

    private fun recipeFromID(recipeID: Int): Recipes?
    {
        for(recipe in recipeList)
        {
            if(recipe.id == recipeID)
                return recipe
        }
        return null
    }

}