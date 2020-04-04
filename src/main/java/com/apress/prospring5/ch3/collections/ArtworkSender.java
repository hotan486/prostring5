package com.apress.prospring5.ch3.collections;

public interface ArtworkSender {
    void sendArtwork(String artworkPath, Recipient recipient);
    String getFriendlyName();
    String getShortName(); 
}
