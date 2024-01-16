package com.example.all_android_basics_tutorial

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.all_android_basics_tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
     // recycler view
    var todoList = mutableListOf(
        Todo("android learning" , false),
        Todo("dsa practiceing" ,false),
        Todo("learning gate" , false)
    )
    val adapter = TodoAdapter(todoList)
    val rvTodo = findViewById<RecyclerView>(R.id.rvTodo)
    val etTodo = findViewById<TextView>(R.id.etTodo)
    rvTodo.adapter = adapter
    rvTodo.layoutManager = LinearLayoutManager(this )
    val buttonListener = findViewById<Button>(R.id.btnAddTodo)
    buttonListener.setOnClickListener {
        val title = etTodo.text.toString()
        val todo = Todo(title  ,false)
        todoList.add(todo)
//        adapter.notifyDataSetChanged()
        adapter.notifyItemInserted(todoList.size-1)
    }
//        binding.submitOrder.setOnClickListener{
//            val checkMeetRadioButtonId = binding.radioOption.checkedRadioButtonId
//            val meet = findViewById<RadioButton>(checkMeetRadioButtonId)
//            val chese  = binding.chooseChese.isChecked
//            val onion = binding.chooseOnion.isChecked
//            val ordereddetail = "You want to eat with rice \n" + "${meet.text}" + (if(chese) "\nCheese" else "") +
//                    (if(onion) "\n Onion" else "")
//            binding.detailsOfOrder.text = ordereddetail
//        }
//        binding.buttonShowToast.setOnClickListener{
//            Toast.makeText(this , "Hi , I am bharat Thank you for visiting ..." , Toast.LENGTH_LONG).show()
//        }

//    val buttonId = findViewById<Button>(R.id.buttonOpenActivity)
//        buttonId.setOnClickListener {
//            Intent(this , MainActivity2::class.java).also {
//                startActivity(it)
//            }
//        }
//        val applyButtonId = findViewById<Button>(R.id.applyButton)
//        applyButtonId.setOnClickListener {
//            val name = findViewById<EditText>(R.id.nameId).text.toString()
//            val age = findViewById<EditText>(R.id.ageId).text.toString().toInt()
//            Intent(this, MainActivity2::class.java).also {
//                it.putExtra("EXTRA_NAME" , name)
//                it.putExtra("EXTRA_AGE" , age)
//                startActivity(it)
//            }
//        }
//        val buttonId = findViewById<Button>(R.id.buttonRequets)
//        buttonId.setOnClickListener {
//            requestPermission()
//        }
//        val buttonTakePhoto = findViewById<Button>(R.id.TakePhotoFromMobile)
//        buttonTakePhoto.setOnClickListener {
//            Intent(Intent.ACTION_GET_CONTENT).also {
//                it.type = "image/*"
//                startActivityForResult(it , 0)
//            }
//        }

       }
//    private  fun hasWriteExternalStoragePermission() =
//        ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
//    private  fun hasLocationForgroundPermission() =
//        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
//    private  fun hasBackgroundPermission() =
//        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED
//    private  fun requestPermission() {
//        var permissionRequestList = mutableListOf<String>()
//        if(!hasWriteExternalStoragePermission()){
//            permissionRequestList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//        }
//        if(!hasLocationForgroundPermission()){
//            permissionRequestList.add(Manifest.permission.ACCESS_COARSE_LOCATION)
//        }
//        if(!hasBackgroundPermission()){
//            permissionRequestList.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
//        }
//        if(permissionRequestList.isEmpty()){
//            ActivityCompat.requestPermissions(this, permissionRequestList.toTypedArray() , 0)
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if(requestCode == 0 && grantResults.isEmpty() ){
//            for (i in grantResults.indices ){
//                if(grantResults[i] == PackageManager.PERMISSION_GRANTED)
//                    Log.d("permission_request", "${permissions[i]} Granted.")
//            }
//        }
//    }

    }

