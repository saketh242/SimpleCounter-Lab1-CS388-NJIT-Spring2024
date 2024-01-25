package com.example.simplecounter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private var counter = 0;
    private var increment = 1;
    private var currHundred = 100;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<ImageButton>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeBtn = findViewById<Button>(R.id.upgradeButton)
        val resetBtn = findViewById<ImageButton>(R.id.resetButton)

        resetBtn.setOnClickListener {
            counter = 0
            increment = 1
            currHundred = 100
            textView.text = "0"

        }

        button.setOnClickListener {
            counter+=increment
            textView.text = counter.toString()

            if (counter/currHundred>0){
                currHundred+=100
                upgradeBtn.visibility= View.VISIBLE
                upgradeBtn.setOnClickListener{
                    increment++
                    upgradeBtn.visibility= View.INVISIBLE
                    Toast.makeText(it.context, "Numbers increment by $increment from now", Toast.LENGTH_SHORT).show();
                }

            }
        }
    }
}

//https://www.bing.com/images/search?view=detailV2&ccid=OrGEoq%2B8&id=66C0D4EA011FEC636FA899C8FB590B0F393208F1&thid=OIP.OrGEoq-8mu6hFfb5SHXiZQHaNK&mediaurl=https%3A%2F%2Fwallpapercave.com%2Fwp%2Fwp2439535.jpg&cdnurl=https%3A%2F%2Fth.bing.com%2Fth%2Fid%2FR.3ab184a2afbc9aeea115f6f94875e265%3Frik%3D8QgyOQ8LWfvImQ%26pid%3DImgRaw%26r%3D0&exph=1191&expw=670&q=phone+wallpapers+4k+lihght&simid=608030880014676167&form=IRPRST&ck=D18DF6128AAC8138AB285ED6AA605CEB&selectedindex=3&itb=0&ajaxhist=0&ajaxserp=0&pivotparams=insightsToken%3Dccid_Hwx5p3fq*cp_793BA682A77036B98417929E7B530896*mid_FF1391D6F9B828A6A1383BE29F38635066ED012A*simid_608025219161733932*thid_OIP.Hwx5p3fqzR1f--R2MwJbGwHaNK&vt=0&sim=11&iss=VSI
//https://www.bing.com/images/search?view=detailV2&ccid=tb62CQwO&id=C759FB43AE78BC0F66CF98B50AB92768ED5A2E94&thid=OIP.tb62CQwO7d5ps1I-mPtwLQAAAA&mediaurl=https%3a%2f%2fvectorified.com%2fimages%2frefresh-icon-png-transparent-15.png&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.b5beb6090c0eedde69b3523e98fb702d%3frik%3dlC5a7WgnuQq1mA%26pid%3dImgRaw%26r%3d0&exph=473&expw=474&q=refresh+icon+hd&simid=607993522368679811&FORM=IRPRST&ck=3A6E4491E44E7D95CDF277DAEDFAA413&selectedIndex=31&itb=1&ajaxhist=0&ajaxserp=0
//https://www.bing.com/images/search?view=detailV2&ccid=E4OgUu%2Fg&id=171FB39CB224231DE5A5F406081F0157F3B70613&thid=OIP.E4OgUu_g1QvF60SlqERgPwAAAA&mediaurl=https%3A%2F%2Fcdn4.iconfinder.com%2Fdata%2Ficons%2FmeBaze-Freebies%2F512%2Fadd.png&cdnurl=https%3A%2F%2Fth.bing.com%2Fth%2Fid%2FR.1383a052efe0d50bc5eb44a5a844603f%3Frik%3DEwa381cBHwgG9A%26pid%3DImgRaw%26r%3D0&exph=474&expw=474&q=add+icons&simid=607989558134792775&form=IRPRST&ck=893418B6303D1A90760F182613C29596&selectedindex=7&itb=1&ajaxhist=0&ajaxserp=0&vt=0&sim=11


