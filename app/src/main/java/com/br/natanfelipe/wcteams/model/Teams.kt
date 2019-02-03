package com.br.natanfelipe.wcteams.model

import android.app.Activity
import android.widget.ImageView
import com.ahmadrosid.svgloader.SvgLoader
import androidx.databinding.BindingAdapter




data class ListOfTeams(val teams: List<Teams>)

data class Teams (val name: String,val code : String, val crestUrl : String) {}

@BindingAdapter("android:src")
fun loadImage(view: ImageView, crestUrl: String) {
    SvgLoader.pluck()
        .with(view.getContext() as Activity)
        .load(crestUrl, view)
}
