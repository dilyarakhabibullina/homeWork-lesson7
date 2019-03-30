package ru.itpark.wallpaperservice.service;

import org.springframework.stereotype.Service;

@Service
public class WallpaperService {
    public int calculate (int roomLength, int roomWidth, int roomHeight, int rollWidth, int rollLength){
        int perimetr = roomLength*roomWidth;
        int wallpaperPiece = perimetr/rollWidth;
        int piecesInOneRoll = rollLength/roomHeight;
        int rollAmount = wallpaperPiece/piecesInOneRoll;


        return rollAmount;}


}
