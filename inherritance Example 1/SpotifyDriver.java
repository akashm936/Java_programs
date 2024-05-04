class Spotify
{
    //this is a program for the inheritance between Company and song 
    //Spotify extends Song
    //SingleLevelInheritance
    String musicComposer;
    String musicDirector;
    String musicLabel;
    String musicCompany;
    String musicStudio;


    Spotify(String musicComposer,String musicDirector,String musicLabel,String musicCompany,String musicStudio)
    {

        super();
        this.musicComposer = musicComposer;
        this.musicDirector = musicDirector;
    	this.musicLabel = musicLabel;
    	this.musicCompany = musicCompany;
    	this.musicStudio = musicStudio;
    }

    public void displaySpotify(){
        
        System.out.println();
        System.out.println("********* Spotify Details ********");
        System.out.println();
    	System.out.println("Music Composer : " + this.musicComposer);
        System.out.println("Music Director : " + this.musicDirector);
    	System.out.println("Music Label : " + this.musicLabel);
    	System.out.println("Music Company : " + this.musicCompany);
    	System.out.println("Music Studio : " + this.musicStudio);

    }
}


class Song extends Spotify
{

    String songName;
	String singer; 
	String lyricsby;
	String type;
                
    Song(String musicComposer,String musicDirector,String musicLabel,String musicCompany,String musicStudio,String songName,String singer,String lyricsby,String type)
    {

        super(musicComposer,musicDirector,musicLabel,musicCompany,musicStudio);

    	this.songName = songName;
    	this.singer = singer;
    	this.lyricsby = lyricsby;
    	this.type = type;
    }

    public void displaySong(){
        
        System.out.println();
        System.out.println("**** Song Details ****");
        System.out.println();
    	System.out.println("Song Name : " + this.songName);
    	System.out.println("Singer Name : " + this.singer);
    	System.out.println("Song lyrics by : " +this.lyricsby);
    	System.out.println("Song Type : " +this.type);
    }
}

class SpotifyDriver{

	public static void main(String[] args) {
        

		Song obj = new Song("Vishal and Shekher","Vishal and Shekher","YRM","Yash Raj Films","YRF Studio","Bulleya","Papon","Irshad Kamil","Sad song");
	    obj.displaySpotify();
        obj.displaySong();
       
	    
	}
}