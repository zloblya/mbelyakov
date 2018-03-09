package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distanceToPoint() {
        Point point = new Point(0, 1);
        Point point1 = new Point(2, 5);
        double result = point.distanceTo(point1);
        assertThat(result, is(4.47213595499958));
        }

    }
