/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directories;
import Classes.*;

import Classes.Person;
import java.util.ArrayList;

/**
 *
 * @author ashit
 */
public class CommunityDirectory {
    private ArrayList<Community> communityDirectory;

    public CommunityDirectory() {
        this.communityDirectory = new ArrayList<Community>();
    }
  
    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
    
     public Community addNewCommunity(Community community ) {
        communityDirectory.add(community);
        return community;      
    }
     
    public void removeCommunity(Community community){
        communityDirectory.remove(community);
    }
    
}
