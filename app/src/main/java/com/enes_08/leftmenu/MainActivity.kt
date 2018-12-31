package com.enes_08.leftmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.view.GravityCompat



class MainActivity : AppCompatActivity(), View.OnClickListener {


    var fm:FragmentManager?=null
    var tr:FragmentTransaction?=null;
    lateinit var mleftMenu:LeftMenu
    lateinit var mrightMenu:RightMenu

    var ivMenu: ImageView? = null
    var mtoolBar: Toolbar? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fm=supportFragmentManager;
         mleftMenu= LeftMenu()
        mrightMenu= RightMenu()

        mtoolBar = findViewById(R.id.toolBar);


        ivMenu = mtoolBar?.findViewById(R.id.ivBack)

        ivMenu?.setOnClickListener(this)





        tr=fm?.beginTransaction();

        tr?.add(R.id.frame,mleftMenu)
        tr?.add(R.id.frame2,mrightMenu)


        tr?.commit()




    }


    override fun onClick(v: View?) {

        when(v){
            ivMenu->{
                val drawer = findViewById(R.id.drawerLayout) as DrawerLayout
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START)
                } else {
                    drawer.openDrawer(GravityCompat.START)
                }
            }
        }
    }
}
