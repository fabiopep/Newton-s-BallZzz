package org.academiadecodigo.macasdoze;

import org.academiadecodigo.macasdoze.field.Field;
import org.academiadecodigo.macasdoze.gameobjects.Apple;
import org.academiadecodigo.macasdoze.gameobjects.GameObjectsFactory;
import org.academiadecodigo.macasdoze.gameobjects.Newton;

/**
 * Created by codecadet on 23/05/16.
 */
public class MacasDoZe {

    private int numObjects;
    private int delay;
    private Field field;
    public static final int height = 1200;
    public static final int width = 500;

    private GameObjectsFactory factory;
    private Apple[] apples;
    private AppleCollector appleCollector;
    private Newton newton;


    public MacasDoZe(GameObjectsFactory factory, int numObjects, int delay) {
        this.factory = factory;
        this.numObjects = numObjects;
        this.delay = delay;
    }


    public void start(){

        field = factory.getPositionFactory().createField(height, width);

        apples = new Apple[numObjects];
        appleCollector = new AppleCollector();

    }
}
