package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        println("жц-стартует")
    }

    override fun onResume() {
        super.onResume()
        println("жц-восст")
    }

    override fun onPause() {
        super.onPause()
        println("жц-паузит")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("жц-уничтожает")
    }

    override fun onStop() {
        super.onStop()
        println("жц-останавливает")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("жц-создает")
        setContent {
            MyApplicationTheme {
                ViewMain()
            }
        }
    }

    @Composable
    fun ViewMain() {
        var message by remember() { mutableStateOf("") }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(R.drawable.misha),
                contentDescription = null

            )

            TextField(
                value = message,
                onValueChange = { newText ->
                    message = newText
                },
                textStyle = TextStyle(fontSize = 30.sp),
                modifier = Modifier.padding(bottom = 25.dp)
            )


            Text(
                text = message,
                fontSize = 50.sp,
                modifier = Modifier.padding(bottom = 45.dp)
            )

            Button(
                onClick = {
                    val toastMessage = if (message.isNotEmpty()) {
                        "всем похуй но, вы написали: ${message}"
                    } else {
                        "101"
                    }
                    Toast.makeText(
                        this@MainActivity,
                        toastMessage,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            ) {
                Text(text = "хуячь", fontSize = 50.sp)
            }
        }


    }

    @Preview(showBackground = true)
    @Composable
    fun ViewMainPreview() {
        var message by remember() {
            mutableStateOf("")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(R.drawable.misha),
                contentDescription = null

            )

            TextField(
                value = message,
                onValueChange = { newText ->
                    message = newText
                },
                textStyle = TextStyle(fontSize = 30.sp),
                modifier = Modifier.padding(bottom = 25.dp)
            )


            Text(
                text = message,
                fontSize = 50.sp,
                modifier = Modifier.padding(bottom = 45.dp)
            )

            Button(
                onClick = {
                    val toastMessage = if (message.isNotEmpty()) {
                        "всем похуй но, вы написали: ${message}"
                    } else {
                        "101"
                    }
//                    Toast.makeText(
//                        this@MainActivity,
//                        toastMessage,
//                        Toast.LENGTH_SHORT
//                    ).show()
                }
            ) {
                Text(text = "хуячь", fontSize = 50.sp)
            }
        }


    }


}




