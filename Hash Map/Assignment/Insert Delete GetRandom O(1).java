class RandomizedSet {

    HashSet<String>set=new HashSet<>();// since values given is in 1s and 2s
	//so not get confused between  index i choose to store in form of strings
    List<Integer> l=new ArrayList<>();

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(set.contains(val+""))return false;
        set.add(val+"");
        l.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(set.contains(val+"")){
            
            l.remove(new Integer(val));
            set.remove(val+"");

            return true;
        }
        return false;
    }
    
    public int getRandom() {
       
        int r=(int)(Math.random()*set.size());
        return l.get(r);
        
    }
}
