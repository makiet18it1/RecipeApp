package vku.makiet.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import vku.makiet.recipeapp.databinding.ActivityMainBinding
import vku.makiet.recipeapp.ui.*
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mEmail : String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val emailF = intent.getStringExtra("emailF")
        val email = intent.getStringExtra("email")

        replaceFragment(HomeFragment())

        mEmail = email.toString().trim()
        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId){
                R.id.navHome -> replaceFragment(HomeFragment())
                R.id.navCategory -> replaceFragment(CategoryFragment())
                R.id.navFavorites -> replaceFragment(FavoriteFragment())
                R.id.navProfile -> replaceFragment(ProfileFragment())

                else->{

                }
            }
            true
        }

    }


    private fun replaceFragment(fragment: Fragment){
        val email = intent.getStringExtra("email")
        mEmail = email.toString().trim()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout,fragment)
        fragmentTransaction.commit()

    }

    fun getEmail(): String{
        return mEmail
    }

}