package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnplus.setOnClickListener {
            val input1=binding.input1.text.toString().toFloat()
            val input2=binding.input2.text.toString().toFloat()
            binding.textView4.text=(input1+input2).toString()

        }
        binding.btnminus.setOnClickListener {
            val input1=binding.input1.text.toString().toFloat()
            val input2=binding.input2.text.toString().toFloat()
            binding.textView4.text=(input1-input2).toString()

        }
        binding.btnmultiply.setOnClickListener {
            val input1=binding.input1.text.toString().toFloat()
            val input2=binding.input2.text.toString().toFloat()
            binding.textView4.text=(input1*input2).toString()

        }
        binding.btndivide.setOnClickListener {
            val input1=binding.input1.text.toString().toFloat()
            val input2=binding.input2.text.toString().toFloat()
            binding.textView4.text=(input1/input2).toString()

        }




    }
}