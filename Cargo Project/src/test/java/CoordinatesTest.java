import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    @Test
    void CorrectCoordinatesShuldBeMoreThan0andEqualOrLessThan100() {
        //giving
        Coordinates coordinates = new Coordinates(33, 88);

        //then
        assertThat(coordinates.getX(), is(not(greaterThanOrEqualTo(100))));
        assertThat(coordinates.getY(), is(not(lessThanOrEqualTo(0))));
    }

    @Test
    void WhenCordinatesAreBellowOrGratherThat100throwNewIllegalArgumentException() {
        //giving
     //when
        //then
       assertThrows(IllegalArgumentException.class, () -> new Coordinates(-1, 88));
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(22, -1));
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(111, 2));
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(2, 222));
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(-11, -11));
        assertThrows(IllegalArgumentException.class, () -> new Coordinates(123, 333));

    }
    @Test
    void CopiedCoridnatesShuldBeSumOf() {
        //giving
        int x = 10;
        int y = 10;
        Coordinates coordinates = new Coordinates(x, y);
        //when
        Coordinates copyCordinates = Coordinates.copy(coordinates, x, y);

        //then
        assertEquals(coordinates.getX() + x, copyCordinates.getY());
        assertEquals(coordinates.getY() + y, copyCordinates.getX());

    }

    @Test
    void CordinatesShuldBeTheSameWhenArgumentsAreTheSame() {
        //giving
        int x = 10;
        int y = 10;
        Coordinates coordinates = new Coordinates(x, y);
        Coordinates theSameCordinates=new Coordinates(x,y);
        //when

        //then
        assertEquals(coordinates,theSameCordinates);

    }




}