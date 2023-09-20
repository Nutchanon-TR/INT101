package StarterPack_testOOP.SongSystem;
public class Song {
     private String title;
     private String artist;
     private int duration;
     private boolean isLike;

     public Song(String title, String artist, int duration, boolean isLike) {
          this.title = title;
          this.artist = artist;
          this.duration = duration;
          this.isLike = isLike;
     }

     public String getTitle() {
          return title;
     }

     public String getArtist() {
          return artist;
     }

     public int getDuration() {
          return duration;
     }

     public boolean isLike() {
          return isLike;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public void setArtist(String artist) {
          this.artist = artist;
     }

     public void setDuration(int duration) {
          this.duration = duration;
     }

     public void setLike(boolean like) {
          isLike = like;
     }

     public void addToFavorite() {        
          if (this.isLike) {
               System.out.println(getTitle() + " is disliked.");            
               this.isLike = false;        
          } else {            
               System.out.println(getTitle() + " is liked.");            
               this.isLike = true;        
          }    
     }

     public String getFormattedDuration() {        
          int min = getDuration() / 60; //194        
          int sec = getDuration() % 60;        
          return min + " minutes " + sec + " seconds";    
     }    
     
     public boolean isSameArtist(Song song) {        
          return getArtist().equals(song.getArtist()); // 1 == 1    
     }    public void isFavorite() {        
          if (this.isLike) {            
               System.out.println(getTitle() + " is liked.");        
          } 
          else {            
               System.out.println(getTitle() + " is disliked.");        
          }    
     }
}