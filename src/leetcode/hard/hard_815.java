class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        Map<Integer,Set<Integer>>busstand=new HashMap<>();
        Map<Integer,Set<Integer>>bus=new HashMap<>();
        for(int i=0;i<routes.length;i++)
        {
           for(int ele:routes[i])
           {
               if(busstand.get(ele)==null)
               {
                  busstand.put(ele,new HashSet<>());  
               }
               if(bus.get(i)==null)
               {
                   bus.put(i,new HashSet<>());
               }
               busstand.get(ele).add(i);
               bus.get(i).add(ele);
           }
        }
        Queue<Integer>queue=new LinkedList<>();
        queue.add(source);
        Set<Integer>seen=new HashSet<>();
        seen.add(source);
        int count=0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            while(size>0)
            {
                source=queue.remove();
                if(source==target)
                {
                    return count;
                }
                for(int buses:busstand.get(source))
                {
                    Set<Integer>set=new HashSet<>(bus.get(buses));
                    for(int stations:bus.get(buses))
                    {
                        set.remove(stations);
                        if(!seen.contains(stations))
                        {
                            queue.add(stations);
                            seen.add(stations);
                        }
                    }
                    bus.put(buses,set);
                }
                size--;
            }
            count++;
        }
        return -1;
    }
