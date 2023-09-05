package com.amap.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amap.api.navi.AmapNaviPage
import com.amap.api.navi.AmapNaviParams
import com.amap.api.navi.AmapNaviType
import com.amap.api.navi.AmapPageType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //构建导航组件配置类，没有传入起点，所以起点默认为 “我的位置”
        val params = AmapNaviParams(null, null, null, AmapNaviType.DRIVER, AmapPageType.ROUTE)
        AmapNaviPage.getInstance().showRouteActivity(applicationContext, params, null)
        finish()
    }
}