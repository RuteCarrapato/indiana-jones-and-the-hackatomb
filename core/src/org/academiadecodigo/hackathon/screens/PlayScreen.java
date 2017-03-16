package org.academiadecodigo.hackathon.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import org.academiadecodigo.hackathon.Indiana;
import org.academiadecodigo.hackathon.WorldCreator;
import org.academiadecodigo.hackathon.gameobjects.Player;
import org.academiadecodigo.hackathon.utils.Constants;

public class PlayScreen extends AbstractGameScreen {

    //Reference to our game, used to set Screens
    private Indiana game;
    private TextureAtlas atlas;

    //Basic PlayScreen variables
    private OrthographicCamera gameCam;
    private Viewport gamePort;

    //TileMap variables
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    //BOX2D variables
    private World world;
    private Box2DDebugRenderer debugRenderer;
    private WorldCreator creator;

    //Sprites
    private Player player;

    private Texture texture;

    public PlayScreen(Indiana game) {
        this.game = game;
        texture = new Texture("badlogic.jpg");
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(Constants.VIEW_WIDTH, Constants.VIEW_HEIGHT, gameCam);
    }

    @Override
    public void show() {

    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(gameCam.combined);
        game.batch.begin();
        game.batch.draw(texture, 50, 50);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public World getWorld() {
        return world;
    }

    public TiledMap getMap() {
        return map;
    }
}






