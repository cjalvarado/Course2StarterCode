package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

    // TODO: Add member variables and a constructor
	private LinkedList<String> dict;
	
	public DictionaryLL()
	{
		dict = new LinkedList<String>();
	}

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
        String toAdd = word.toLowerCase();
        if (dict.contains(toAdd)) return false;
        dict.add(toAdd);
        return true;
    	// TODO: Implement this method
        //return false;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
    	return dict.size();
        // TODO: Implement this method
        //return 0;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	String toCheck = s.toLowerCase();
    	return dict.contains(toCheck);
    	
        //TODO: Implement this method
        //return false;
    }

    
}
