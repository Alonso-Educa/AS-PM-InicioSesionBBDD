package com.example.myapplication

import android.icu.lang.UCharacter.VerticalOrientation
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter.State.Empty.painter
//import com.composables.icon.lucide
//import com.composables.icon.lucide.Lucide
import androidx.compose.material3.Button
import androidx.compose.runtime.remember


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicio(
                        name = "Desarrollo en Android",
                        modifier = Modifier.padding(innerPadding),
                        background = Modifier.background(color= Color.Blue)
                    )
                }
            }
        }
    }
}

@Composable
fun Inicio(name: String, modifier: Modifier = Modifier, background: Modifier) {
    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Desarrollo en Android",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(20.dp)
                .background(Color.Cyan)
                .padding(horizontal = 25.dp, vertical = 10.dp),
            textDecoration=TextDecoration.Underline,
        )

        Row (Modifier.background(color=Color.LightGray).padding(horizontal = 25.dp)){
            Text(
                text="DAM",
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.Yellow)
                    .border(
                        width = 5.dp,
                        color = Color.Black, shape = RectangleShape
                    )
                    .size(80.dp, 80.dp)
                    .padding(horizontal = 10.dp),
                lineHeight = 80.sp,
                textAlign = TextAlign.Left,

                )

            Text(
                text="DAW",
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Green, shape = CircleShape)
                    .border(width = 5.dp, color = Color.Black, shape = CircleShape)
                    .size(80.dp, 80.dp),
                lineHeight = 35.sp,
                textAlign = TextAlign.Center,
            )

            Text(
                text="ASIR",
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.Magenta)
                    .border(
                        width = 5.dp,
                        color = Color.Black, shape = RectangleShape
                    )
                    .size(80.dp, 80.dp)
                    .padding(horizontal = 7.dp),
                textAlign = TextAlign.Right,
                lineHeight = 130.sp
            )
        }

        Box(modifier= Modifier
            .padding(20.dp)
            .background(color = Color.Gray)
            .size(200.dp)){
            Text(
                text="Texto en un Box",
                modifier = Modifier
                    .background(Color.DarkGray)
                    .align(Alignment.Center),
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioPreview() {
    MyApplicationTheme {
        Inicio("Desarrollo en Android", Modifier,
            Modifier.background(color= Color.Blue))
    }
}