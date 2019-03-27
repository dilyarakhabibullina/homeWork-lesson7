package ru.itpark.wallpaperservice.service;

        import org.junit.Test;

        import static org.junit.jupiter.api.Assertions.*;

class WallpaperServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        WallpaperService service = new WallpaperService();
        int result = service.calculate(6, 5, 3, 1, 10);
        assertEquals(7, result);
    }
}