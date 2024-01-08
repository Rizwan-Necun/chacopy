package com.example.chaquopy

import android.R.attr.path
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform
import com.example.chaquopy.databinding.MainActivityDataBinding
import org.koin.android.ext.android.inject
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {
    var imageName:String?=null
    val viewModel:MainActivityViewModel by inject()
    lateinit var binding: MainActivityDataBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        observeData()

//
//            button.setOnClickListener {
//                if(ContextCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED)
//                {
//                    saveImage()
//                }else{
//                    requestRuntimePermission()
//                }
//            }
//        if (!Python.isStarted()) {
//            Python.start(AndroidPlatform(this))
//        }
//
//        val py = Python.getInstance()
//        val module = py.getModule("script")
//        val num = module["number"]?.toInt()
//        println("The value of num is $num")
//
//        val text = module["text"]?.toString()
//        println("The value of the text is $text")
//
//        val fact = module["factorial"]
//        val a = fact?.call(5)
//        println("The value of a is $a")
    }
    //
    fun displayImage(imageName: String){
        try {
            val input_path=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                .toString() + "/SelectedImage/"
            val output_path=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                .toString() + "/OutputImage/"
            val file = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                .toString() + "/OutputImage/")
            if(!file.exists()){
                file.mkdirs()
            }

            // val num = module.process_images_in_folder["number"]?.toInt()
            // println("The value of num is $num")
            // val text = module["text"]?.toString()
            // println("The value of the text is $text")

            val input  = input_path + imageName +".jpg"

            val filee= File(input)
            val fileLength = filee.length() //fact?.call(input_path+"one_image.jpg")
            println("The $input Length: $fileLength")

            if (!Python.isStarted()) {
                Python.start(AndroidPlatform(this))
            }
            val py = Python.getInstance()
            val module = py.getModule("script")
            val fact = module["gray_sca"]
            fact?.call(input,output_path)
            //println("The $input SIZE of a is $fileLength : $result")
            val f:File=File(output_path,"grayscale_tomatoes.jpg")
            val b = BitmapFactory.decodeStream(FileInputStream(f))
//            binding.imageNine.setImageBitmap(b)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }



    fun saveImage(imageName: String){
        val file = File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                .toString() + "/SelectedImage/"
        )


        if(!file.exists()){
            file.mkdirs()
        }
        var selectedImageName: BitmapDrawable? = null
        when(imageName){
            "image_one" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_one, null) as BitmapDrawable
            }
            "image_two" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_two, null) as BitmapDrawable
            }
            "image_three" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_three, null) as BitmapDrawable
            }
            "image_four" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_four, null) as BitmapDrawable
            }
            "image_five" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_five, null) as BitmapDrawable
            }
            "image_six" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_six, null) as BitmapDrawable
            }
            "image_seven" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_seven, null) as BitmapDrawable
            }
            "image_eight" ->{
                selectedImageName =
                    ResourcesCompat.getDrawable(resources, R.drawable.sample_image_eight, null) as BitmapDrawable
            }

        }
        val bitmap=selectedImageName!!.bitmap
        val filee= File(file,imageName+".jpg")
        val outputStream = FileOutputStream(filee)
        bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream)
        Toast.makeText(this@MainActivity,"successfully saved", Toast.LENGTH_LONG).show()
        outputStream.flush()
        outputStream.close()
        if(ContextCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED)
        {
            displayImage(imageName)
        }else{
            requestRuntimePermissionn()
        }


    }
    private fun requestRuntimePermission():Boolean {
        if(ActivityCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this@MainActivity,arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),13)
            return false
        }
        return true
    }
    private fun requestRuntimePermissionn():Boolean {
        if(ActivityCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this@MainActivity,arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),14)
            return false
        }
        return true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode) {
            13->{
                if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this@MainActivity,"Permission Granted", Toast.LENGTH_LONG).show()
                }else{
                    ActivityCompat.requestPermissions(this@MainActivity,arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),13)
                }
            }
            14->{
                if(grantResults[0]== PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this@MainActivity,"Permission Granted", Toast.LENGTH_LONG).show()
                }else{
                    ActivityCompat.requestPermissions(this@MainActivity,arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),14)
                }
            }
        }
    }

    fun internalStorageOperations(imageName:String){
        if(ContextCompat.checkSelfPermission(this@MainActivity,android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED)
        {
            saveImage(imageName)
        }else{
            requestRuntimePermission()
        }
    }

    fun observeData(){
        viewModel.resourseClick.observe(this) { integer ->
            when(integer){
                R.id.image_one ->{
                    internalStorageOperations("image_one")
                }

                R.id.image_two ->{
                    internalStorageOperations("image_two")
                }
                R.id.image_three ->{
                    internalStorageOperations("image_three")
                }
                R.id.image_four ->{
                    internalStorageOperations("image_four")
                }
                R.id.image_five ->{
                    internalStorageOperations("image_five")
                }
                R.id.image_six ->{
                    internalStorageOperations("image_six")
                }
                R.id.image_seven ->{
                    internalStorageOperations("image_seven")
                }
                R.id.image_eight ->{
                    internalStorageOperations("image_eight")
                }
                R.id.image_nine ->{
                    internalStorageOperations("image_nine")
                }
            }
        }
    }
}



