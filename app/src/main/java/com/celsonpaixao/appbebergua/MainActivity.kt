package com.celsonpaixao.appbebergua

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.celsonpaixao.appbebergua.model.CalcularModel

class MainActivity : AppCompatActivity() {

    private lateinit var editPeso: EditText
    private lateinit var editIdade: EditText
    private lateinit var btCalcular: Button
    private lateinit var textResultado: TextView
    private lateinit var btRefresh: ImageView

    private lateinit var caluclarModel: CalcularModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initializaComponent()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btCalcular.setOnClickListener {
            if (editPeso.text.toString().isEmpty()) {
                Toast.makeText(this, R.string.alert_peso_void, Toast.LENGTH_SHORT).show()
            } else if (editIdade.text.toString().isEmpty()) {
                Toast.makeText(this, R.string.alert_idade_void, Toast.LENGTH_SHORT).show()
            } else {
                //  editIdade.text.clear()
                //  editPeso.text.clear()

            }
        }
    }

    private fun initializaComponent() {
        caluclarModel = CalcularModel()
        editIdade = findViewById(R.id.input_idade)
        editPeso = findViewById(R.id.input_peso)
        btCalcular = findViewById(R.id.bt_calcular)
        textResultado = findViewById(R.id.text_result_ml)
        btRefresh = findViewById(R.id.ic_refresh)

    }

    private fun calculeMl(peso: Double, idade: Double): String {

        var result: String = ""

        var jovemML = 40
        var adultoML = 35
        var idosoML = 30




        return result
    }
} 