package ru.itpark.wallpaperservice.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WallpaperServiceTest {

    @Test
    void calculate() {
        WallpaperService service = new WallpaperService();
        int result = service.calculate(6, 5, 3, 10, 1);
        assertEquals(7, result);
    }
}