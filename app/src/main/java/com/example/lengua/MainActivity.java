package com.example.lengua;

import static com.example.lengua.DrawingArea.pathArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static Path path = new Path();
    public static Paint paint = new Paint();

    ImageView im;
    TextView tv;

    private Random generator;
    ArrayList<ItemModel> itemModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = findViewById(R.id.im_picto);
        tv = findViewById(R.id.tv_title);

        generator = new Random();

        itemModelArrayList.add(new ItemModel(R.drawable.tablet,"Tablet"));
        itemModelArrayList.add(new ItemModel(R.drawable.zapatillas,"Zapatillas"));
        itemModelArrayList.add(new ItemModel(R.drawable.coche,"Coche"));
        itemModelArrayList.add(new ItemModel(R.drawable.movil,"Móvil"));
        itemModelArrayList.add(new ItemModel(R.drawable.cuaderno,"Cuaderno"));
        itemModelArrayList.add(new ItemModel(R.drawable.agua,"Agua"));
        itemModelArrayList.add(new ItemModel(R.drawable.chocolate,"Chocolate"));
        itemModelArrayList.add(new ItemModel(R.drawable.galleta,"Galleta"));
        itemModelArrayList.add(new ItemModel(R.drawable.leche,"Leche"));
        itemModelArrayList.add(new ItemModel(R.drawable.muffin,"Muffin"));
        itemModelArrayList.add(new ItemModel(R.drawable.rojo,"Rojo"));
        itemModelArrayList.add(new ItemModel(R.drawable.azul,"Azul"));
        itemModelArrayList.add(new ItemModel(R.drawable.verde,"Verde"));
        itemModelArrayList.add(new ItemModel(R.drawable.amarillo,"Amarillo"));
        itemModelArrayList.add(new ItemModel(R.drawable.morado,"Morado"));
        itemModelArrayList.add(new ItemModel(R.drawable.rosa,"Rosa"));
        itemModelArrayList.add(new ItemModel(R.drawable.blanco,"Blanco"));
        itemModelArrayList.add(new ItemModel(R.drawable.naranja,"Naranja"));
        itemModelArrayList.add(new ItemModel(R.drawable.negro,"Negro"));
        itemModelArrayList.add(new ItemModel(R.drawable.colegio,"Colegio"));
        itemModelArrayList.add(new ItemModel(R.drawable.jugar,"Jugar"));
        itemModelArrayList.add(new ItemModel(R.drawable.parque,"Parque"));
        itemModelArrayList.add(new ItemModel(R.drawable.paseo,"Paseo"));
        itemModelArrayList.add(new ItemModel(R.drawable.piscina,"Piscina"));
        itemModelArrayList.add(new ItemModel(R.drawable.globo,"Globo"));
        itemModelArrayList.add(new ItemModel(R.drawable.pelota,"Pelota"));
        itemModelArrayList.add(new ItemModel(R.drawable.helado,"Helado"));
        itemModelArrayList.add(new ItemModel(R.drawable.piano,"Piano"));
        itemModelArrayList.add(new ItemModel(R.drawable.banana,"Banana"));
        itemModelArrayList.add(new ItemModel(R.drawable.puzzle,"Puzzle"));

        init();
    }

    public void init(){
        int randomIndex;
        randomIndex = generator.nextInt(itemModelArrayList.size());
        im.setImageResource(itemModelArrayList.get(randomIndex).getImage());
        tv.setText(itemModelArrayList.get(randomIndex).getName());
    }

    public void clear(View view){
        pathArrayList.clear();
        path.reset();
    }

    public void reload(View view){
        init();
        pathArrayList.clear();
        path.reset();
    }
}