package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallLeftDotTile extends Tile {

	public WallLeftDotTile(int id) {
		super(Assets.wallLeftDot, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}