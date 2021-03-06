package com.redrabbit.helpers;

import org.newdawn.slick.geom.Vector2f;

/**
 * A Wrapper class for moveable objectts
 * 
 * @author rabbitfighter, redragonX
 *
 */
public class Moveable {

    private Vector2f vector;
    private float angle;
    private float velocity;

    /**
     * Contrcutor for a moveable item.
     * 
     * @param vector
     *            The vector passed in.
     * @param angle
     *            The angle passed in
     * @param velocity
     *            The velocity passed in.
     */
    public Moveable(Vector2f vector, float angle, float velocity) {
	this.setVector(vector);
	this.setAngle(angle);
	this.setVelocity(velocity);
    }

    /**
     * A simple method to return the new vector based on trajectory
     * 
     * @return new vector position
     */
    public Vector2f updateVector() {
	// Get angle in radians.
	float angleRadians = (float) Math.toRadians(this.getAngle());

	// Return a new Vectir based on trajectory
	return new Vector2f(
		(float) (this.getVector().getX() + this.getVelocity()
			* Math.cos(angleRadians)), (float) (this.getVector()
			.getY() + this.getVelocity() * Math.sin(angleRadians)));

    }

    /***** Getters/Setters *****/

    public float getAngle() {
	return this.angle;
    }

    public void setAngle(float angle) {
	this.angle = angle;
    }

    public Vector2f getVector() {
	return vector;
    }

    public void setVector(Vector2f vector) {
	this.vector = vector;
    }

    public float getVelocity() {
	return velocity;
    }

    public void setVelocity(float velocity) {
	this.velocity = velocity;
    }

}// EOF
