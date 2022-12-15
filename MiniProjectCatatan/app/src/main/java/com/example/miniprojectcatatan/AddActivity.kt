package com.example.miniprojectcatatan

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore


class AddActivity : AppCompatActivity() {
    var db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val editJudul = findViewById<EditText>(R.id.edt_judul)
        val editContent = findViewById<EditText>(R.id.edt_content)
        val btnTambah = findViewById<Button>(R.id.btn_tambah)

        btnTambah.setOnClickListener {
            if(editJudul.getText().length>0 && editContent.getText().length>0){
                saveData(editJudul.getText().toString(), editContent.getText().toString())
            }else{
                Toast.makeText(this,"Isi Semua Data",Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun saveData(judul : String,catatan : String){
        val user = hashMapOf(
            "judul" to judul,
            "catatan" to catatan
        )
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
                Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
                finish()}
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
                Toast.makeText(this,"Gagal",Toast.LENGTH_SHORT).show()}
    }
}