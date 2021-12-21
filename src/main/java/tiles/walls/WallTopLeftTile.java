package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallTopLeftTile extends Tile {

	public WallTopLeftTile(int id) {
		super(Assets.wallTopLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}