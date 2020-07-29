package me.brook.wonder.entities;

import me.brook.wonder.models.TexturedModel;

public class Entity {

	private TexturedModel model;
	protected Location location;
	protected float scale;

	public Entity(TexturedModel model, Location location) {
		this(model, location, 1.0f);
	}

	public Entity(TexturedModel model, Location location, float scale) {
		super();
		this.model = model;
		this.location = location;
		this.scale = scale;
	}

	public void move(float x, float y, float z) {
		location.move(x, y, z);
	}

	public void rotate(float x, float y, float z) {
		location.rotate(x, y, z);
	}

	public TexturedModel getModel() {
		return model;
	}

	public void setModel(TexturedModel model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

}