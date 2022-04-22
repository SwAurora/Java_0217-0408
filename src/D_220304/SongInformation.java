package D_220304;

class Song
{
	String songname, genre;

	void set_Song(String _songname, String _genre)
	{
		songname = _songname;
		genre = _genre;
	}

	void print_song()
	{
		System.out.println("노래제목: " + songname + "(" + genre + ")");
	}
}

class Singer
{
	String singername;
	Song hitsong;// 객체를 저장할 수 있는 변수 생성

	void set_Singer(String _singername)
	{
		singername = _singername;
	}

	void hit_Song(Song song)
	{
		hitsong = song;
	}

	void print_singer()
	{
		System.out.println("가수이름: " + singername);
		hitsong.print_song();
	}

}

public class SongInformation
{
	public static void main(String[] args)
	{
		Song song = new Song();
		song.set_Song("취중진담", "발라드");

		Singer singer = new Singer();
		singer.set_Singer("김동률");

		singer.hit_Song(song);

		singer.print_singer();
	}
}