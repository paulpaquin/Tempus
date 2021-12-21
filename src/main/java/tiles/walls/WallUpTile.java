package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallUpTile extends Tile {

	public WallUpTile(int id) {
		super(Assets.wallUp, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}