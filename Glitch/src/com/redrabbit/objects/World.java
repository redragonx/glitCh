package com.redrabbit.objects;

import org.newdawn.slick.geom.Vector2f;

import com.redrabbit.constants.GameNumbers;
import com.redrabbit.helpers.Moveable;

public class World extends Moveable {

    private SmartMap[][] maps;
    private int pixelWidth, pixelHeight;
    private int mapWidth, mapHeight;
    private int[][] startMap;

    public World(Vector2f vector, float angle, float velocity) {
	super(vector, 0, 0);
	this.setMapWidth(GameNumbers.WORLD_WIDTH);
	this.setMapHeight(GameNumbers.WORLD_HEIGHT);
	this.setStartMap(new int[1][1]);
	// Width/height in pixels
	this.setPixelWidth(GameNumbers.WORLD_WIDTH
		* GameNumbers.SMART_MAP_WIDTH * GameNumbers.SMART_TILE_WIDTH);
	this.setPixelWidth(GameNumbers.WORLD_WIDTH
		* GameNumbers.SMART_MAP_WIDTH * GameNumbers.SMART_TILE_WIDTH);
    }

    public SmartMap[][] getMaps() {
	return maps;
    }

    public void setMaps(SmartMap[][] maps) {
	this.maps = maps;
    }

    public int getPixelWidth() {
	return pixelWidth;
    }

    public void setPixelWidth(int width) {
	this.pixelWidth = width;
    }

    public int getPixelHeight() {
	return pixelHeight;
    }

    public void setPixelHeight(int height) {
	this.pixelHeight = height;
    }

    public int[][] getStartMap() {
	return startMap;
    }

    public void setStartMap(int[][] startMap) {
	this.startMap = startMap;
    }

    public int getMapWidth() {
	return mapWidth;
    }

    public void setMapWidth(int mapWidth) {
	this.mapWidth = mapWidth;
    }

    public int getMapHeight() {
	return mapHeight;
    }

    public void setMapHeight(int mapHeight) {
	this.mapHeight = mapHeight;
    }

}
