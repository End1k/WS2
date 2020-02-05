package com.newwalk.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
     var lis : MutableList<ElemInfo> = mutableListOf()
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 1..100)
        { lis.add(ElemInfo(i.toString(),(i*i*11+(Random(92).nextInt()%40) + 250000).toString(),"nice" )) }


        var RecyclerVieww : RecyclerView = findViewById(R.id.recycler)
        var BIA : BankInfoAdapter = BankInfoAdapter(lis)
        RecyclerVieww.adapter = BIA

        recycler.layoutManager = LinearLayoutManager(this)
    }
}

class BankInfoAdapter(list : List<ElemInfo>) : RecyclerView.Adapter<BankViewHolder>() {
    var listt = list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.enelem, parent, false)
        return BankViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listt.size
    }

    override fun onBindViewHolder(holder: BankViewHolder, position: Int) {
        holder.bind(listt[position])
    }
}

class BankViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    var adress : TextView = view.findViewById(R.id.adress)
    var type : TextView = view.findViewById(R.id.type)

    fun bind(b : ElemInfo){
        adress.text = b.position
        type.text = b.type
    }
}