
public class EllysDirectoryListing {
	
	public String[] getFiles(String[] files) {
		int n = files.length;

		if(isDone(files))
			return files;

		int loc = 0;
		for(loc=0; loc<n-1; loc++)
			if(files[loc].equals(".") || files[loc].equals(".."))
				break;

		String temp = files[n-1];
		files[n-1] = files[loc];
		files[loc] = temp;

		if(isDone(files))
			return files;

		for(loc=0; loc<n-1; loc++)
			if(files[loc].equals(".") || files[loc].equals(".."))
				break;

		temp = files[n-2];
		files[n-2] = files[loc];
		files[loc] = temp;


		return files;
	}

	public boolean isDone(String[] files){
		String x=files[files.length-1];
		String y=files[files.length-2];

		if((x.equals(".") && y.equals("..")) || (x.equals("..") && y.equals(".")))
			return true;
		else
			return false;
	}
}
