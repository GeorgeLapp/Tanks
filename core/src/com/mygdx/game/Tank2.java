package com.mygdx.game;
import static com.mygdx.game.MyGdxGame.sprite3;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Tank2 {

    protected int x = 350;
    protected int y = 50;
    protected int x1 = 350;
    protected int y1 = 50;
    protected int deg = 180;
    protected int povorot =180;
    public void Move() {

        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            y += 2;
            MyGdxGame.sprite2.setPosition(x, y);
            MyGdxGame.sprite2.setRotation(180);
            povorot= 180;

        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            y -= 2;
            MyGdxGame.sprite2.setPosition(x, y);
            MyGdxGame.sprite2.setRotation(0);
            povorot= 0;
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            x -= 2;
            MyGdxGame.sprite2.setPosition(x, y);
            MyGdxGame.sprite2.setRotation(270);
            povorot= 270;

        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            x += 2;
            MyGdxGame.sprite2.setPosition(x, y);
            MyGdxGame.sprite2.setRotation(90);
            povorot= 90;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && povorot == 180) {

                y1 += 10;
                sprite3.setPosition(x1,y1);

        }
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && povorot == 0) {
                y1 -= 10;
                sprite3.setPosition(x1,y1);

        }
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && povorot == 270) {
                x1 -= 10;
                sprite3.setPosition(x1,y1);

        }
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && povorot == 90) {

                x1 += 10;
                sprite3.setPosition(x1,y1);

        }


    }
}
