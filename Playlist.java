import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Playlist{
     static ArrayList<Album> albumList = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("legends");
        Album newAlbum = new Album("21");
        album.addSong("no woman no cry", 4.04);
        album.addSong("is this love", 3.52);
        album.addSong("get up stand up", 3.17);
        album.addSong("waiting in veins", 4.16);
        album.addSong("satisfy my soul", 3.47);
        album.addSong("one love", 2.52);


        newAlbum.addSong("someone like you", 4.47);
        newAlbum.addSong("rolling in the deep", 3.49);
        newAlbum.addSong("rumours has it", 3.43);
        newAlbum.addSong("turning tables", 4.10);
        newAlbum.addSong("dont't you remember", 4.03);
        newAlbum.addSong("set fire to the rain", 4.01);


        albumList.add(album);
        albumList.add(newAlbum);

         LinkedList<Song>playlist = new LinkedList<Song>();
        albumList.get(0).addSongToPlaylist("no woman no cry", playlist);
        albumList.get(1).addSongToPlaylist("someone like you", playlist);
        albumList.get(1).addSongToPlaylist("set fire to the rain", playlist);
        albumList.get(0).addSongToPlaylist("one love", playlist);

        albumList.get(1).addSongToPlaylist(2, playlist);

        play(playlist);

    }
    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit =false;
        boolean forward  =true;
        ListIterator<Song> i = playList.listIterator();
        if(playList.size()==0){
            System.out.println("no songs in a playlist");
        }
        else{
            System.out.println("now playing: "+i.next().toString());
            printInstruction();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("playlist completed");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(i.hasNext()){
                            i.next();
                        }
                        forward = true;
                    }
                    if(i.hasNext()){
                        System.out.println("now playing: "+i.next().toString());
                        break;
                    }
                    else{
                        System.out.println("At the end of the list");
                        forward = false;
                        break;
                    }
                case 2:
                    if(forward){
                        if(i.hasPrevious()){
                            i.previous();
                        }
                        forward = false;
                    }
                    if(i.hasPrevious()){
                        System.out.println("now playing :"+i.previous().toString());
                        break;
                    }
                    else{
                        System.out.println("At the start of the list");
                        forward = true;
                        break;
                    }
                case 3:
                    if(forward){
                        if(i.hasPrevious()){
                            System.out.println("now playing:"+i.previous().toString());
                            forward= false;
                            break;
                        }
                        else{
                            System.out.println(" start of the list.");
                            break;
                        }
                    }
                    else{
                        if(i.hasNext())
                        {
                            System.out.println("now playing:"+i.next().toString());
                            forward = true;
                            break;
                        }
                        else{
                            System.out.println(" end of the list.");
                            break;
                        }
                    }
                case 4:
                    printSong(playList);
                    break;
                case 5:
                    printInstruction();
                    break;
                default:
                    quit =true;
            }
        }
        scanner.close();

    }
    private static void printSong(LinkedList<Song>playlist){
        Iterator<Song> i = playlist.iterator();
        int count =1;
        while(i.hasNext()){
            Song song = i.next();
            System.out.println("["+count+"] "+song.getTitle());
            count++;
        }
    }
                          
    private static void printInstruction() {
        System.out.println("\n press");
        System.out.println("0: to quit ");
        System.out.println("1: to play the next song ");
        System.out.println("2: to play the privious song");
        System.out.println("3: to play the current song");
        System.out.println("4: show songs list in the playlist");
        System.out.println("5: to show the available action");

    }


}

class Album{
    private String name;
     private ArrayList<Song> songList ;
    //cunstructor;
    public Album(String name){
        this.name = name;
        this.songList = new ArrayList<Song>();
    }
    //getters
    public String getAlbumName() {
        return this.name;
    }
    public ArrayList<Song> getAlbum(){
        return this.songList;
    }
    //add song to album
    public boolean addSong(String title, double duration){
        Song song = findSong(title);
        if(song!=null){
            System.out.println(song.getTitle()+" song is already in list:");
            return false;
        }
        else{
            Song newSong = Song.createSong(title, duration);
            this.songList.add(newSong);

            return true;
        }
    }
    public boolean addSongToPlaylist(int trackNumber , LinkedList<Song> playlist) {
        int index = trackNumber-1;
        if(index>=0 && (index <= this.songList.size())){
            playlist.add(this.songList.get(index));
            return true;
        }
        else{
            System.out.println("song with track number: "+trackNumber+" not found");
            return false;
        }

    }
    public boolean addSongToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        else{
            System.out.println("song with title: "+title+" not found");
            return false;
        }
    }
    //find song
    public Song findSong(String title){
        //sortcuts-->insteed of traditional looping method.
        for(Song checkSong: this.songList)
        {
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }
}

class Song{
    private String title;
    private double duration;
    //cuntructor.
    public Song(String title, double duration){
        this.title = title;
        this.duration =duration;
    }
    //getters.
    public String getTitle() {
        return this.title;
    }
    public double getDuration() {
        return this.duration;
    }
    //create song
    public static Song createSong(String title, double duration) {
        return new Song(title, duration);
    }
    @Override
    public String toString(){
        return this.title+": "+this.duration;
    }
}