package StarterPack_testOOP.SongSystem;
public class TestSong {    
     public static void main(String[] args) {        
          Song s1 = new Song("Test1", "Boss", 230, false);        
          Song s2 = new Song("Test2", "Ken", 196, true);        
          System.out.println(s1.getTitle());        
          System.out.println(s1.getArtist());       
          System.out.println(s1.getDuration());        
          System.out.println(s1.isLike());        
          System.out.println(s1.isSameArtist(s2));        
          s1.addToFavorite();        
          s1.isFavorite();    
     }
}