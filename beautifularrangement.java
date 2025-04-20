public class beautifularrangement{
    int count=0;
    public int countArrangement(int N){
        boolean [] visited =new boolean[N+1];
        calculate(N,1,visited);
        return count;
    }
    public void calculate(int N, int pos, boolean[] visited){
        // Base case
        if(pos>N){
            count++;
            return;

        }

        for(int i=1; i<=N; i++){
            if(!visited[i] && (pos%i==0 || i%pos==0)){
                visited[i]=true;
                calculate(N,pos+1, visited);
                visited[i]=false;
            }
        }
    }
    
}
