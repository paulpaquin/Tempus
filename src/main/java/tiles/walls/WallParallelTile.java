package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallParallelTile extends Tile {

	public WallParallelTile(int id) {
		super(Assets.wallParallel, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}