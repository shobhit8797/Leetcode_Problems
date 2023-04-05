#User function Template for python3
class Solution:
    def countSpecialNumbers(self, N, arr):
        ans=0
        arr.sort()
        d={}
        for i in arr:
            d[i]=d.get(i,0)+1
        
        for i in range(N):
            if d[arr[i]]>1:
                ans+=1
            else:
                for j in range(i):
                    if arr[i]%arr[j]==0:
                        ans+=1
                        break
        return ans

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    
    T = int(input())
    while T > 0: 
        N=int(input())
        arr = [int(i) for i in input().split()]
        ob = Solution()
        print(ob.countSpecialNumbers(N, arr))
        
        T -= 1
# } Driver Code Ends