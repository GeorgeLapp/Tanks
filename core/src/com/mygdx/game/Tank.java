package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.mygdx.game.MyGdxGame.batch;
import static com.mygdx.game.MyGdxGame.sprite3;

public class Tank {

    protected int x = 350;
    protected int y = 50;
    protected int x1 = 350;
    protected int y1 = 50;
    protected int deg = 180;
    protected int povorot1 =180;
    public void Move() {

        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            y += 2;
            MyGdxGame.sprite.setPosition(x, y);
            MyGdxGame.sprite.setRotation(180);
            povorot1= 180;


        } else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            y -= 2;
            MyGdxGame.sprite.setPosition(x, y);
            MyGdxGame.sprite.setRotation(0);
            povorot1= 0;
        } else if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            x -= 2;
            MyGdxGame.sprite.setPosition(x, y);
            MyGdxGame.sprite.setRotation(270);
            povorot1= 270;

        } else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            x += 2;
            MyGdxGame.sprite.setPosition(x, y);
            MyGdxGame.sprite.setRotation(90);
            povorot1= 90;
    }
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && povorot1 == 180) {
                for (int c=0; c <10;c++){
                    y1 += 10;

                }

                sprite3.setPosition(x1,y1);

        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && povorot1 == 0) {

                y1 -= 10;
                sprite3.setPosition(x1,y1);

        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && povorot1 == 270) {

                x1 -= 10;
                sprite3.setPosition(x1,y1);

        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE) && povorot1 == 90) {

                x1 += 10;
                sprite3.setPosition(x1,y1);

        }
    }
}
