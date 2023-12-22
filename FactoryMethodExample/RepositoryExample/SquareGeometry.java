/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepositoryExample;

/**
 *
 * @author fa20-bse-061
 */
public class SquareGeometry extends Geometery{

	@Override
	public Shape createShape() {
		return new Square();
	}

}