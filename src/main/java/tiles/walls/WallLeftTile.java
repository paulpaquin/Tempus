package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallLeftTile extends Tile {

	public WallLeftTile(int id) {
		super(Assets.wallLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}