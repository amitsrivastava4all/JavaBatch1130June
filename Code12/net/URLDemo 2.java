import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
	public static String getFileName(String urlValue){
		int index = urlValue.lastIndexOf("/");
		return urlValue.substring(index);
	}
	public static void download(String urlValue, String path) throws IOException{
		URL url  = new URL(urlValue);
		URLConnection connection = url.openConnection();
		connection.connect();
		String fileName = getFileName(urlValue);
		InputStream is = connection.getInputStream();
		int singleByte = is.read();
		FileOutputStream fs = new FileOutputStream(path+fileName);
		while(singleByte!=-1){
			fs.write(singleByte);
			//System.out.print((char)singleByte);
			singleByte = is.read();
		}
		System.out.println("Done...");
		is.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		download("https://i0.wp.com/www.latest-techtips.com/wp-content/uploads/2015/02/ICC-Cricket-WorldCup-2015-India-Team-HD-Wallpaper.png", "/Users/amit/Documents/FileOutput");

	}

}
