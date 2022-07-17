
public int linearSearch(int value, ArrayList<Integer> data) {
    // what is foundIndex used for in this program
    int foundIndex = -1;

    for (int i=0; i < data.size(); i++) {
      // how does data.get(i) work 
      int element = data.get(i);

      // What is the program checking?
      if (element == value) {
        foundIndex = i;
        break;
        }
      }
    return foundIndex; //what will be returned?
  }