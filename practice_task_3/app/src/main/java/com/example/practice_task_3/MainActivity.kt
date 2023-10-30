package com.example.practice_task_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practice_task_3.ui.theme.Practice_task_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice_task_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    fun table(x: Int) {
        // Создаем двумерный массив
        var cinema = arrayOf<Array<Int>>()
        var y = 0

        // Заполняем значениями
        for (i in 0..4) {

            var array = arrayOf<Int>()
            for (j in 0..4) {
                while (y < x) {
                    y++
                    array += y // заполнение значениями
                }

                cinema += array
            }
        }
    }

        table(10)

    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practice_task_3Theme {
        Greeting("Android")
    }
}