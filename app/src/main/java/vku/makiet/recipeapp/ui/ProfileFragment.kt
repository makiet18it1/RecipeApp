package vku.makiet.recipeapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import vku.makiet.recipeapp.MainActivity
import vku.makiet.recipeapp.databinding.FragmentProfileBinding
import vku.makiet.recipeapp.login.LoginActivity


class ProfileFragment : Fragment() {

    private lateinit var firebaseAuth: FirebaseAuth

    private lateinit var mActivity: MainActivity

    private var _binding : FragmentProfileBinding? = null
    private val binding get() = _binding!!

//    private lateinit var emailUser: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firebaseAuth = FirebaseAuth.getInstance()

        mActivity = getActivity() as MainActivity

//        val email = pushEmail()
        val email = firebaseAuth.currentUser?.email.toString()

        if(email.isNotEmpty()) {
            binding.tvEmailUser.text = email
        }else {
            binding.tvEmailUser.text = mActivity.getEmail()
        }



        binding.button.setOnClickListener{
            firebaseAuth.signOut()
            startActivity(Intent(context, LoginActivity::class.java))
        }


    }

}