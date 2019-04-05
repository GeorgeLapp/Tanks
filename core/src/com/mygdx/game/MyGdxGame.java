package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyGdxGame extends ApplicationAdapter {
   protected static SpriteBatch batch;
    Texture img;
    protected static Sprite sprite;
    Texture img2;
    protected static Sprite sprite2;
    Texture img3;
    protected static Sprite sprite3;
    protected static int x1 = 350;
    protected static int y1 = 50;
    static int deg1 = 180;
    Tank a = new Tank();
    Tank2 b = new Tank2();
    @Override
    public void create() {

        batch = new SpriteBatch();
        img = new Texture(Gdx.files.internal("core/assets/red_tank.jpg"));
        img2 = new Texture(Gdx.files.internal("core/assets/red_tank.jpg"));
        img3 = new Texture(Gdx.files.internal("core/assets/red_tank.jpg"));

        sprite = new Sprite(img);
        sprite2 = new Sprite(img2);
        sprite3 = new Sprite(img3);
        sprite.setPosition(x1, y1);
        sprite.setRotation(deg1);
        sprite3.setPosition(0,0);

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(2, 2, 2, 2);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

       // b.Move();
        a.Move();
        batch.begin();
        sprite.draw(batch);
        sprite2.draw(batch);
        sprite3.setY(sprite3.getY() + 10);
        sprite3.draw(batch);
        batch.end();

    }
}
