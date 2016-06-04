package org.academiadecodigo.macasdoze;

import org.academiadecodigo.macasdoze.field.PositionFactory;
import org.academiadecodigo.macasdoze.gameobjects.GameObjectsFactory;
import org.academiadecodigo.macasdoze.simplegfx.SimpleGfxPositionFactory;

/**
 * Created by <vi.KINGS_> David Neves, Fábio Santos, Hélia Marcos and Mário Ponte on 23/05/16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        PositionFactory factory = new SimpleGfxPositionFactory();

        MacasDoZe macasDoZe = new MacasDoZe(new GameObjectsFactory(factory), 10);

        macasDoZe.init();

    }
}
