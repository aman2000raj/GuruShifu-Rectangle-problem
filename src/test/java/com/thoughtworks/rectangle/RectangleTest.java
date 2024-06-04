package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        double actualArea = 6.0;

        Rectangle rectangleInst = new Rectangle(3.0, 2.0);
        double expectedArea = rectangleInst.area();

        assertThat(expectedArea, is(closeTo(actualArea, 0.001)));
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven() {
        Rectangle rectangleInst = new Rectangle(2.5, 5.5);
        double actualPerimeter = 16.00;

        double expectedPerimeter = rectangleInst.perimeter();
        assertThat(expectedPerimeter, is(closeTo(actualPerimeter, 0.2)));
    }
    

}