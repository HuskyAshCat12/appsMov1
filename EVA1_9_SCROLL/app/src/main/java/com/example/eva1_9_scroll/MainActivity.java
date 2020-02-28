package com.example.eva1_9_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String text;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = "Playerunknown's Battlegrounds (Estilizado como PUBG) es un videojuego de batalla en línea multijugador masivo desarrollado por Brendan Greene y publicado por Bluehole para Microsoft Windows, Xbox One, PlayStation 4, Android e iOS. El juego era una beta battle royale de ARMA 3 que salió en 2015. El juego se basa en el estilo Battle Royale de los mods previamente desarrollados por Brendan \"Playerunknown\" Greene para otros juegos, pero ampliado independientemente bajo la dirección creativa de él mismo. En el juego, cien jugadores saltan en paracaídas desde un avión a una isla, donde tienen la libertad de moverse hacia un lugar determinado que ellos mismo elijan y buscan armas y equipamiento para matar a otros jugadores mientras evitan ser asesinados. El área segura disponible del mundo del juego disminuye en tamaño durante la partida, dirigiendo a los jugadores sobrevivientes a áreas más reducidas y forzando enfrentamientos. El último jugador o equipo en pie gana la partida.\n" +
                "\n" +
                "El juego fue lanzado en Windows mediante el programa de acceso anticipado de Steam en marzo de 2017. Mientras que en el acceso anticipado, el juego había vendido más de cuatro millones de copias en un período de tres meses. Bluehole planea lanzamientos de consolas después de la versión completa de la versión de Windows, con una versión de Xbox One prevista para ser una exclusiva programada para finales de 2017. Una versión para dispositivos móviles iOS y Android fue lanzada el 20 de marzo de 2018 en la App Store y la Play Store.1\u200B El videojuego se lanzó en la consola PlayStation 4 el 7 de diciembre de 2018.2\u200B Hace poco tiempo, la distribuidora de videojuegos Tencent Games lanzó una versión ligera de PUBG MOBILE y PUBG. Ésta versión de Playerunknown's Battlegrounds se llama PUBG LITE, la cual está optimizada para computadoras de bajos y medianos recursos. Lo mismo pasa con PUBG MOBILE. Tencent Games estrenó PUBG MOBILE LITE, la cual es una versión optimizada para las personas que no poseen dispositivos de gama media-alta. PUBG MOBILE LITE fue lanzado en la Play Store hace poco tiempo y está siendo actualizado constantemente para mejorar la experiencia de juego.";
    txt = findViewById(R.id.textView);
    txt.setText(text);
    }
}
