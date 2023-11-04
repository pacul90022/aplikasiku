import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasiku.R

class GameScreen {
    @Composable
    fun GameScreen() {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.game_logo),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Game Sederhana",
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { /* Aksi yang ingin Anda tambahkan saat tombol ditekan */ },
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text(text = "Mulai Game")
                }
            }
        }
    }

}