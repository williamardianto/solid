package i.after.dvd;

import i.after.LibraryItem;

import java.util.List;

public interface DVD extends LibraryItem {
    List<String> getActors();

    int getRuntimeInMinutes();
}
