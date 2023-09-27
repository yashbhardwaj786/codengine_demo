package com.codengineassessment.ui.activity

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.codengineassessment.ui.viewmodelfactory.MainViewModelFactory
import com.codengineassessment.R
import com.codengineassessment.common.BaseActivity
import com.codengineassessment.common.BaseViewModel
import com.codengineassessment.common.ModuleMaster
import com.codengineassessment.data.preferences.PreferenceProvider
import com.codengineassessment.databinding.ActivityMainBinding
import com.codengineassessment.notifiers.Notify
import com.codengineassessment.ui.fragment.MenuFragment
import com.codengineassessment.ui.fragment.TransactionFragment
import com.codengineassessment.ui.viewmodel.MainViewModel
import com.codengineassessment.utils.BindingUtil
import com.codengineassessment.utils.Constant.Companion.PREF_USER_NAME
import com.codengineassessment.utils.Constant.Companion.PREF_USER_PROFILE_PIC
import com.codengineassessment.utils.Constant.Companion.PREF_USER_TYPE
import com.codengineassessment.utils.showAlertDialog
import com.codengineassessment.utils.showCartCount
import com.google.android.material.navigation.NavigationView
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class MainActivity : BaseActivity() {

    override val kodein by kodein()
    private lateinit var mainViewModel: MainViewModel
    private val factory by instance<MainViewModelFactory>()
    private val binding: ActivityMainBinding by lazyBinding()
    override val dataBinding: Boolean = true
    override val layoutResource: Int = R.layout.activity_main
    private val prefs: PreferenceProvider by instance()
    lateinit var cartCountHome: TextView
    lateinit var name: String
    private var doubleBackToExitPressedOnce = false
    lateinit var navController: NavController

    override fun getViewModel(): BaseViewModel {
        return mainViewModel
    }

    override fun initializeViewModel() {
        mainViewModel =
            ViewModelProvider(this, factory)[MainViewModel::class.java]
    }

    override fun setBindings() {
        binding.viewModel = mainViewModel
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onNotificationReceived(data: Notify) {
        when(data.identifier){
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cartCountHome = findViewById(R.id.cartCount)
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        setToolBar(getString(R.string.menu))
        findViewById<RelativeLayout>(R.id.cartLayout).setOnClickListener {
            ModuleMaster.navigateToCartActivity(this)
        }
        setSupportActionBar(toolbar)

        val userName = prefs.getData(PREF_USER_NAME).toString()
        val userImage = prefs.getData(PREF_USER_PROFILE_PIC).toString()
        val userType = prefs.getData(PREF_USER_TYPE).toString()

        val navigationView = findViewById<NavigationView>(R.id.nav_view)

        navController = Navigation.findNavController(this, R.id.fragment)

        NavigationUI.setupWithNavController(navigationView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerLayout)

        toolbar?.navigationIcon?.colorFilter =
            BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                ContextCompat.getColor(
                    this,
                    R.color.white
                ), BlendModeCompat.SRC_ATOP
            )

        val headerView = navigationView.getHeaderView(0)
        val navUserName = headerView.findViewById(R.id.header_name) as TextView
        val role = headerView.findViewById(R.id.role) as TextView
        val navUserImage = headerView.findViewById(R.id.imageView) as ImageView
        val headerRoot = headerView.findViewById(R.id.navigation_header_root) as ConstraintLayout

        headerRoot.setOnClickListener {
            binding.drawerLayout.closeDrawers()
            navController.navigate(R.id.menuFragment)
        }

        setupDrawerContent(navigationView)

        // get event when drawer is open or drawer is closed
        val mDrawerToggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        ) {
            override fun onDrawerStateChanged(newState: Int) {
                if (newState == DrawerLayout.STATE_SETTLING) {
                    if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {

                        showNavigationHeaderData(
                            userName,
                            userImage,
                            userType,
                            navUserImage,
                            navUserName,
                            role
                        )
                    } /* else { // closing drawer
                        // when menu is back/closed
                    }*/
                    invalidateOptionsMenu()
                }
            }
        }
        binding.drawerLayout.addDrawerListener(mDrawerToggle)
    }

    fun showNavigationHeaderData(
        name: String,
        imageUrl: String?,
        role: String?,
        navUserImage: ImageView,
        navUserName: TextView,
        userRole: TextView
    ) {
        navUserName.text = name
        userRole.text = role
        imageUrl?.let {url->
            val eDrawable =
                ContextCompat.getDrawable(this, R.drawable.ic_profile_placeholder)
            BindingUtil.setCircularImage(navUserImage, imageUrl, eDrawable)
        }

    }


    private fun setupDrawerContent(navigationView: NavigationView) {
        navigationView.setNavigationItemSelectedListener { menuItem ->
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment)
            var fragment = navHostFragment?.childFragmentManager!!.fragments[0]

            when (menuItem.itemId) {
                R.id.menuFragment -> {
                    binding.drawerLayout.closeDrawers()
                    if (fragment !is MenuFragment) {
                        NavigationUI.onNavDestinationSelected(menuItem, navController)
                    } else {
                        false
                    }
                }

                R.id.transactionFragment -> {
                    binding.drawerLayout.closeDrawers()
                    if (fragment !is TransactionFragment) {
                        NavigationUI.onNavDestinationSelected(menuItem, navController)
                    } else {
                        false
                    }
                }
                R.id.logout -> {
                    binding.drawerLayout.closeDrawers()
                    logOut()
                    false
                }
                else -> {
                    binding.drawerLayout.closeDrawers()
                    false
                }
            }
        }
    }

    // Setting Up the back button
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this, R.id.fragment),
            binding.drawerLayout
        )
    }

    fun hideBackBtn() {
        supportActionBar?.setHomeButtonEnabled(false); // disable the button
        supportActionBar?.setDisplayHomeAsUpEnabled(false); // remove the left caret
        supportActionBar?.setDisplayShowHomeEnabled(false); // remove the icon
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finish()
            return
        }
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun logOut() {
        showAlertDialog(this, "", getString(R.string.logout_message),
            DialogInterface.OnClickListener { dialog, which ->
                if (which == DialogInterface.BUTTON_POSITIVE) {
                    clearData()
                } else if (which == DialogInterface.BUTTON_NEGATIVE) {
                    dialog.dismiss()
                }
            })
    }

    private fun clearData() {
        prefs.clearAllPref()
        ModuleMaster.navigateToLoginActivity(this)
    }

    override fun onResume() {
        super.onResume()
        showCartCount(cartCountHome, prefs)
    }
}