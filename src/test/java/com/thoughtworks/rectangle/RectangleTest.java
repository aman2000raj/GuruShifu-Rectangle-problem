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
        double expectedArea = rectangleInst.getArea();

        assertThat(expectedArea, is(closeTo(actualArea, 0.001)));
    }

    

}