package com.enes_08.leftmenu

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast

class RightMenu : Fragment(), View.OnClickListener {



    lateinit var llAnasayfa: LinearLayout
    lateinit var llhakkimizda: LinearLayout
    lateinit var llAyarlar: LinearLayout
    lateinit var llCikisYap: LinearLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_right_menu, container, false)

        llAnasayfa= view.findViewById<LinearLayout>(R.id.llAnasayfa)
        llhakkimizda= view.findViewById<LinearLayout>(R.id.llhakkimizda)
        llAyarlar=view.findViewById<LinearLayout>(R.id.llAyarlar)
        llCikisYap= view.findViewById<LinearLayout>(R.id.llCikisYap)


        llAnasayfa.setOnClickListener (this )
        llhakkimizda.setOnClickListener(this)
        llAyarlar.setOnClickListener(this)
        llCikisYap.setOnClickListener(this)

        return view
    }


    override fun onClick(v: View?) {


        when(v){
            llAnasayfa->{

                Toast.makeText(getActivity(),"AnaSayfa Tıkalndı",Toast.LENGTH_SHORT).show()

            }

            llAyarlar->{
                Toast.makeText(getActivity(),"Ayarlar Tıkalndı",Toast.LENGTH_SHORT).show()


            }

            llhakkimizda->{
                Toast.makeText(getActivity(),"Hakkımızda Tıkalndı",Toast.LENGTH_SHORT).show()


            }

            llCikisYap->{

                Toast.makeText(getActivity(),"Çıkış yap Tıkalndı",Toast.LENGTH_SHORT).show()


            }
        }
    }
}