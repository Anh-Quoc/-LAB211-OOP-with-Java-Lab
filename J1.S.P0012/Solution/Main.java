import java.util.*;

class Main{
	public static void main(String[] args) {
		
	}
}

// ------------------------------------------------------
// Not finish!
// ------------------------------------------------------

class FuCached{
	private Object data;
	private Date expiredDate;

}

class FuMemoryCached{
	static HashMap<String, FuCached> cached;

	public boolean putObject(String key, Object object, int timeToLive){
		return true;
	}
	public static Object getObject(String key){
		Object a = new Object();
		return a;
	}
	public static boolean clean(String key){
		cached.remove(key);
		return true;
	}
	public static boolean cleanAll(){
		cached.clear();
		return true;
	}
}