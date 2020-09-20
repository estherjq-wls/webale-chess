// This class is for plus moving in any directions (up/down/left/right) by one step

package webale;

public class SunMovement implements Movement {

	// This method is called by the method canMove() in the Sun class to verify if
	// the Piece's movement is valid.
	// If valid, return true; if invalid, return false.
	public boolean move(final Coordinate[][] coordinate, final Coordinate startPoint, final Coordinate endPoint) {

		final int sourceCoordinateX = startPoint.getCoorX();
		final int sourceCoordinateY = startPoint.getCoorY();
		final int destCoordinateX = endPoint.getCoorX();
		final int destCoordinateY = endPoint.getCoorY();
		boolean isDifferentColour = true;

		// check destination tile got piece, got same colour piece cannot move
		if (coordinate[destCoordinateY][destCoordinateX].getChessPiece() != null) {
			if (coordinate[sourceCoordinateY][sourceCoordinateX].getChessPiece()
					.getIsRedColor() == coordinate[destCoordinateY][destCoordinateX].getChessPiece().getIsRedColor()) {
				isDifferentColour = false;
			}
		}

		// move forward, x-axis no change , y-axis coordinate -1
		if (destCoordinateX == sourceCoordinateX && destCoordinateY == sourceCoordinateY - 1 && isDifferentColour) {
			return true;
		}

		// move backward, x-axis no change, y-axis coordinate +1
		else if (destCoordinateX == sourceCoordinateX && destCoordinateY == sourceCoordinateY + 1
				&& isDifferentColour) {
			return true;
		}

		// move right, x-axis coordinate + 1, y-axis no change
		else if (destCoordinateX == sourceCoordinateX + 1 && destCoordinateY == sourceCoordinateY
				&& isDifferentColour) {
			return true;
		}

		// move left, x-axis coordinate -1, y-axis no change
		else if (destCoordinateX == sourceCoordinateX - 1 && destCoordinateY == sourceCoordinateY
				&& isDifferentColour) {
			return true;
		}

		// move piece upwards left, x-axis coordinate -1, y-axis coordinate -1
		else if (destCoordinateX == sourceCoordinateX - 1 && destCoordinateY == sourceCoordinateY - 1
				&& isDifferentColour) {
			return true;
		}

		// move piece upwards right, x-axis coordinate +1, y-axis coordinate -1
		else if (destCoordinateX == sourceCoordinateX + 1 && destCoordinateY == sourceCoordinateY - 1
				&& isDifferentColour) {
			return true;
		}

		// move piece downwards right, x-axis coordinate +1, y-axis coordinate +1
		else if (destCoordinateX == sourceCoordinateX + 1 && destCoordinateY == sourceCoordinateY + 1
				&& isDifferentColour) {
			return true;
		}

		// move piece downwards left, x-axis coordinate -1, y-axis coordinate +1
		else if (destCoordinateX == sourceCoordinateX - 1 && destCoordinateY == sourceCoordinateY + 1
				&& isDifferentColour) {
			return true;
		}

		return false;
	}
}
