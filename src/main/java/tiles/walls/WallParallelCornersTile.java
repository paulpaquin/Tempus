package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallParallelCornersTile extends Tile {

	public WallParallelCornersTile(int id) {
		super(Assets.wallParallelCorners, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}