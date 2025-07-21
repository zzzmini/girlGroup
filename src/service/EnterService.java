package service;

import dto.Entertainment;
import dto.GirlGroup;

import java.util.ArrayList;
import java.util.List;

public class EnterService {
    private List<Entertainment> entertainments = new ArrayList<>();
    private List<GirlGroup> groups = new ArrayList<>();

    public List<Entertainment> getAllEntertainment() {
        System.out.println("[EnterService.getAllEntertainment]");
        return null;
    }

    public List<GirlGroup> getGroups(int enterId) {
        System.out.println("[EnterService.getGroups]");
        return null;
    }
}
