package com.example.a191105_01_listview.datas

import android.util.Log

class PostData(inputTitle:String, inputContent:String) {

    var title = inputTitle
    var content = inputContent

    init{
        Log.d("게시글 생성","기본 생성자로 생성")
    }
}