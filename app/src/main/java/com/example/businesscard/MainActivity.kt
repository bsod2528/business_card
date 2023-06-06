package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Business()
                }
            }
        }
    }
}

@Composable
fun Business(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(170, 179, 253)),
    )
    {
        Box {
            Image(
                painter = image,
                contentDescription = "android_logo",
                modifier = Modifier.size(250.dp)
            )
        }
        Box {
            Text(
                text = stringResource(id = R.string.name),
                color = Color(0, 0, 0),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }
        Box {
            Text(
                text = stringResource(id = R.string.role),
                color = Color(0, 0, 0),
                fontWeight = FontWeight.W400,
                fontSize = 12.sp
            )
        }
        Contact()
    }
}

@Composable
fun Contact(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(10.dp)) {
        Row(modifier = modifier.padding(14.dp)) {
            Icon(
                Icons.Default.Email,
                contentDescription = "Contact me via email.",
                tint = Color(0, 0, 0)
            )
            Text(
                text = stringResource(id = R.string.email),
                color = Color(0, 0, 0)
            )
        }
        Row(modifier = modifier.padding(14.dp)) {
            Icon(
                Icons.Default.Phone,
                contentDescription = "Contact me via phone.",
                tint = Color(0, 0, 0)
            )
            Text(
                text = stringResource(id = R.string.phone_number),
                color = Color(0, 0, 0)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Business()
    }
}