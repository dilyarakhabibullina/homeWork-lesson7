package ru.itpark.wallpaperservice.service;

import org.springframework.stereotype.Service;

@Service
public class WallpaperService {
    public int calculate(int roomLength, int roomWidth, int roomHeight, int rollLength, int rollWidth) {
        int perimetr = 2 * (roomLength + roomWidth);
        int wallpaperPiece = perimetr / rollWidth + 1;
        int piecesInOneRoll = rollLength / roomHeight;
        int rollAmount = wallpaperPiece / piecesInOneRoll;
        return rollAmount;
    }
}
