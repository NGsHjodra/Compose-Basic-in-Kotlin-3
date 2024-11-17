package kekw.ngs.composebasic3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kekw.ngs.composebasic3.ui.theme.ComposeBasic3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasic3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrant(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column (modifier = modifier.fillMaxSize()){
        Row (modifier.weight(1f)){
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.text_comp),
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.text_comp_desc),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.img_comp),
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.img_comp_desc),
                    textAlign = TextAlign.Justify
                )
            }
        }
        Row (modifier.weight(1f)){
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.row_comp),
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.row_comp_desc),
                    textAlign = TextAlign.Justify
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.col_comp),
                    modifier = modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.col_comp_desc),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeBasic3Theme {
        ComposeQuadrant()
    }
}